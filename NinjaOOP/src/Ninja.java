
public class Ninja {
	// MEMBER VARIABLES
	private String name;
	private int health;
	private int power;
	private static int numberOfNinjas;

	// CONSTRUCTOR (zero-args)
	public Ninja() {
	}

	// CONSTRUCTOR (all-args)
	public Ninja(String name, int health, int power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	// CONSTRUCTOR 
	public Ninja(String name) {
		this.name = name;
		this.health = 120;
		this.power = 5;
	}
	

	// ----- METHODS -----
	public void displayStats() {
		System.out.println("Name: " + this.getName());
		System.out.println("Health:" + this.getHealth());
	}

	public void attack(Ninja target) {
		System.out.println("[Parent METHOD]");
		target.setHealth(target.getHealth() - this.getPower());

		System.out.println(this.getName() + " attacks " + target.getName() + " for " + this.getPower()
				+ ", and now... \n" + target.getName() + " has " + target.getHealth() + " hp left");
	}
	
	public void eatStarwberry() {
		System.out.println("[UP]" + this.getName() + " ate a strawberry");
		this.setHealth(this.getHealth() + 10);
		System.out.println(this.getHealth());
	}

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public static int getNumberOfNinjas() {
		return numberOfNinjas;
	}

	public static void setNumberOfNinjas(int numberOfNinjas) {
		Ninja.numberOfNinjas = numberOfNinjas;
	}

}
