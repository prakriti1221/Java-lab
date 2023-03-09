package practical;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

@SuppressWarnings("serial")
public class Lab11_JTreeJTable extends JFrame{
	JTree tree;
	JTable table;
	
	public Lab11_JTreeJTable() {
		
		setTitle("JTree and JTable - Prakriti Paudel");
		setSize(500, 300);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// JTree Implementation
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode veg = new DefaultMutableTreeNode("Vegetables");
		DefaultMutableTreeNode fruit = new DefaultMutableTreeNode("Fruits");
		root.add(veg);
		root.add(fruit);
		DefaultMutableTreeNode potato = new DefaultMutableTreeNode("Potato");
		DefaultMutableTreeNode tomato = new DefaultMutableTreeNode("Tomato");
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple");
		DefaultMutableTreeNode banana = new DefaultMutableTreeNode("Banan");
		DefaultMutableTreeNode strawberry = new DefaultMutableTreeNode("Strawberry");
		veg.add(potato);
		veg.add(tomato);
		fruit.add(apple);
		fruit.add(banana);
		fruit.add(strawberry);
		tree = new JTree(root);
		
		// JTable Implementation
		String[] heading = {"Name", "Address", "Age"};
		String[][] data = {
				{"Prakriti Paudel", "Banasthali", "22"}, 
				{"Swikriti Paudel", "Patan", "20"},	
				{"Suchee Singh", "Maitidevi", "23"}, 
				{"Grishma Sakhakarmi", "Bhaktapur", "21"}			
			};
		table = new JTable(data, heading);
		JScrollPane pane = new JScrollPane(table);
				
		add(pane);
		add(tree);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Lab11_JTreeJTable();
	}
}
