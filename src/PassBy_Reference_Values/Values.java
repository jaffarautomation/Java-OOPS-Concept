package PassBy_Reference_Values;

public class Values {

	
	

	
	
	public void display (int x)
	{
		System.out.println("Inside the display method");
		x= x*2;
		System.out.println("Values of x =" +x);
	}
	
	public static void main (String args[])
	{
		int number =25;
		Values r =new Values();
		System.out.println("Values of the number variable before calling display method is : "+number);
		r.display(number);
		System.out.println("Values of number after we call display method is :" +number);
		
		 
	}
}
