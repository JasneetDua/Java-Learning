package threading;

class MyThreadName extends Thread {
	
	public void run() {
			System.out.println("thread execution");
	}
}

public class ThreadName {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThreadName th = new MyThreadName();
		th.start();
		
		System.out.println(th.getName());
	}
}
