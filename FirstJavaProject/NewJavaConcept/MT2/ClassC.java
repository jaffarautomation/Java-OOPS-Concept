package MT2;

public class ClassC implements Runnable{
	
	public void run ()
	{		
		for (int i=0;i<=5;i++)
		{
			
			System.out.println("Hello");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// thread.slepp will delay the printing by half a second in here.

}}
