
public class CountTargetTest {

    public static int countTarget(int val,int t){
    	
    	if(val < 10) {
    	
    		if(val == t) {
    			return 1;
    		}
    		else
    			return 0;
    	}
    	
    	else {
    		int rest = val/10;
    		int rem = val%10;
    		if(rem == t) {
    			return 1 + countTarget(rest, t);
    		}
    		else {
    			return 0 + countTarget(rest, t);
    		}
    	}
    	
    	 
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ countTarget(number,target));
    }
}

