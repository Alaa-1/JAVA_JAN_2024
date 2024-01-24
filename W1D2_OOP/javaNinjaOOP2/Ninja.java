import java.util.ArrayList;
public class Ninja{

    // MEMBER VARIABLES
    private int health;
    private String name;
    private Weapon weapon;
    // class variables
    private static ArrayList<String> listOfNinjas = new ArrayList<String>();
// CONSTRUCTOR
public Ninja(){
    this.name = "anonymous";
    this.health = 250;
    listOfNinjas.add(this.name);
}

// Overloading Constructor
public Ninja(String name,int health, Weapon weapon ){
    this.name = name;
    this.health = health;
    this.weapon = weapon;
    listOfNinjas.add(this.name);

}

// Methods
  public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
        System.out.println("Weapon: " + this.weapon.getType());
    }

    public void attack (Ninja villan){
         System.out.println("[ATTACK]" + this.name + " attacks " + villan.getName());
         villan.setHealth(villan.getHealth() - this.weapon.getDamage());
    }

// GETTERS & SETTERS
    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newValue){
        this.health = newValue;
    }

       public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

       public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public static ArrayList getListOfNinjas(){
        return Ninja.listOfNinjas;
    }

    
}