package REVISION;

public class Rev_String_SMALL {

	public static void main(String[] args) {
		String str = "Tom Jerry";
		String rev = "";// create object to store reverse string
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Original String is: " + str);
		System.out.println("Reversed String is: " + rev);
	}

}
