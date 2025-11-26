import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P1 extends JFrame{  
	Label l;
	
	Lab9P1(){
		super("Tabbedpane Demo");
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		
		
		jtp.add("Tab 1", new Label("Tabbed Pane 1"));
		jtp.add("Tab 2", new Label("Tabbed Pane 2"));
		jtp.add("Tab 3", new Label("Tabbed Pane 2"));
		
		add(jtp);
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P1();
	}
}

