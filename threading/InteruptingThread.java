package threading;

class InteruptThread extends Thread {
	
	public void run(){
		
		for(int i=0;i<20;i++)
		{
			System.out.println("Im Lazy "+i);
		}
		System.out.println("Im entering into sleeping state");
		try{
			sleep(10000);
		}
		catch(InterruptedException e){
		
			System.out.println("I got Interrupted");
		}
	}
		
}

public class InteruptingThread {

	public static void main(String[] args){
		
		InteruptThread i = new InteruptThread();
		i.start();
		i.interrupt();
		System.out.println("End of main program");

	}
}
