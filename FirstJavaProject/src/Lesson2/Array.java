package Lesson2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] myarray = {100,200,300,400};
      
      System.out.println(myarray[2]);
	
	// index of array start with 0 
	//if you need to print value 300 then provide value 4
	
	int i = 0 ;
	while (i <=3)
	{
		System.out.println(myarray[i]);
		i++;
	}
	
	System.out.println("-----------------------");
	
	  int b =2;
	do{
		System.out.println(myarray[b]);
		
	}while(b <= 1);

	}}
