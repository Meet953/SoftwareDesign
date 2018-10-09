import java.io.Serializable;

public class BoatClub {

	
	int total_boats, boats_hired;
	
	public BoatClub(int t) {
		total_boats = t;
		boats_hired = 0;
		// TODO Auto-generated constructor stub
	}
	
	
	boolean loan() {
		if(boats_hired < total_boats)
		{
			boats_hired++;
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	boolean bring_back() {
		
		if(boats_hired > 0)
		{
			boats_hired--;
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	int read_available() {
		return (total_boats - boats_hired);
		
	}
	
	void print_details() {
		
		System.out.println("Total : " + total_boats);
		System.out.println("Hired : " + boats_hired);
		
	}
	
	
}
