package Lesson8InhSuper;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj = new ClassB();
		
		obj.show();
		obj.show1();
		//this method is visible for protected but not for private.
	}
	
	  ClassB()
	{  //	super(5);
		System.out.println("Constructor of B class");	
	}
	
	//By defualt there is super method, which is called first ad which call the defualt constructor of super class.
	// if classA by defualt constructor is private then, you need to call the other const expicilty 
	
	
	
	ClassB(int a)
	{
		
		
		super(5);
		System.out.println("parameter constructor of class B");	
	}
	
	void show()
	{
		
	}

}
