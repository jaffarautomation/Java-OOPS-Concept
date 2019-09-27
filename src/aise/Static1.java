package aise;

public class Static1 {

	
	
	
	public static  int i;
	
	public static int u;
	
	int y;
	
	static {
	
		i=7;
		
		System.out.println(i);
		
	}
	
	
	static {
		
		i =10;
		
		System.out.println(i);
		
	}
	
	{
		
		
		int y =34;
	}
	
	
	public static void g()
	{
		
	 u =7;	
	
	}
	
	public void nonstatic()
	{
		
		u=9;
		System.out.println(u);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Static1 t = new Static1();
		t.nonstatic();
		System.out.println(t.i);
		
		

		Static1 t1 = new Static1();
		System.out.println(t.i);
		
		t.i=5;
		System.out.println(t.i);
		
		System.out.println(t1.i);
		
		g();
		
		
	}

}
