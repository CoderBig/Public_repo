package REVISION;

import java.util.Scanner;

public class TEMP {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		str= sc.nextLine();
		String[] arr= str.split("");
		for(int i = arr.length-1; i>=0; i--)
			System.out.print(arr[i]);

	}

}
