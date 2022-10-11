

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Battlefield!");

		simpleCombat();
		combatWithViking();
		combatKnight();
		// combatSwordsmanViking();
	}

	public static void simpleCombat() {
		// A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
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

		viking1.attack2(viking2);

		System.out.println(viking1.hitPoints()); // should equal 6!
		System.out.println(viking2.hitPoints()); // should equal 0! XX
	}
	
	public static void combatKnight() {
		// a Knight has 100 hit points and use a spear that does 5 dmg, and wear an armor that save 2 hit points
		Knight knight1 = new Knight();
		Knight knight2 = new Knight();
		
		knight1.attack2(knight2);
		
		System.out.println(knight1.hitPoints());
		System.out.println(knight2.hitPoints());
	}
	
	/*public static void combatSwordsmanViking() {
		
		Fighter swordsman = new Fighter(); // 100 HP, 5 ATK
		Fighter viking = new Fighter();// 120 HP, 6 ATK
		
		swordsman.attack2(viking);
		
		System.out.println(swordsman.hitPoints()); // =0
		System.out.println(viking.hitPoints()); // = 30
	}*/
}
