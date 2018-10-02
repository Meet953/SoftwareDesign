
public class AddEvenTest {

	
	
    public static int addEven(int value){
    		
    	if(value<10) return value;
    	System.out.println(value + "|" + value%10 + "|" + value/10 );
    	 
    	return value%10 + addEven(value/10);
   	 
    	 
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
}

