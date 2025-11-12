import java.awt.event.*;
import java.awt.*;
class LAB7P2 implements ActionListener{
	Button b = new Button("click");
	Frame f = new Frame();
	GridLayout fl = new GridLayout(3,2);
	TextField tf = new TextField(100);
	Label l = new Label();
	int a = 1;
	LAB7P2(){
	
		
		//b.setLable("click");
		b.setBounds(80,30,80,30);
		
		f.setLayout(fl);
		
		f.setSize(500,500);
		f.setVisible(true);
	
		l.setPreferredSize(new Dimension(100,100));
	
		b.addActionListener(this);
		
		f.add(tf);
		f.add(b);
		f.add(l);
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we){
				f.dispose();
			}
		});
		f.setTitle("EVENT HANDLING");
	}
	
	public void actionPerformed(ActionEvent ae){
				l.setText(tf.getText());
				System.out.println(tf.getText() + "-" + a);
				a++;
	}
	
	
	public static void main(String...args){
	 new LAB7P2();
	
	}
}
 




