package practical;

import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample {
    
    public static void main(String[] args) {
        // create a frame to hold a button
        Frame frame = new Frame("Mouse Adapter Example");
        Button button = new Button("Click me!");
        frame.add(button);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // add a mouse listener to the button using a MouseAdapter
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }
}
