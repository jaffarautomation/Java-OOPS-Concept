package Lesson3;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 24 ;
		//int age=89;
		String result = age_method(98);
		System.out.println(result);
		
		add(9,798);  // to call a method with name add
		add(89,785);
		add(78,78);
      nameofperson("rahul");   // to call a method with name nameofperson
	}
	
  // return type method
	public static  String age_method(int age)
	{
		if (age >= 20)
		return "adult";
		
		else 
			return "child";
	} 
	
	// void kind of method with parameter type integer.
  public static void add (int a ,int b)
  {
	  
	 System.out.println(a+b); 
  }
  
  // void kind of method with parameter type string.
  public static void nameofperson (String name)
  {
	  System.out.println(name);
	  
  }
  
}
