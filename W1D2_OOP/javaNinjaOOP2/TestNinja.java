public class TestNinja{

    public static void main(String[]args){
        // Ninja leo = new Ninja();
        Weapon ultimate = new Weapon("Katana", 89);
        Ninja michael = new Ninja("miky",100, ultimate);
        Ninja donatullo = new Ninja("donny",20, ultimate);

        // System.out.println(leo.getWeapon());
        // System.out.println(michael.getHealth());
        // System.out.println(michael.getWeapon().getType());
        // System.out.println(Ninja.getListOfNinjas());

        donatullo.displayStats();
        michael.attack(donatullo);
        donatullo.displayStats();

    }
}