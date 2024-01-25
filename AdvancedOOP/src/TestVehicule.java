
public class TestVehicule {

	public static void main(String[] args) {
		
		// instantiate vehicule
//		Vehicule car1 = new Vehicule("BMW", "X6", 780);
//		Vehicule car2 = new Vehicule("Infiniti", "E6", 500);
		
//		car1.displayInfo();
//		System.out.println(car2.start());
//		System.out.println(car2.stop());
		
		// instantiate Motorcycle
		
		Motorcyle chopper = new Motorcyle("Harley", "chopper", 999, 2, true);
		
		chopper.displayInfo(); 
		System.out.println(chopper.start());
		System.out.println(chopper.stop());
		
		chopper.navigate();
	}

}
