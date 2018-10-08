
public class AddEvenTest {

	static int rem, qut, sum = 0;
	
	
	
    public static  int addEven(int v){
    	
    		 
    	if(v < 10)
    	{       
    		if(v % 2 == 0) 
        		return v;
    		else
    			return 0;
        	
    	}
    	else {
    		
    		int rest = v/10;
    		int last= v%10;
    		if(last%2==0)
    			return last + addEven(rest);
    		else
    			return 0 + addEven(rest);
    	}
    	
    	
    	
    	
    	
    }
    public static void main(String[] args) {
    
    	
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
}

