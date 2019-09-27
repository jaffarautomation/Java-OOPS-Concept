package Static_Non_Static_Block;

public class A {

	
	
	
	public static int s;
	
	public int u ;
	
	
	//this is static block and it will initialize only once before the main method
	static {
		
		s=90;
		System.out.println("Instatic block ");
		System.out.println("Value of s " +s);
		
	}
	
	
	// this is local block and will initialize withevery object
	{
		
		
		u=56;
		System.out.println("In local block ");
		System.out.println("value of u" + u);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
// Creating object 1		
 A object =	new A();
 object.u=34;
 System.out.println(object.u);
 
 object.s =45;

 
 //creating object 2 
 //Here the static variable values change is reflect on object 2. As they share the common memory allocation
 A object1 = new A();
 System.out.println(s);
	
	
	}

}
