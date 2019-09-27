package Static_Non_Static_Block;

public class A {

	
	
	
	public static int s;
	
	public int u ;
	
	static {
		
		s=90;
		System.out.println("Instatic block ");
		System.out.println("Value of s " +s);
		
	}
	
	
	{
		
		
		u=56;
		System.out.println("In local block ");
		System.out.println("value of u" + u);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
 A object =	new A();
 object.u=34;
 System.out.println(object.u);
 
 object.s =45;

 A object1 = new A();
 System.out.println(s);
	
	
	}

}
