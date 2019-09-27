package AccessModifiersdifferentpackage;

import lesson12AccessModifiers.class2;

  public class class3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class2 oj =new class2();
		oj.b =66;
		//here we can used the value of b, in other class as it is declared public.
		// but you need to import the class from the package.
		
		oj.c=54;
		// error as int c is declared as default.
		
		oj.x=43;
		//error as int x is private variable. only accessible within the class.
		
		oj.y =44;
		// error as int y is declared as protected variable.
		
		oj.show();
		//accessible as it is public.
		
		oj.show1();
		// Not accessible in other class of different package.
		
		
		
		

	}

}
