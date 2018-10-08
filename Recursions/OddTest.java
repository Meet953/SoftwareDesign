
public class OddTest {

	
    public static int countOdd(int v){
    
    	
    	if(v < 10) {
    		if(v %  2 != 0) {
    			return 1;
    		}
    		else {
    			return 0;
    		}
    	}
    	else {
    		int rest = v/10;
    		int last= v%10;
    		if(last%2 != 0)
    			return 1 + countOdd(rest);
    		else 
    			return 0 + countOdd(rest);
    		
    	}
    }
    
    
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
      System.out.println("Res= "+ countOdd(number));
    }
}

