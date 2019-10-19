package Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List_Interface_ArraryList {
	
	
	//NOTE :List is ordered collection of data, it store values in sequence start from index zero. 

	public static void main(String[] args)
	
	
	{
		List<Integer> r = new ArrayList();
		
		//below line of code will return the true or false if value has been added to the list or not
	    //As i have add first values 23, this will assign to index zero, and same goes for 23,30 and 45.
		System.out.println(r.add(23));
		System.out.println(r.add(30));
		System.out.println(r.add(45));
		
	
		
		
		
		
		//As list can take duplicate values, below line of code proof the same
		System.out.println(r.add(23));  // true expected 
		
		//As list store the values in sequence, below line of code proof the same
		System.out.println(r);  //Print in sequence, as value added
		
		
		//In list we can retrieve the values from particular index which start from zero.
		// Note : This cant be achieved from collection interface
		System.out.println(r.get(2));  // 45 expected
	
		
		//In below code, we can enter the value for particular index
		r.add(4,67);
		
		System.out.println(r);
		
		//We can also add the values in between the index
		r.add(2, 100);
		
		System.out.println(r);
	}

}
