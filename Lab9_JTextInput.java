package eventhandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Lab9_JTextInput extends JFrame implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel namelbl, passwordlbl, textArealbl;
	JTextField nameField;
	JPasswordField passwordField;
	JTextArea textArea;
	JButton submitButton;

	public Lab9_JTextInput() {
		frame = new JFrame("JTextInput Example");
		panel = new JPanel();
		
		namelbl = new JLabel("Name:");
		passwordlbl = new JLabel("Password:");
		textArealbl = new JLabel("TextArea:");
		nameField = new JTextField(20);
		passwordField = new JPasswordField(20);
		textArea = new JTextArea(5, 20);
		submitButton = new JButton("Submit");

		// add action listener to submit button
		submitButton.addActionListener(this);

		// add components to panel
		panel.add(namelbl);
		panel.add(nameField);
		panel.add(passwordlbl);
		panel.add(passwordField);
		panel.add(textArealbl);
		panel.add(textArea);
		panel.add(submitButton);

		// add panel to frame
		frame.getContentPane().add(panel);

		// set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,500);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			String name = nameField.getText();
			String textarea = textArea.getText();
			// do something with the user input, e.g. save to a file or database
			JOptionPane.showMessageDialog(frame,
					"Name: " + name + "\nComment: " + textarea);
		}
	}

	public static void main(String[] args) {
		new Lab9_JTextInput();
	}
}
