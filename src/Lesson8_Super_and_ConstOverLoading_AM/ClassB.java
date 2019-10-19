package Lesson8_Super_and_ConstOverLoading_AM;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj = new ClassB(5,6);
		
		
		obj.show();
		obj.show1();
		//this method is visible for protected but not for private.
	}
	
	  ClassB()
	{  //	super(5);
		System.out.println("Constructor of B class");	
	}
	
	//By default there is super method, which is called first ad which call the default constructor of super class.
	// if classA by default constructor is private then, you need to call the other const expicilty 
	
	
	
	ClassB(int a)
	{
		
		
		super(5);
		System.out.println("parameter constructor of class B");	
	}
	
	
	
	ClassB(int a, int r)
	{
		
		
		super(5);
		System.out.println("parameter with 2 constructor of class B");	
	}
	
	void show()
	{
		
	}
	
	
	public void show8(int y)
	{
	
	         
		System.out.println("Class 3 hai");
	}

}
