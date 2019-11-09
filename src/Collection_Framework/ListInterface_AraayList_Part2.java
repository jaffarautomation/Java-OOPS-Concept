package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//This class explain the concept of, how to iterate the arrays of object from Arraylist class.

public class ListInterface_AraayList_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating arraylist of array object type
		
		List<Object[]> r = new ArrayList();
           
		
		/*r.add(5);
		r.add("String");
		r.add(5.484);
		r.add(true);
		*/
		System.out.println(r);
		
		
		
		  Object array []= new Object[10];
		  
		  array[0]=12;
		  array[1] =34;
		  array[2]="String1";
		  
		  Object array1[] = new Object[4];
		  
		  array1[0]=12;
		  array1[1]=45;
		  array1[2]="String";
		  
		  
		
		  //Adding the arrays which created to arrylist
		  r.add(array);
		  r.add(array1);
		  
		  //Below code will print the address of array in form of hashcode
		  System.out.println(r);
		 
		  
		  //To print or iterate the values of arrays, we use below code
		  //As r is list object or it holds the address of 2 arrays which we created above
		  //It will pass the address one by one to "t" variable.
		  //Why object type : Because r hold the array of object type.
		  //If it holds array of String type then we write ---> String t[] : r, and same for other data type
		  for (Object t[] : r) 
		  {  
			  
			  //In below code again we are iterating the values of array t.
			  //Now t actually have the address of "array" or in first iteration, address of "array" pass to t.
			  //Then this t has return type of object.
			  for (Object object : t) 
			  {
				  
				  System.out.println(object);
			}
			  
			  System.out.println("Iteration is over");
			  System.out.println("Starting new Iteration");
			
		}
		
		
		
		
	}

	

	

}
