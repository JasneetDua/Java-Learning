package languageFundamentals;

public class VariableLengthArg {

	void a(int... a){
		
		int total= 0;
		for(int x : a){
			total+=x;
			
		}
		
		System.out.println("Sum = "+total);
	}
		
	public static synchronized void main(String... args) {
		
		
		VariableLengthArg obj = new VariableLengthArg();
		
			obj.a(1,2,3);
			obj.a(new int[]{4,5,6});
	}
	
}
