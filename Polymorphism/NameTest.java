class Name
    {
        String value;
        
        Name(String v){
        	value = v;
        }
        
       public void print() {
    	   System.out.println(value);
       }
       
       public void resetNamet(String v) {
    	   value = v;
       }
        
    }

 class UnderLine extends Name {

	UnderLine(String v) {
		super(v);
	}
	
	public void print() {
 	   super.print();
 	  for(int i=0;i<value.length();i++) {
 		 System.out.print('-');
 	  }
    }

}
 
 class UpperCase extends Name {

	 UpperCase(String v) {
		super(v);
	}

	 public void print() {
  	   System.out.print(value.toUpperCase());
     }
	 
}
 
 
 

public class NameTest {

	public static void main(String[] args) {
        	Name[] list=new Name[4];
        	list[0]= new Name("Athy");
        	list[1]= new UnderLine("Bally");
        	list[2]= new UpperCase("Cork");
        	list[3]= new UnderLine("Derry");
        
		for(int i=0;i<list.length;i++){
			list[i].print();
			System.out.println();
		}  
	}
}
