package eventhandling;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Lab12_JProgressBar extends JFrame {
	JProgressBar bar;
	JButton btn;

	public Lab12_JProgressBar() {
		setSize(400, 400);
		setTitle("Progress Bar");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));

		btn = new JButton("Click");
		bar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		bar.setStringPainted(true);
		btn.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				count = count + 5;
				if (count == 100)
					bar.setString("Done");
				else
					bar.setValue(count);

			}
		});

		add(btn);
		add(bar);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Lab12_JProgressBar();
	}

}
