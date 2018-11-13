

class MyArrayList{
        private Node[] head;
        private int max;
        private int count;
	  public  MyArrayList(int max){
	    	 this.max=max;
	    	 count=0;
	    	 head=new Node[max];}
        public  boolean insert(String s1,int a)
	        {      if (count<max){
	        	        Node temp =new Node(s1,a);
	                    head[count]=temp;
	                    count++;
	                    return true;}
	               else  return false;}	
       public  String youngest()
        {     int res=900;
              String name="BLANK";
              for(int i=0;i<count;i++){
      	           Node temp=head[i];
      	           if (temp.readage()<res){
                            name=temp.readname();
      		                res=temp.readage();}
                   }
              return name  ; 
        }               
       
   	public String delete_last() {
		// TODO Auto-generated method stub
		
		int index = count - 1;
		String res = head[index].readname();
		head[index] = null;
		count--;
		return res;
	}

       		public  boolean search(String s1)
	        {     boolean res=false;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(s1)){
	            		  res=true;
	            	  }
	              }
                     return res; 
	             }                                 

       	     public void printlist()
	                        {
		               Node temp;;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			         for(int i=0;i<count;i++) {
			        	   temp = head[i];
			               temp.print();}
			               
			          System.out.print("NULL");   
			               
           }
			public int seachAgeFirst(String name) {
				// TODO Auto-generated method stub
				int age = 0;
				 for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(name)){
	            		  age=temp.readage();
	            		  break;
	            	  }
	              }
                    return age; 
				 
			}
			public String oldest() {
				// TODO Auto-generated method stub
				String old  = ""; int oldage = 0;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readage() > oldage){
	            		  oldage = temp.readage();
	            		  old = temp.readname() + " -> " + oldage;
	            	  }
	              }
                   
                  
				return old;
			}
			public boolean AllOlderThan(int age) {
				// TODO Auto-generated method stub
				boolean val = true;
				
				  for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readage() <= age){
	            		  val = false;
	            		 
	            	  }
	              }
				  
				return val;
			}                                                 

}

   