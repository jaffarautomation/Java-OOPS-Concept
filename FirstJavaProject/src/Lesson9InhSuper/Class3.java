package Lesson9InhSuper;

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
		
		ClassA t = new Class3();
		t.show6(4);
		t.show3(5);
		t.show();
		
		
		
		

	}
	
	public void show()
	{
		
		System.out.println("Class 3 hai");
	}
	
	// here again we have overriding the method show(). 
	// so while call this method java give suggestion, in which show () is from class 3.
	
	// if you call the method show3 then it will give suggestion, in which method show3 belong to class b.
	//As show 3 is not defined in class3.
	
	

}
