package Mutithreading;

public class ClassA {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB r =new ClassB();
		ClassC y = new ClassC();
		
		
		r.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		y.start();
		
		
	//here we are starting the thread by calling the start methods.
// since the output will be like 2 hello at same time, or 2 hi at same time,
// this happens because both the method r.start and y .start , started at same time.		

		// now we have apply the delay of 10 milli seconds, which means, r.start will execute first,
		// then y.start will execute after 10 seconds.
		//r.show();
		//y.show1();

	}

}