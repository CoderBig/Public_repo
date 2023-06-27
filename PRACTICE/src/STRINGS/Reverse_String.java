package STRINGS;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "Dana";
		StringBuilder sb = new StringBuilder(name).reverse();
		String reversed = name.toString();
		System.out.println(sb);

	}

}
