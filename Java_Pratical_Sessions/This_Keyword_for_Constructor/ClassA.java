package This_Keyword_for_Constructor;

public class ClassA {


	// In this we are calling 3 constructor with only creating 1 object
	// to call 3 const we use this keyword


public void	CLassA()
	{
		
		System.out.println("In const with no parameter");
		
	}

public ClassA(int a, int y)
{
	
System.out.println("In constructor with 2 parameter");
System.out.println("value of a and y = " +a + y);

this.ClassA(5);
}

public void ClassA(int x)
{
	
System.out.println("In construtor with 1 parameter");
System.out.println("value of  x = " +x);
this.CLassA();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ClassA r = new ClassA(5,6);
		
		
		
	}

}
