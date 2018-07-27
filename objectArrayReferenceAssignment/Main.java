package objectArrayReferenceAssignment;

public class Main {

	static Parent p[] = new Parent[5];
	static ChildClass c[] = new ChildClass[6];


	public static void main(String[] args) {
		
		p = c;
		System.out.println("Refence of c added to p");
	}
	
}
