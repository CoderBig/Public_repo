package methods;

public class Static {// Static method call from same class
public static void main (String [] args) {
	Addition();
	Subtraction();
	Multiplication (25);
	display("amol", 38);
	
}public static void Addition() {int a =10;
int b = 20;
System.out.println("Addition ="+(a+b));}
public static void Subtraction(){int a =40;
int b = 20;
System.out.println("Subtraction ="+(a-b));}
public static void Multiplication (int a) {
	int b = 50;
	System.out.println("Multiplication ="+(a*b));
}
public static void display(String name, int a) {
	System.out.println("Name ="+" "+name+" "+"age ="+" "+a);
}

}
