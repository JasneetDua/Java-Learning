package threading;

class JoinThread extends Thread{
	
	Thread mt;
	
	public void run(){
		System.out.println("Child Thread");
	}
	
}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		
			JoinThread th = new JoinThread();
			th.mt = Thread.currentThread();			
			th.start();
			th.join();
			
			System.out.println("main thread");
	}
}
