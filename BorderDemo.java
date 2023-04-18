package practical;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class BorderDemo extends JFrame {
    
    public BorderDemo() {
         JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
         setSize(500, 500);

         // create borders
         Border emptyBorder = BorderFactory.createEmptyBorder();
         Border lineBorder = BorderFactory.createLineBorder(Color.pink);
         Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
         Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
         Border etchedBorder = BorderFactory.createEtchedBorder();
         
         Border matteBorder = BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red);

         // add borders to labels
         JLabel label1 = new JLabel("Empty Border");
         label1.setBorder(emptyBorder);
         JLabel label2 = new JLabel("Line Border");
         label2.setBorder(lineBorder);
         JLabel label3 = new JLabel("Raised Bevel Border");
         label3.setBorder(raisedBevelBorder);
         JLabel label4 = new JLabel("Lowered Bevel Border");
         label4.setBorder(loweredBevelBorder);
         JLabel label5 = new JLabel("Etched Border");
         label5.setBorder(etchedBorder);
         JLabel label6 = new JLabel("Matte Border");
         label6.setBorder(matteBorder);



         // add labels to panel
         panel.add(label1);
         panel.add(label2);
         panel.add(label3);
         panel.add(label4);
         panel.add(label5);
         panel.add(label6);
         
         setTitle("Border Example");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         add(panel);
         setVisible(true);
     }

    public static void main(String[] args) {
        new BorderDemo();
    }
}
