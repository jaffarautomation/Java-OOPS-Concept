package Lesson8InhSuper;

//This class in intended to show the constructor overloading.

// This Package is intended to explain the concept of access modifiers in constructor


// Created 3 method with show to learn access modifiers. This class is extended by dummmy class in lesson  7

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ClassA()
	{
		
		
		System.out.println("Constructor of Class A, This is defualt Conct");
		
	
	}
	
	 // this cons is protected means it can be used by sub-class.
	 //if this cont is private then it connot be used by sub - class.
	
  protected	ClassA(int b)
	{

		System.out.println(" parameter Constructor of Class A");
		
	}
  
  
  private ClassA(int a ,int r)
 	{

 		System.out.println("with 2 parameter with same data type");
 		
 	}
  
  
  public ClassA(short a, int r)
  
  {
	  System.out.println(" with 2 parameter with different data type");
	  
  }
  
 public ClassA(int a, short r)
  
  {
	  System.out.println(" with 2 parameter with different data type but position of data type is different");
	  
  }
  
  
  private void show0()
  {
	  
	  
	  
  }
	
	 void show1 ()
	{
		
	}
	 
	 protected void show2 ()
	 {
		 
		 
	 }
	 
	 public void show3 ()
	 {
		 
		 
	 }
}
