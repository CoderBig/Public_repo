package inheritance;

public class Car extends VehicleCommon {

	public static void main(String[] args) {
		Car cr= new Car();
		cr.start();
		cr.stop();
		Passengers ();

	}
	public static void Passengers (){
		System.out.println("Carrying Passengers");

	}
}
