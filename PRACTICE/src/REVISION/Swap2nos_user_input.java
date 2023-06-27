package REVISION;

import java.util.Scanner;

public class Swap2nos_user_input {

	public static void main(String[] args) {
		int A,B;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A:");
		A = sc.nextInt();
		System.out.println("Enter Value of B:");
		B = sc.nextInt();

		System.out.println("Before Swapping\nA = "+A+"\nB = "+B);
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.println("After Swapping without third variable\nA = "+A+"\nB = "+B);

	}

}
