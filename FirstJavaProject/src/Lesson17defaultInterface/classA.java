package Lesson17defaultInterface;

public class classA implements J, I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classA t = new classA();
		t.show1();
		// if i implement both I and J it will give an error because java will get confused which show method to called
		//from Interface I or J.	
	// this is same problem as multiple inheritance	
		
		

	}
	/*
	public void show1()
	{
		System.out.println("This is default meyhod in interface");
	} */
	// Now if this method is override then no error will receive

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		J.super.show1();
		
//j .super .show1 will call the method from j interface		
	}
		

	
}