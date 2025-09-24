package Student;

import java.util.Scanner;

class StudentMain implements Operations{
	int i; string name, id, branch, password;
	Scanner s = new Scanner(System.in);
	
	public void registrer(Student std){
		
		System.out.println("Enter the Student ID: ");
		id = s.nextLine();
		std.getID(id);
		
		System.out.println("Enter the Student Branch: ");
		Branch = s.nextLine();
		std.getBranch(Branch);
		
		System.out.println("Enter the password: ");
		password = s.nextLine();
		std.getPassword(password);
		System.out.println(std.getDetails);
		try(
		Bufferwriter writer = new Bufferwriter()
		)
	}
	
	public void login(String id, String password){
	
	}
	
	public void exit(){
	
	}
	public static void main(String...args){
		System.out.println("==================================================\n WELCOME TO SMS\n==================================================");
		int i;
		
		while(true){
			
		}
			
	}
}






































