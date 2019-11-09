package LambdaExpression;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*A obj =new A()
		//This is called Anonymous Inner class as it is defined inside the Lambda class		
		{
			        public void show()
			        {
			        	
			        	System.out.println("Inside show method");
			        	
			        }
			
			        public void show1()
			        {
			        	
			        	System.out.println("Inside the show1 method");
			        }
			
				};
				
				obj.show();
				obj.show1();*/
				
		
		
		A obj = () -> System.out.println("Inside the show1 method");
		
		obj.show();
	}
	
	
	

}
