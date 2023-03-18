package practical;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
public class Lab10_JComboBox extends JFrame {
    
    JComboBox<String> comboBox;
    JList<String> list;
    JLabel printlbl;
    
    public Lab10_JComboBox() {
        setTitle("Combo Box and List Example");
        setLayout(new FlowLayout());
        printlbl = new JLabel();
        // Create a combo box
        String[] country = {"Nepal", "India", "China", "Indonesia", "Thailand", "Japan"};
        comboBox = new JComboBox<String>(country);
        comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = comboBox.getSelectedItem().toString();
				printlbl.setText(item);
			}
		});
        //List
        list = new JList<String>(country);
        
        add(comboBox);
        add(list);
        add(printlbl);
        
        // Set the frame size and show it
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Lab10_JComboBox();
    }
}


