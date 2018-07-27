/*
 * 		Concept
 * 
 * byte(1) ---> short(2)- 
 * 						  \
 * 					 	   \
 * 					  	-------->int(4) ---> long(8)----> float(4)--->double(8)
 * 					   /
 * 				  	  /
 *		char(2)-------
 * 
 * 
 * */

package languageFundamentals;

public class IntegralDataType {

	
	public static void main(String[] args) {
	

		
		
//		byte b1 = 1;
//		
//		byte b2 = 127;
//		byte b3 = 128; // if type cast will save as -128
//		byte b3 = 129; // if type cast will save as -127
//		byte b4 = 10.5; // error ya fir type cast
		
//		byte b5 = true; // error
		
//		byte b6 = "durga";

//		byte b7 = (byte)-130; // will print 126 i.e -128 -> 127 -> 126
		
		
		
//		short s = 32767;
//		short s = 32768;	// ce : found int req short
		
		
//		int i =2147483647;		
//		int i =2147483648;		//out of range

//		long l =2147483648l;
//		long l =2147483648;		// ce : default literal is int if range exceed need to use l or L
//		long l=10;				// here no need bcoz of widening

		
//		int oct = 010;
//		int hex = 0X10;
				
//		int i;
//		char a = 'a';
//		i=a;	// widening no error
//		
//		a =i;	// narrowing error

		char a = '\r';
		
		System.out.println(":");
		System.out.println("a:\f:a");
		System.out.println(":");		
		
	}

	
	
}
