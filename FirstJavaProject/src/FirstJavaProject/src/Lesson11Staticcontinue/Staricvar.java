package Lesson11Staticcontinue;


public class Staricvar {
	
	static int num ;
	String name ;
	
	public void show1()
	{
		
		System.out.println();
	}

	static{
		
		
		num=78;
		System.out.println(num);
	}
	
	public static void main(String[] args)
	{
		Staricvar obj = new Staricvar();
		Staricvar obj1 = new Staricvar();
		
		
		obj.num=5;
		obj.name= "mahesh";
		
	    obj1.num=7;
	    obj1.name= "rakesh";
	    
	    System.out.println(Staricvar.num);
	    System.out.println(obj.name);
	    
	    System.out.println(obj1.num);
	    System.out.println(obj1.name);
	    
		
	}
}
