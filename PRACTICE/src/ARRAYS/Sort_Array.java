package ARRAYS;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		int Roll_no[]= {123,22,5987,7};
		Arrays.sort(Roll_no);

		for(int i=0; i<=Roll_no.length-1; i++) {System.out.println(Roll_no[i]);}
		for(int i=Roll_no.length-1; i>=0; i--){System.out.println(Roll_no[i]);}
	}

}
