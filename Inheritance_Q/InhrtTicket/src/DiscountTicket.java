
public class DiscountTicket extends Ticket{

	int discount;
	
	public DiscountTicket(int p, String s, String e, int d) {
		
		super(p,s,e);
		this.discount = d;
		// TODO Auto-generated constructor stub
	}

	public void setDiscount(int i) {
		// TODO Auto-generated method stub
		this.discount = i;
		
	}

	public int grossPrice() {
		// TODO Auto-generated method stub
		return price-discount;
	}

}
