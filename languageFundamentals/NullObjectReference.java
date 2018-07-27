package languageFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NullObjectReference {

	// default null
	static BufferedReader br ;

	public static void main(String[] args) throws IOException {

		System.out.println(br);

		// assigning reference
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br1);

		//assigning null
		BufferedReader br2 = null;
		System.out.println(br2);
		
	}
}
