package languageFundamentals;

import java.util.Arrays;

public class EnumTesting {

	
	public static void main(String[] args) {
		
		Month m1 = Month.APR;
		
		System.out.println(m1);
		
		System.out.println(Month.values());
		System.out.println(Arrays.toString(Month.values()));
		
		System.out.println(m1.ordinal());		

		
	}

}
