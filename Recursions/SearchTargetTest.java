
public class SearchTargetTest {

    public static boolean searchTarget(int val,int t){
    	 
    	if(val < 10) {
    		if(val == t) 
    			return true;
    		else
    			return false;
    	}
    	
    	else {
    		
    	
    	int rest = val/10;
    	int last = val%10;
    	System.out.println(last+","+t);
    	if(last == t) 
    		return true;
    	else
		return searchTarget(rest, t);
    	
    	}
    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ searchTarget(number,target));
    }
}

