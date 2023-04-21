package practical;

import java.awt.*;
import java.awt.event.*;

public class FocusListenerExample {
    
    public static void main(String[] args) {
        // create a frame to hold a text field
        Frame frame = new Frame("Focus Listener Example");
        TextField textField = new TextField(20);
        frame.add(textField, BorderLayout.NORTH);
        frame.setSize(400, 200);
        frame.setVisible(true);
        
        // add a focus listener to the text field
        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("Text field gained focus");
            }
            
            public void focusLost(FocusEvent e) {
                System.out.println("Text field lost focus");
            }
        });
    }
}
