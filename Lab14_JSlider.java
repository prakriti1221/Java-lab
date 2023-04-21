package eventhandling;

import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Lab14_JSlider extends JPanel{
    JSlider slider;
    JTextField values;

    public Lab14_JSlider(){
        slider = new JSlider(0,100,30);
        slider.setMajorTickSpacing(20);//major = 20 units
        slider.setMinorTickSpacing(5);//minor = 5 units
        slider.setPaintTicks(true);//shows major and minor ticks
        slider.setPaintLabels(true);//default numeric labels 10-100
        slider.setSnapToTicks(true);//moves to the nearest tick i.e. minor
        Dictionary<Integer, Component> labeltbl = new Hashtable<Integer,Component>();
        labeltbl.put(0, new JLabel("a"));
        labeltbl.put(20, new JLabel("b"));
        labeltbl.put(40, new JLabel("c"));
        labeltbl.put(60, new JLabel("d"));
        labeltbl.put(80, new JLabel("e"));
        labeltbl.put(100, new JLabel("f"));
        slider.setLabelTable(labeltbl);
//        slider.setInverted(true);
        values = new JTextField(20);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                values.setText(String.valueOf(slider.getValue()));
            }
        });
        add(slider);
        add(values);
    }

    @SuppressWarnings("static-access")
	public static void main(String[] args) {
    	Lab14_JSlider panel = new Lab14_JSlider();
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.add(panel);
        frame.setVisible(true);
        frame.setTitle("JSliders");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
