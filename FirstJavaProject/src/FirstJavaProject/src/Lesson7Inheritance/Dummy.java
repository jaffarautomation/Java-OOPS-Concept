package Lesson7Inheritance;

import Lesson8InhSuper.ClassA;

// Lesson 8 Class A is extended to learn access modifiers in inheritance i.e default and protected
public class Dummy extends ClassA {
	
	public static void main(String[] args) 
	{
		
		
		Dummy t = new Dummy();
		//t.show1();
// The above shows error because show1() method is defualt, it means it can access in its own package.
		t.show2();
// the above shows no error because it access modifiers is protected
//A protected method can be access by sub - class in different package.
		
		t.show3();
// Can be accessible because of public.		
	}
	
	 Dummy()
	{
		
		System.out.println("In dummy class cont");
	}
	 
	 // As defualt conrt from class is protected, so above conrt dont throw an error.
	 // if it was default then it will throw an error because default is package private
}
