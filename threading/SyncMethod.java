package threading;

class Display {
	
	synchronized public void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning :"+name);
		}
	}
}

class MultiThread extends Thread{
	
	Display d;
	String name;
	
	MultiThread(Display d,String name){
		this.d= d;
		this.name=name;
	}
	
	public void run(){
		d.wish(name);
	}
}

public class SyncMethod {

	public static void main(String[] args) {

		Display d = new Display();
		
		MultiThread t1 = new MultiThread(d, "Jasneet");		
		MultiThread t2 = new MultiThread(d, "Simran");
		t1.start();
		t2.start();
		
	}

}
