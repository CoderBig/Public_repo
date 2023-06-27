package REVISION;

public class ReverseWithoutUsingStringMethods {
public static void main(String args[]) {
	String str = "PIZZA";
	StringBuilder str1 = new StringBuilder ();
	str1.append(str); //Append in Java is StringBuilder and StringBuffer classes’ method 
					  //that adds a new value to the current sequence.
	str1 = str1.reverse();
	System.out.println("The reversed String Is :"+str1);
}
}
