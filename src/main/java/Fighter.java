
<<<<<<< HEAD
public class Fighter {
	
	private int hitpoints1;
	private int hitpointss1;
	
		public Fighter() {
			this.hitpoints1 = 100;
			this.hitpoints1 = 120;
		}
		
		public void attack1(Fighter other) {
			Fighter swordsman = this;
			Fighter viking = other;
			
			while (swordsman.hitpoints1 > 0 && viking.hitpoints1 >0) {
				viking.hitpoints1 -= 5;
			}
			if(viking.hitpoints1 > 0) {
				swordsman.hitpoints1 -=6;
			}
		}
		
		public void attack2(Fighter other) {
			Fighter swordsman = this;
			Fighter viking = other;
			
			while (swordsman.hitpoints1 > 0) {
				viking.hitpoints1 -=5;
				swordsman.hitpoints1 -=6;
				
				Fighter fighterTemp = swordsman;
				swordsman = viking;
				viking = fighterTemp;
			}
		}
		
		public void attack3(Fighter other) {
			if(this.hitpoints1 >0 && this.hitpoints1 >0) {
				other.hitpoints1 -= 6;
				other.hitpoints1 -= 5;
				
				other.attack3(this);
			}
				
	}
		public int hitpoints() {
			return this.hitpoints;	
		}
		public int hitpointss() {
			return this.hitpointss;
		}
		
=======
public abstract class Fighter {

    protected int hitPoints;

    public Fighter(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int hitPoints() {
        return Math.max(this.hitPoints, 0);
    }

    public abstract void attack(Fighter other);
>>>>>>> 4fe5dacd2dd47364a8e9d0326ab65c2865925aa5
}		
