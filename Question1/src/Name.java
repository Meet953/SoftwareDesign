
public class Name {

	String name,  surname;
	
	public Name(String n, String s) {
		// TODO Auto-generated constructor stub
		name = n;
		surname = s;
	}

	public String readFirst() {
		// TODO Auto-generated method stub
		return name;
	}

	public String readSurname() {
		// TODO Auto-generated method stub
		return surname;
	}

	public void updateFirst(String s) {
		// TODO Auto-generated method stub
		name = s;
		
	}

	public void updateSurname(String s) {
		// TODO Auto-generated method stub
		surname = s;
	}

	public void printFullName() {
		// TODO Auto-generated method stub
		System.out.println("Name = " + name + " " + surname);
	}

	public void updateFullName(String name) {
		// TODO Auto-generated method stub
		 
		String fullname = name.trim();
		int ind = fullname.indexOf(' ');
		
		
		String first = fullname.substring(0, ind);
		String last = fullname.substring(ind+1);
		
		updateSurname(last);
		updateFirst(first);
	}

}
