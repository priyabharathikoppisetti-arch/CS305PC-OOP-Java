import java.util.Scanner;
class Lab2P2{
	public static void main(String...args){
	  Scanner s = new Scanner(System.in);
	  int a = s.nextInt();
	  int y = a;
	  
	  System.out.println("output is :"+ ((a++) + (++a)));
	  a = y;
	  System.out.println("output is :"+ (a++) + " " + (++a));
	  a = y;
	  System.out.println(((a++) + (++a)) + " : output is.");
	}
}
