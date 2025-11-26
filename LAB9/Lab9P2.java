import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P2 extends JFrame{  
	
    Lab9P2(){
        super("Table Demo");

        String[] heading = {"Name","Course","RollNo."};
        String[][] data = {
            {"Priya","CSE","05F9"},
            {"Vani","CSE","0521"},
            {"Moksha","CSE","05F3"},
            {"Ananya","CSE","05D2"},
            {"Manjula","CSE","05J1"},
            {"Anu","CSO","04T1"},
            {"Anitha","ECE","03E1"},
            {"MANISHA","CSD","01E3"},
            {"KAVYA","CSM","02G4"},
            {"JUNE","CSM","2345"},
            {"JULLY","CSE","0529"},
            {"EMMA","CSM","02FS"},
            
        };

        JTable jt = new JTable(data, heading);

        add(new JScrollPane(jt));

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String...args){
        new Lab9P2();
    }
}

