package lesson12AccessModifiers;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 ig = new Class1();
		
		
		 
	}

	private int x;
	
	//Since it is private variable, it cannot be used outside the class
	//Not even some class of same package.
	
	public int b;
	//Here b is public variable it can be used outside the class
	// it can be used in some other class of same package.
	//it can be used in some other class of different package
	
	int c; 
	// in defualt keyword, int c is accessible to different class of same package.
	//But int c is not accessible to other class of different package.

	protected int y;
	// this is protected variable.
	//it can be accessed in other class of same package.
	
	public   void show()
	{
		
		System.out.println("ABCD");
	}
	// As this method is public we can call this method in other class of same package or class
	//of different package.
	
	void show1()
	{

		System.out.println("ABCD");
	}
	 private void show2()
	{

		System.out.println("ABCD");
	}
	
	}
