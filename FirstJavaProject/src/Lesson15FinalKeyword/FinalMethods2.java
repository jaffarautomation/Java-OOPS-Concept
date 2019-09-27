package Lesson15FinalKeyword;

public class FinalMethods2 extends FinalMethods{

	
	public void show()
	{
		
		   System.out.println("override");
		
	}
	
	// cant override the final method in sub class;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethods2 t = new FinalMethods2();
		t.show();
		

	}

}
