package threading;

class Sleepy extends Thread {
	
	public void run(){
		for(int i=0;i<10;i++){
			
			System.out.println("Tick tick "+i);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}


public class SleepThread {

	public static void main(String[] args) {
		Sleepy th = new Sleepy();
		th.start();
	}
	
	
}
