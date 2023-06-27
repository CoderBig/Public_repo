package STRINGS;

public class Strings {

	public static void main(String[] args) {
		String firstname = "Dana";
		String lastname = "White";
		String fullname= firstname + " "+ lastname;// concatenation
		String sentence = "today is good day";
System.out.println(fullname);
System.out.println(firstname.length());// prints length of the string
System.out.println(lastname.charAt(2));
System.out.println(fullname.toUpperCase());
System.out.println(firstname.equals(fullname));// will return false as both values are not same
System.out.println(firstname.replace('D', 'M'));
System.out.println(sentence.substring(6,17 ));
System.out.println(sentence.substring(6,sentence.length() ));
System.out.println(sentence.lastIndexOf('y'));
System.out.println(sentence.indexOf('i'));
System.out.println(sentence.toCharArray());

String name = "Dana";
StringBuilder sb = new StringBuilder(name).reverse();
System.out.println(sb);

	}

}
