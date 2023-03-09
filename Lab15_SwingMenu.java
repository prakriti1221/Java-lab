package practical;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class Lab15_SwingMenu extends JFrame{
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem save, open, exit, paste, copy;
	JCheckBoxMenuItem status;
	JRadioButtonMenuItem radio;
	
	public Lab15_SwingMenu() {
		
		setTitle("Menus in Swing - Prakriti Paudel ");
		setSize(400, 400);
		
		bar = new JMenuBar();
		
		file = new JMenu("FILE");
		file.setMnemonic('F');
		edit = new JMenu("EDIT");
		edit.setMnemonic('E');
		view = new JMenu("VIEW");
		view.setMnemonic('V');

		save = new JMenuItem("Save");
		open = new JMenuItem("Open");
		exit = new JMenuItem("Exit", KeyEvent.VK_X);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		
		status = new JCheckBoxMenuItem("Status");
		radio = new JRadioButtonMenuItem("Radio");
		
		// adding menu
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		
		// adding menu items
		
		file.add(save);
		file.add(open);
		file.add(exit);
		
		// adding view items
		view.add(status);
		view.add(radio);
		
		// adding edit items
		edit.add(copy);
		edit.add(paste);
	
		setJMenuBar(bar);
		
		setVisible(true);		
}
	
	public static void main(String[] args) {
		new Lab15_SwingMenu();
		
	}
}
