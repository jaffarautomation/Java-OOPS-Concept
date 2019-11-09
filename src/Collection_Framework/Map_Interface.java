package Collection_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//This interface is based on key and value pair
//Map<K,V> k key, v value
//hashmap class implement map interface


public class Map_Interface {
	
	
	
	
	public static void main(String args[]){
		
	//creating the object of HashMap Class	
	Map<String, Integer> map = new HashMap<>();
	
	//Adding the value in the Map in form of String and Value pair
	map.put("Value1", 7);
	map.put("Value2", 45);
	map.put("Value3", 46);
	
// Note : you can have same keys, but its previous value get assigned to new value
	map.put("Value3", 6);
	
	
	
	//As hashmap also use the concept of hashcode, so its not in proper sequence
	System.out.println(map);
	
	
	//Note: As value doesnt store in form of index, so its not possible to use advance for loop.
	//We will use advance for loop as given below
	
	
	
	
	//We have to use KEYSET method which will return the set of string
	Set<String> AllKeys = map.keySet();
	
	
	//Now we are using the advance for loop for iterating the values
	for (String OnekeyataTime : AllKeys) {
		
		System.out.println(OnekeyataTime + "  " +map.get(OnekeyataTime));
		
	}
	
	
	//Entry set is a method will returns the set of map values
	Set<Map.Entry<String,Integer>> y =map.entrySet();
	
	System.out.println(y);
	
	for (Entry<String, Integer> entry : y) {
		
		System.out.println(entry);
		System.out.println(entry.getKey() +":"+entry.getValue());
		
	}
	
	
 	}
	
	

}
