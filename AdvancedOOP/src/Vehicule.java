
public abstract class Vehicule {

	// MEMBER VARIABLES
	private String brand;
	private String model;
	private Integer horsePower;

	// CONSTRUCTOR (zero-args)
	public Vehicule() {

	}

	// CONSTRUCTOR (All-args)
	public Vehicule(String brand, String model, Integer horsePower) {

		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
	}

	// ==== METHODS ====
	public void displayInfo() {
		System.out.println(
				String.format("This is a %s %s has %d hp",
						this.getBrand(),
						this.getModel(),
						this.getHorsePower()));

	}
	
	public abstract String start();
	
	public String stop() {
		
		return "Engine Stopped !";
	}

	// GETTERS & SETTERS
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}

}
