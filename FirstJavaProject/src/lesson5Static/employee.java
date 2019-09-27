package lesson5Static;

public class employee {
		
			
		int eid;
		int salary;
		static String ceo;
		
		
		static{
		
			ceo="larry";
			
			System.out.println("In static block ");
		}  // it is load in class loader memory once.
		

		
		
	public	void show()
		{
			
			System.out.println(eid+ ":" + salary + ": " + ceo);
		}

		employee()
		{
			
			System.out.println("Cons");
			System.out.println(eid);
			System.out.println(salary);
		}


}
