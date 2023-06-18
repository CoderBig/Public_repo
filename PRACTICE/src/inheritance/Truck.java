package inheritance;

public class Truck extends VehicleCommon {
	public static void main(String[] args){
		VehicleCommon tk = new VehicleCommon();
		
		tk.start();
		tk.stop();
		
	}
	public static void Load (){
		System.out.println("Carrying load");

	}

}
