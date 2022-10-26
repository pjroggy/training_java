

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Battlefield!");

		// A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
		genericFight(new Swordsman(), new Swordsman()); // should equal 5 - 0!

		// A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
		genericFight(new Viking(), new Viking()); // should equal 6 - 0!

		genericFight(new Swordsman(), new Viking());  // should equal 0 - 35!

		// A Knight has 100 hit points and use a 1 hand sword that does 5 dmg
		// A knight wears an armor. an armor absorbs 2 hit points for each strike
		genericFight(new Swordsman(), new Knight());  // should equal 0 - 40!

		genericFight(new Viking(), new Knight()); // should equal 0 - 4!
	}

	public static void genericFight(Fighter fighter1, Fighter fighter2) {
		System.out.println("---- START FIGHT " + fighter1.getClass().getName() + " vs. " + fighter2.getClass().getName() + " ----");

		fighter1.attack(fighter2);

		System.out.println(fighter1.hitPoints());
		System.out.println(fighter2.hitPoints());
		System.out.println("---- END FIGHT ----");
	}
}
