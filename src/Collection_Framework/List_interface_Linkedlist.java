package Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_interface_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> r = new LinkedList();
		
		System.out.println(r.add(23));
		System.out.println(r.add(30));
		System.out.println(r.add(45));
		
		System.out.println(r);
		
		//As list can take duplicate values, below line of code proof the same
				System.out.println(r.add(23));  // true expected 
				
				//As list store the values in sequence, below line of code proof the same
				System.out.println(r);  //Print in sequence, as value added

				
				
				System.out.println(r.get(2));
	}

}
