package Lesson17defaultInterface;

public interface I {

	
//public abstract	void show();

public final int y = 5;

default void show1()
{
	System.out.println("This is default meyhod in interface I");
}




}
