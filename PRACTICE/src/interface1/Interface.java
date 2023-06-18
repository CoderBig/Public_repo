package interface1;

public class Interface implements  I1,I2 {

	public static void main(String[] args) {
		Interface I2 = new Interface();
		I2.addition();
		I2.subtraction();
		I2.division();
		I2.multiplication();

	}

	public void addition() {
		System.out.println("This is addition");
	}

	public void subtraction() {
		System.out.println("This is subtraction");
		
	}

	public void multiplication() {
		System.out.println("This is multiplication");
		
	}

	public void division() {
		System.out.println("This is division");
		
	}

}
