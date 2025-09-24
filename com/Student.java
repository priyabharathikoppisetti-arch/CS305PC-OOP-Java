//Encapsulation and Inheritance

package Student;

class Student extends Person{
	private String id, name, branch, password;
	Student(String name){
		super(name);
		this.name = name;
	}
	public void getID(String id){
		this.id = id;
	}
	public void getBranch(String branch){
		this.branch = branch;
	}
	public void getPassword(String password){
		this.password = password;
	}
	
	@Override
	public String getDetails(){
		return(id + "," + name + "," + branch + "," + password);
	}
}
