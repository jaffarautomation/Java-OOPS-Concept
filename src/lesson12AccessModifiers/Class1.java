package lesson12AccessModifiers;

import Lesson2.ADDandOR;

  public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADDandOR og =new ADDandOR();
		
		class2 obj = new class2();
		obj.x=55;
		//Error above becuase x is private variable.
		
		obj.b=9;
		// here b can be used as it is public variable.
		
		obj.c=43;
		//here int c is accessible as it is default.
		
		obj.y=90;
		// here int y is accessible because of same package.
		
		obj.show();
		
		obj.show1();
		//Accessible as this method is default.
		
		obj.show2();
		//error as it is private method.
		
		
		
	}

}
