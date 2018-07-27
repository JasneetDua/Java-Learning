package languageFundamentals;

public class ArraysTesting {
	public static void main(String[] args) {
		
		int[] x;
		int y[];
		int []z;
		// any nuber of space are allowed between datatype,[],identifier
		
		boolean[] arr = new boolean[4];
		System.out.println(arr);	// array is an object
		
// in array of class we can assign objects of same type or child class		
		Object[] a =new Object[10];
		
		a[0]= new Object();
		a[1]= new String("Jasneet");
		a[2]= new Integer(57);
		
		System.out.println(a[2]);
		
		Number[] nums = new Number[5];
// in array of interface we can assign implementation class objects as:
		
		Runnable[] r = new Runnable[10];
		r[0] = new Thread();
		
		// r[1] = new String("Jasneet");  since it doesnt implement Runnable class
		
		Object[] ObjArr;
		ObjArr = r;
		
		
		
		
	}
}
