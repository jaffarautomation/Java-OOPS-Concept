package Lesson3;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentClass mark = new StudentClass();  // mark -> object or instance
		/*
		mark.age =354;
		mark.name="Mark";
		mark.id=799;
		
		System.out.println(mark.name + "is " + mark.age +mark.id );
		
		// in this method with out getter and settervalues are directly assign to variables
		
		*/
		
		mark.setId(2);
		mark.setAge(8);
		mark.setName("mark");
		
		
		System.out.println(mark.getAge());
		System.out.println(mark.getId());
		System.out.println(mark.getName());
	}

}