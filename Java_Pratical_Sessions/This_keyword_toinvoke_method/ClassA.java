package This_keyword_toinvoke_method;

public class ClassA {

	//In this class we use the "THIS" keyword to invoke the method of current class
	
	public void ClassA()
	{
		
		System.out.println("In defualt cont");
		
	}
	
	public void ClassA(int x, int y)
	{
		
		
		System.out.println("In cont");
	}
	
	public void get()
	{
		
		System.out.println("This is get method");
		this.display();    // this will invoke the display method from the get method
		
		this.ClassA(5, 6);  // this will invoke the const  from the  get method
		
	}
	
	
	
	public void display ()
	{
		
		
		System.out.println("This is display method");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassA r = new ClassA();
		r.get();
	}

}
