package REVISION;

public class ReverseWithoutUsingInbuiltFunction {
public static void main (String args[]) {
	String str = "Tom Jerry";
	char arr[]=str.toCharArray(); // converted to character array and printed in reverse order
	for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i]);
	}
}
}
