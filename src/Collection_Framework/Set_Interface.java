package Collection_Framework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



//NOTE :As set is not ordered collections of value, you cant enter the values in specified index, as we do in list interface.


public class Set_Interface {

	public static void main(String[] args) {
		
		
	Set<Integer> r = new HashSet();
	
	System.out.println(r.add(4));
	System.out.println(r.add(6));
	System.out.println(r.add(34));
	
	//As Set not accept the duplicate values, below line of code return false value
	System.out.println(r.add(4));
	
	
	
	
	//As hashset doest follow the sequence concept, as its algorithm depends upon the hashset concept
	System.out.println(r);
	
	
	//we have used advance for loop but again it doesnt store the value on based of index
	for (Integer i : r) {
		
		System.out.println(i);
		
	}
	
	
	
//In Treeset values will be store in sequences manner or more specifically in ascending order
	Set<Integer> e = new TreeSet();
	
	System.out.println(e.add(5));
	System.out.println(e.add(66));
	System.out.println(e.add(77));
	System.out.println(e.add(4));
	
	
	
	System.out.println(e);
	
	}

}
