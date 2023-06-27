package REVISION;

import java.util.Scanner;

public class Reverse_String_Using_input {

	public static void main(String[] args) {
		 String str;// blank string object
		 Scanner sc = new Scanner(System.in);//
		 System.out.println("Enter String:");//A Scanner breaks its input into tokens using a delimiter 
		                                    //pattern, which by default matches whitespace. 
		 									//The resulting tokens may then be converted into 
		 									//values of different types using the various next methods.
		 str= sc.nextLine();  // storing the user input in to string object "str"
		 String[] str1 = str.split("");// using delimiter to split the string and store it in array
		 for(int i= str1.length-1; i>=0; i--) {
			 System.out.print(str1[i]);
		 }
	}

}
