







	public class TicketTest{
	public static void main(String [] args)
	{
		 int price=Console.readInt("Enter Price:");
		 int disc=Console.readInt("Enter Discount:");
		 
		DiscountTicket dc=new DiscountTicket(48,"D23","Declan Nerny",5);
                dc.setPrice(price);
                int res1=dc.readPrice();
                System.out.println("Price= "+res1);
                dc.setDiscount(disc);
                int res2=dc.grossPrice() ;
                System.out.println("Gross Price= "+res2);


	}

	}