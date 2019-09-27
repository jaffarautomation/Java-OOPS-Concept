package Lesson14Interface;

public class ImplementClass1 implements DummyMobile,DummyMobile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DummyMobile y = new ImplementClass1();
		y.design();
		// by creating the object of ImplementClass1 and creating the reference of 
		//		DummyMobile it will call only DummyMobile methods. not from other interface
		
		
		DummyMobile2 r = new ImplementClass1();
		r.design3();
	
		// Similarly it goes for DummyMobile2
		
		ImplementClass1 t = new ImplementClass1();
		t.design();
		t.design2();
		
		// In this as reference and object are of both ImplementClass1 then 
		// all method can be called as it implements both the interface.
		
		t.show();
	}
	
// as this class implements the interface not extends.
	// This class can implements the two interface.
	//but class cannot extends the two class which is called multiple interface.
	 public void design ()
	{
		
		System.out.println("Design is ready");
	}
	
  public void design2()
	{

		System.out.println("Design 2 is ready");
	
		
	}
  
  public  void design3() {
	  
	  System.out.println("Design 3 is ready");
		
	  
  }
  
 public void design4()
  {
	  System.out.println("Design 4 is ready");
  }
  
  
	//void design4();
	//it is necessary to define the method from interface in class you you implement that interface,
  //otherwise it will throw an error like above.
  
  // even i have comment that method design4(), but we need to define it because we have implement
  // the interface DummyMobile2.
 
public void show()
{
	System.out.println(DummyMobile.y);
	}
 
//Now this variable y is present in both interface with same name, so it confused the jvm which y should be call i.e from DM1 or DM2.
//To solve this we use interface name DM1.y or DM2.y

public void show2()

{
	int i = DummyMobile.sum + DummyMobile2.sum2;
	System.out.println(i);
	
}

public void changevalue()
{
	//sum=23;
	//sum2=78;
	
}

//error occured as we cant change the values of sum and sum2 as they are final variable.
//in other word they cant be initialize again

}
