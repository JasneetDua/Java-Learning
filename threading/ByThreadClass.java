package threading;

class MyThread extends Thread {
	
	public void run(){
		
		for(int i=0 ; i<10 ; i++)
			System.out.println("thread execution");
	}
	
}

public class ByThreadClass {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.start();
		
		th.run(); // no error since it act as normal method calls
		
		th.start(); // re : while calling start again
		MyThread th2 = new MyThread();
		th2.start();
	}
	

}
