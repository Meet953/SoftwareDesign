
public class MaxTest {

	static int maxim = 0;
	
    public static int max(int val){
    	
    	if(val<10) {
    		
    		/*if(val > maxim) {
    			maxim = val;
    		}
    		return maxim;*/
    		
    		return val;
    	}
    	
    	else {
    		
    	
    	int rest = val/10;
    	int last = val%10;
    	
    	/*if(last > maxim) {
    		maxim = last;
    	}
    	
    	return max(rest);
    	*/
    	
    	
    	if(last > max(rest)) return last;
    	else return max(rest);
    	
    	}
    	
    }
    
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ max(number));
    }
}

