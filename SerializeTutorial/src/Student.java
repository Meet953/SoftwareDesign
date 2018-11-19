import java.io.Serializable;

public class Student implements Serializable{

	
	String firstName, lastName;
	int age;
	
	public Student() {
		firstName = "Default";
		lastName = "Default";
		age = 0;
	}
	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public void setFirstName(String first) {
		this.firstName = first;
		// TODO Auto-generated method stub
		
	}
	
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	public void setLastName(String last) {
		
		// TODO Auto-generated method stub
		this.lastName = last;
		
	}
	

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
		
	}

	 

}
