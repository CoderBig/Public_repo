package loops;

public class ForLoop {

	public static void main(String[] args) {
		// 1to 10 using for loop
		for (int i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}
		// 10 to 1 using for loop
		System.out.println("=======================================");
		for (int i = 10; i >= 1; i--) {
			System.out.print(" " + i);
		}
		System.out.println("=======================================");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(" " + c);
		}
		// print odd no between 1 to 100
		System.out.println("=======================================");
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.print(" " + i);
		}
		System.out.println("=======================================");
		// print odd no between 200 to 1
		for (int i = 199; i >= 1; i = i - 2) {
			System.out.print(" " + i);
		}
		System.out.println("=======================================");
		// print from z to a
		for (char c = 'z'; c>='a'; c--) {
			System.out.print(" "+c);
		}
		System.out.println("=======================================");
		for(int i=2;i<=50; i=i+2)
		{
			System.out.print(" "+i);
		}
	}

}
