package threading;

class YieldTestThread extends Thread {

	public void run(){
	
		for(int i=0 ; i<10 ; i++)
		{
			Thread.yield();
			System.out.println("Thread Execution");
		}
	}
}

public class YieldMethod {

	public static void main(String[] args) {
		
		YieldTestThread th = new YieldTestThread();
		th.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Execution");
		}
	}

}
