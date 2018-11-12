

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
       		
       		public  int count(String s1)
	        {   int no =0;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(s1)){
	            		  no++;
	            	  }
	              }
                     return no; 
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
			public String delete_last() {
				// TODO Auto-generated method stub
				
				int index = count - 1;
				String res = head[index].readname();
				head[index] = null;
				count--;
				return res;
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
			
			 public  String youngest()
		        {     
				 String young  = ""; int youngage = head[0].readage();
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readage() < youngage){
	            		  youngage = temp.readage();
	            		  young = temp.readname() + " -> " + youngage;
	            	  }
	              }
                    
				return young;
		        }   
			 
			public int olderThan(int age) {
				// TODO Auto-generated method stub
				int no=0;
				
				  for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readage() > age){
	            		  no++;
	            	  }
	              }
				  
				return no;
			}                                                 

}

   