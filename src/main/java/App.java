

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Battlefield!");

		simpleCombat();
		combatWithViking();
	}

	public static void simpleCombat() {
		// A Swordsman has 10 hit points and use a 1 hand sword that does 5 dmg
		Swordsman swordsman1 = new Swordsman();
		Swordsman swordsman2 = new Swordsman();

		swordsman1.attack2(swordsman2);

		System.out.println(swordsman1.hitPoints()); // should equal 5!
		System.out.println(swordsman2.hitPoints()); // should equal 0! XX
	}

	public static void combatWithViking() {
		//  A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
		Viking viking1 = new Viking();
		Viking viking2 = new Viking();

		viking1.attack2(viking1);

		System.out.println(viking1.hitPoints()); // should equal 6!
		System.out.println(viking2.hitPoints()); // should equal 0! XX
	}
}
