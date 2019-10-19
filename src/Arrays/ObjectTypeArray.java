package Arrays;

public class ObjectTypeArray {

	
	
	public void marks(int x)
	{
		
		System.out.println("Marks of the student is : " + x);
		
	}
	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//Declaring the or creating the array of object type i.e student.
		//this array of object type can hold  10  references of student object class.
		ObjectTypeArray[] studentarray = new ObjectTypeArray[10];
		
		studentarray[0] = new ObjectTypeArray();
		
		studentarray[0].marks(100);
		
		
		//Below method will throw the array becuase no reference of student class object is present in 1 memory index of array
	    // To use that memory location we need to create the new object of student class and save in index 1
		// studentarray[1].marks(50);
		
		
		//Below code will not throw any exception because the new student object is created and store in reference 1 of memory
		studentarray[1] = new ObjectTypeArray();
		studentarray[1].marks(50);
		
		
		int i =studentarray.length;
		System.out.println(i);
	}

}
