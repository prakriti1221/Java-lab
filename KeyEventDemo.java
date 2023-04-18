import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class KeyEventDemo extends JFrame implements KeyListener{
	JLabel firstlbl, secondlbl, inputlbl, outputlbl;
	JTextField firsttxt, secondtxt, inputtxt, outputtxt;

	public KeyEventDemo() {
		setTitle("Keyevent frame");
		setSize(300, 300);
		setLayout(new GridLayout(4, 2, 5, 5));
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		inputlbl = new JLabel("Input");
		outputlbl = new JLabel("Output");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		
		inputtxt = new JTextField(20);
		inputtxt.addKeyListener(this);
		outputtxt = new JTextField(20);
		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(inputlbl);
		add(inputtxt);
		add(outputlbl);
		add(outputtxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new KeyEventDemo();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		int x = Integer.parseInt(firsttxt.getText());
		int y = Integer.parseInt(secondtxt.getText());
		int result;
		switch (e.getKeyChar()) {
		case 'a':
			result = x + y;
			break;
		case 's':
			result = x - y;
			break;
		case 'm':
			result = x * y;
			break;
		case 'd':
			result = x / y;
			break;
		case 'r':
			result = x % y;
			break;
		default:
			result = 0;
		}
		outputtxt.setText(String.valueOf(result));
		
	}

}
