import java.awt.*;
import java.awt.event.*;

class Lab8P1 extends Frame implements ActionListener{
	Label l;
	Lab8P1(){
		super("Demonstarion of MenuBar");
		MenuBar mb = new MenuBar();
		BorderLayout bl = new BorderLayout();
		setMenuBar(mb);
		setLayout(bl);

		l = new Label();
       		l.setFont(new Font("Arial",Font.BOLD,40));
       		l.setAlignment(Label.CENTER);
       		add(l, bl.CENTER);	
		String[] menus = {"File","Edit","Help"};
		String[][] mi = {
			{"Open","Save","Close"},
			{"Cut","Copy","Paste"},
			{"Update","About", "License"}
		};
		int x=0 , y = 0;

		for(String s : menus){
			y=0;
			Menu m = new Menu(s);
			
			for(int i = 0; i <3 ; i++){
				MenuItem mm = new MenuItem(mi[x][y]);
				mm.addActionListener(this);
				m.add(mm);
				y++;
			}
			x++;
			mb.add(m);
		}
		
		setSize(400 , 400);
		setVisible(true);
		add(l);
		addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent we){
			dispose();
		    }
		});

	}
	public void actionPerformed(ActionEvent ae) {
       		String mstr = ae.getActionCommand();
       		if(mstr.equals("Close")){
       		System.exit(0);
       		}else {
       			
       			l.setText(mstr);
       		}
    }
	public static void main(String...args){
		new Lab8P1();
	}
}








