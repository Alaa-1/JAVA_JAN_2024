class Ninja {
// MEMBER VARIABLES
    private String name;
    private int health;
    private int powerLevel;

// CONSTRUCTOR Zero-Args
    public Ninja(){}
    // public Ninja(String name){
    //     this.name = name;
    //     this.health = 100;
    // }

// All Args Constructor
public Ninja(String name, int health, int powerLevel){
    this.name = name;
    this.health = health;
    this.powerLevel = powerLevel;
}
// METHODS
    public void displayStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Health:" + this.health);
    }

    public void eatStrawberry(){
        this.health += 10;
    }

// GETTERS & SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
 public int getPowerLevel() {
        return this.powerLevel;
    }
    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

}