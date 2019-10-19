package Lesson9_Super_and_Upcasting_AM;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj = new ClassB();
		obj.show();
		obj.show1();
		obj.show3(9);	
		

	}
	
	int i =15;
	// super keyword is used to call int i of class A i.e super class, unless stated it will call the int i of sub class , i.e class B
	public void show1 ()
	{
		
		
		System.out.println(i);
	}
	

	// here also if we don't provide the super keyword it will call the method Show of class B i.e sub Class
	
	public void show()
	{
		
		System.out.println("Class B hai ");
		
	} 
	
	// Now if we provide the super keyword then, first 'Show' method of class A will run
	// then 'show' method of class B will run.
	// this concept is also called as method overriding.
	
	public void show2()
	{
		super.show();
		System.out.println("Class B hai show 2 ");
		
	}
	
	// same goes for method with arguments, now method 'show3' refer to the sub-class i.e class B.
	// to call the method 'Show3' from the super class i.e Class A, we will use super keyword.
	
	
public void show3 (int j)
	
	{
		//super.show3(89);
		System.out.println(j);
		System.out.println("In show 3 of classs b");
	}
public void show5 (int j)

{
	//super.show3(89);
	System.out.println(j);
	System.out.println("In show 3 of classs b");
}


public void show8(int y)
{

         
	System.out.println("Class B hai show 8");
}


}