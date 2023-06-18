package abstract_and_concrete_class;

public class Concrete_class extends abstract_class{
public static void main(String[] args) {
	Concrete_class cc = new Concrete_class();
	cc.test1();
	cc.test2();
	cc.addition();
	cc.subtraction();
}
	public void test2() {
		System.out.println("this is abstract class in concrete class");
		
	}

	public void addition() {
		
		System.out.println("THis is addition");
	}

	public void subtraction() {
		
		System.out.println("THis is subtraction");
	}

	

}
