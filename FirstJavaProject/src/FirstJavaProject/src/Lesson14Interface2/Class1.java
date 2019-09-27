package Lesson14Interface2;

public class Class1 implements DummyMobile2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 t = new Class1();
		t.design1();
		t.design2();
		t.design3();
	
		System.out.println(DummyMobile1.y);
// As we have declared the value of y in DM1 and again with same name we declared in DM2.
// So as DM2 extends the DM1, the value of y is overwrite. It is printing the lastest y in DM2.
		
		t.show();
		
		
		
		
      
		
	// as we have create the reference and object of Class1 then all the methods can be called from both interface.

		DummyMobile2 u = new Class1();
		u.design1();
		u.design2();
		u.design3();
		
// as we can see all method we can call from DummyMobile2 because, it extends the DummyMobile1
// so all the method in DM1 and DM2 can be called.		
		
		DummyMobile1 i = new Class1();
		i.design1();
		i.design2();
// in above we can can only the methods present in DM1. 		
		

	}

// Now as these class1 implements the interface DummyMobile() and Interface DummyMobile
//extends the interface DummyMobile1 then all the methods from both Interface must be implement in class1
	
	public void design1()
	{
		
		System.out.println("In design 1");
	}
  public void design2()
	{
		
		System.out.println("In design 2");
	}
  
  public void design3()
  {
	  System.out.println("In design 3");
	  
  }
  
  public void show ()
  {
	  
	  System.out.println(y);
  }
	
  
}
