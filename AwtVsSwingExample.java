package practical;

import java.awt.*;
import javax.swing.*;

public class AwtVsSwingExample {
    public static void main(String[] args) {
        // AWT example
        Frame awtFrame = new Frame("AWT Frame");
        Button awtButton = new Button("AWT Button");
        awtFrame.add(awtButton);
        awtFrame.pack();
        awtFrame.setSize(300,300);
        awtFrame.setVisible(true);
        
        // Swing example
        JFrame swingFrame = new JFrame("Swing Frame");
        JButton swingButton = new JButton("Swing Button");
        swingFrame.add(swingButton);
        swingFrame.pack();
        swingFrame.setSize(300,300);
        swingFrame.setVisible(true);
        swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

