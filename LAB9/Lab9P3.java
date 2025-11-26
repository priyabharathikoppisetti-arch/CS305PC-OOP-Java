import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class Lab9P3 extends JFrame{  
	Label l;
	
	Lab9P3(){
		super("TREE Demo");
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits"); 
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple"); 
		root.add(new DefaultMutableTreeNode("Apple"));
		root.add(new DefaultMutableTreeNode("Banana"));
		root.add(new DefaultMutableTreeNode("Mango"));
		root.add(new DefaultMutableTreeNode("Kiwi"));
		root.add(new DefaultMutableTreeNode("Orange"));
		root.add(new DefaultMutableTreeNode("Papaya"));
		
		apple.add(new DefaultMutableTreeNode("Green Apple"));
		apple.add(new DefaultMutableTreeNode("Red Apple"));
		apple.add(new DefaultMutableTreeNode("Ice Apple"));
		
		root.add(apple);
		
		DefaultMutableTreeNode sd = new DefaultMutableTreeNode("Soft Drinks"); 
		sd.add(new DefaultMutableTreeNode("Sprite"));
		sd.add(new DefaultMutableTreeNode("Coke"));
		sd.add(new DefaultMutableTreeNode("Pepsi"));
		sd.add(new DefaultMutableTreeNode("Maaza"));
		root.add(sd);
		JTree jt = new JTree(root);
		
		add(jt);
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P3();
	}
}

