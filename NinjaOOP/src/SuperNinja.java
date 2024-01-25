
public class SuperNinja extends Ninja {

	// MEMBER VARIABLES
	private Boolean isInvisible;
	private Integer damageMultiplier;
	private String typeOfMartialArt;

	// CONSTRUCTOR
	public SuperNinja(String name, Boolean isInvisible, Integer damageMultiplier, String typeOfMartialArt) {
		super(name);
		this.isInvisible = isInvisible;
		this.damageMultiplier = damageMultiplier;
		this.typeOfMartialArt = typeOfMartialArt;
	}
	// METHODS

	public void attack(Ninja target) {
		System.out.println(this.getName() + " is a SuperNinja and he is too OP");
		target.setHealth(target.getHealth() - this.getPower() * this.getDamageMultiplier());
		System.out.println("[Super ATTACK] " + this.getName() + " attacked " + target.getName() + " and he has "
				+ target.getHealth() + " HP left");
	}

	// GETTERS & SETTERS
	public Boolean getIsInvisible() {
		return isInvisible;
	}

	public void setIsInvisible(Boolean isInvisible) {
		this.isInvisible = isInvisible;
	}

	public Integer getDamageMultiplier() {
		return damageMultiplier;
	}

	public void setDamageMultiplier(Integer damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}

	public String getTypeOfMartialArt() {
		return typeOfMartialArt;
	}

	public void setTypeOfMartialArt(String typeOfMartialArt) {
		this.typeOfMartialArt = typeOfMartialArt;
	}

}
