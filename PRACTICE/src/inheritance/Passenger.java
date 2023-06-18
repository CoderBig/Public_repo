package inheritance;

public class Passenger extends Car{

	public static void main(String[] args) {
		Passenger pgr = new Passenger();
		pgr.start();
		pgr.stop();
		pgr.Passengers();
		rent();
		

	}
public static void rent() {
	System.out.println("Pay the rent");
}

}
