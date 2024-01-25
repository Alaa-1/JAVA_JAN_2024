
public class TestNinja {

	public static void main(String[] args) {
		
		Ninja nin = new Ninja("Michael", 200, 50);
		Ninja leo = new Ninja("leonardo", 500, 999);
//		nin.displayStats();
//		leo.displayStats();
//		leo.attack(nin);
		
		// ===== SuperNinja Instances ====
		
		SuperNinja ryu = new SuperNinja("ryu", true, 3, "UNKNOWN");
		
//		ryu.displayStats();
////		ryu.eatStarwberry();
//		leo.attack(ryu);
//		ryu.displayStats();
		
//		nin.attack(ryu);
		ryu.attack(nin);
	}

}
