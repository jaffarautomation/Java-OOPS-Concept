package InnerClasses_Concept;

public class NonStatic_InnerClass {
	
	
	
	
	//Now to call this show method we create the object of A right?
	//but now this show method reside in nested class
	//How to access the show method is defined in the Main class of this package
	class A{
		
		public void show()
		{
			System.out.println("Inside show method of inner Class A");
			
		}
		
	}
	
	static class B{
		
		
		public void showB() {
			
			
			System.out.println("Inside showB method of inner Class B");
		}
		
		
	}

}
