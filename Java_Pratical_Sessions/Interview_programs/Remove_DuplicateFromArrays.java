package Interview_programs;

import java.lang.reflect.Array;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;




public class Remove_DuplicateFromArrays {

	
	
	 static String arraysvalue[];
			  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		setarray();
		compare();
		
		
		
		
		

	}
	

	
	
	
	//This method will set the values in array of string type
	public static  void setarray()
	{
		
		String values = "Name@Lastname@Gender@Address@Pincode@city@city";
		
		
		    String  arraysvalue[] = values.split("@");
		    
		    System.out.println(arraysvalue.length);
		     
		     for (int r=0 ; r<arraysvalue.length;r++)
		     {
		    	 
				System.out.println("Value at"+ r + " is" + "=" + arraysvalue[r]);
				
		     }
		}
	
	
     public static void  compare()
     {
    	 
    	 
    	 for(int i =0; i<arraysvalue.length; i++)
    	 {
    		 
    		     String temp = arraysvalue[i];
    		     
    		     for(int r=0; r<arraysvalue.length;r++)
    		     {
    		                if(temp.equals(arraysvalue[r]))
    		             {
    			                System.out.println("This is same" +arraysvalue[r]);
    			                
    			 
    		              }
    		                
    		         
    		 
    		     }
    		     
    		     
    		     
    		     
    		     
    	 }
     }
}
