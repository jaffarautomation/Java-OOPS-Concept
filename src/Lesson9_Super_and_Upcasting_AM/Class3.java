package Lesson9_Super_and_Upcasting_AM;

public class Class3 extends ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Class3 ojb = new Class3();
		ojb.show();
		ojb.show();
		ojb.show3(25);
		ojb.show2();
		ojb.show3(67);
		*/
		
		
//Here ClassA is acting as a grandfather of Class3.
// Now we have created a object of Class3 i.e grandchild of ClassA and save it in reference of ClassA i.e grandfather.
//This concept is called as upcasting.
//Now in this case, only those method will be visible which are present in ClassA.
//If some of the method from classA is override by its child class then those method will be called.
//If some of the method from ClassA is overridden by its grandchild then those method will be called.
		
		
		ClassA t = new Class3();  // this is up casting to grandchild to grandfather
		
// As Show6 method is present in ClassA and it is not overridden by any of its parent and child class, then upon calling Show6 it will call from ClassA i.e grandfather class.
		
		t.show6(4);
	
//As Show3 method is prsent in ClassA and overridden by ClassB then upon calling show3, overridden method will be called upon from ClassB.
		
		t.show3(5);
//As show method was originally created in ClassA and then it is overridden by ClassB and again overridden by Class3, then upon calling Show() method it will be called from Class3. 
		t.show();
	    
//Same goes with method Show8()		
		t.show8(7);
		
	    
	    
		ClassB r =new Class3(); // This is up casting from child to parent

//As ClassB extends ClassA and Class3 extends classB, and so creating the above relation of object and calling show6, it will be called from classA.
//Because it is indirectly inherited by classB		
		r.show6(5);
		
		
//Now even though show() method is overridden by classB from ClassA, again this method is overridden by Class3, Class3 show() method will be called.
		
		r.show();
		

		
//Now we have child to child relation i.e creating the object of child class and storing in the reference of child class.
		
		Class3 y =new Class3();
		y.show3(5);
               
	}
	
	//This show 3 method is first created in ClassA, then it is override by the ClassB, Then again it get override by the class3.
	
	//So now if you called show it will say it is override from ClassB instead of ClassA. This is point to remember.
	
	// Always remember, with super keyword you can only called the parent class constructor or method, not grand parent constructor or method.


	public void show7()
	{
	
	         
		System.out.println("Class 3 hai");
	}
	
	
	
	public void show()
	{
	
	         
		System.out.println("Class 3 hai");
	}
	
	

	
	// here again we have overriding the method show(). 
	// so while call this method java give suggestion, in which show () is from class 3.
	
	// if you call the method show3 then it will give suggestion, in which method show3 belong to class b.
	//As show 3 is not defined in class3.
	
	
	public void show8(int y)
	{
	
	         
		System.out.println("Class 3 hai of show 8");
	}
	

}
