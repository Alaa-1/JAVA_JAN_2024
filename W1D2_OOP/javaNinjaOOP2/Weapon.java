class Weapon {

    // MEMBER VARIABLES

    private String type;
    private Integer damage;

// CONSTRUCTOR
public Weapon(String type, Integer damage){
    this.type = type;
    this.damage = damage;
}

// GETTERS & SETTERS
    public String getType(){
        return this.type;
    }

    public void setType(String newValue){
        this.type = newValue;
    }

    public Integer getDamage(){
        return this.damage;
    }

    public void setDamage(int newValue){
        this.damage = newValue;
    }
}