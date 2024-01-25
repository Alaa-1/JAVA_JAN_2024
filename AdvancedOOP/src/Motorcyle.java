
public class Motorcyle extends Vehicule implements GPSNavigatable {

	// MEMBER VARIBALES
	
	private int numberOfWheels;
	private boolean hasHelmet;
	
	
	public Motorcyle() {
		super();
	}

	public Motorcyle(String brand, String model, Integer horsePower, int numberOfWheels, boolean hasHelmet) {
		super(brand, model, horsePower);
		this.numberOfWheels = numberOfWheels;
		this.hasHelmet = hasHelmet;
	}
		
	@Override
	public String start() {
		
		return "Big Engine Start !!!";
	}


	// GETTERS & SETTERS
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public boolean isHasHelmet() {
		return hasHelmet;
	}
	public void setHasHelmet(boolean hasHelmet) {
		this.hasHelmet = hasHelmet;
	}

	@Override
	public boolean isLocalisationOn() {
		System.out.println("Checking settings ...");
		
		return true;
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to your destination !");
		
	}

	@Override
	public String currentLocation() {
		
		return "At Home";
	}



	
	
	
}
