package Lesson2;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
	 //Declaring the string
      java.lang.String mystring = "hello world";
      
      // to return the lenght
       int i = mystring.length();
       System.out.println(i);
       
       // conversion of letters
       java.lang.String uppercase = mystring.toUpperCase();
       System.out.println(uppercase);
       
       // to replace some letters 
       System.out.println(mystring.replace('h', 'Y'));
       
       //to find the index
       System.out.println(mystring.indexOf('h'));
       
	}

}
