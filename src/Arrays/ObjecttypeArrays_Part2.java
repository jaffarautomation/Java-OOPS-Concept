package Arrays;

import java.awt.image.AreaAveragingScaleFilter;

public class ObjecttypeArrays_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Here you are creating the array class of object type and storing the address of the class in arrayObject 
		Object arrayObject[] = new Object[5];
		
		//Below array can hold the values of different data type
		arrayObject[0] = 123;
		arrayObject[1] = "String";
		arrayObject[2] = 78.97;
		arrayObject[3] = true;
		
		
		
		
		System.out.println(arrayObject.length);
		
		//However, if you want to get data out of the array, you can only get it as an Object. The following won't work:
        //Because this is array of object 
	 //	int  i = arrayObject[0];
		
		
		//Printng only value from index 0.
		Object r = arrayObject[0];
		System.out.println(r);

		
		
		//printing all the values on console
		for (Object object : arrayObject) {
			
			System.out.println(object);
			
		}
		

	}

}
