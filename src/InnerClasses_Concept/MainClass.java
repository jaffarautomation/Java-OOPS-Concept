package InnerClasses_Concept;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Creating the object of outer class i.e main class
		NonStatic_InnerClass obj1 =	 new NonStatic_InnerClass();
		
		//below code will create the object of nested class with help of object of Main class i.e NonStatic_InnerClass
		NonStatic_InnerClass.A obj2 = obj1.new A();
		
		obj2.show();

		
		//Below code will create the object of nested  static class 
		NonStatic_InnerClass.B obj3 = new NonStatic_InnerClass.B();
		obj3.showB();
		
	}

}
