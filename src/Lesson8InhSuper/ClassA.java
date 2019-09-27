package Lesson8InhSuper;
// created 3 method with show to learn access modifiers. this class is extended by dummmy class in lesson  7
public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 protected ClassA()
	{
		
		
		System.out.println("Constructor of Class A");
		
	
	}
	
	 // this cons is proctected means it can be used by sub-class.
	 //if this cont is private then it connot be used by dub - class.
	
  protected	ClassA(int b)
	{

		System.out.println(" parameter Constructor of Class A");
		
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
