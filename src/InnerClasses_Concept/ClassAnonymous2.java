package InnerClasses_Concept;

public class ClassAnonymous2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//In below code we have created the Inner Anonymous class, which provide implementation to show method
		ClassAnonymous1 obj = new ClassAnonymous1() 
		{
			
			public void show()
			{
				System.out.println("Hello");
			}
			
			public void show2(){
				System.out.println("Hello all");
			}
			
		};
		
		
		obj.show();
	}

}
