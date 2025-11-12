import java.awt.event.*;
import java.awt.*;
class LAB7p1{
	public static void main(String...args){
	final int[] a = {0};
		Button b = new Button("click");
		//b.setLable("click");
		b.setBounds(80,30,80,30);
		
		Frame f = new Frame();
		GridLayout fl = new GridLayout(3,2);
		f.setLayout(fl);
		f.setSize(500,500);
		f.setVisible(true);
		TextField tf = new TextField(100);
		//tf.setColumn(50);
		Label l = new Label();
		l.setPreferredSize(new Dimension(100,100));
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				l.setText(tf.getText());
				System.out.println(tf.getText() + "-" + a[0]);
				a[0]++;
				
			}
		});
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we){
				f.dispose();
			}
		});
		f.add(tf);
		f.add(b);
		f.add(l);
		f.setTitle("EVENT HANDLING");
	}
}


