package LessonCloneofobject;

public class ShallowCloning {
	
	public static void main(String[] args) {
	
		
		Extraclass r =new Extraclass();
		r.x=3;
		r.y=5;
		
		System.out.println(r.toString());
		
		Extraclass r1=r;
		//in this are are just copying the reference of r in r1.
		// not creating the new object.
		
	//	r1.x=3;
	//	r1.y=7;
	//	System.out.println(r1.toString());	//expected values 3 and 7
	//	System.out.println(r.toString());	// expected values 3 and 5 actual values is 3 and7
		
// so now we are not getting the expected values like 3 and 5, instead we are getting 3 and 7.
	// because in this concept only one object is created and two referece were created	
		
//*******************************************************************************		
		// deep cloning
		
		Extraclass r3 =new Extraclass();
		r3.x=r.x;
		r3.y=r.y;
		System.out.println(r3.toString()); // expected values 3 and 5
		
		r3.x=9;
		
		System.out.println(r.toString());// expected values 3 and 5 
		System.out.println(r3.toString()); // expected values 3 and 9
	}
	
	
	

}