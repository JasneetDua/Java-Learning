package threading;

class MyRunnable implements Runnable{

	public void run() 
	{	
		for(int i=0 ; i<10 ; i++)
			System.out.println("thread execution");
	}	
}

public class ByRunnable {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
	}

}
