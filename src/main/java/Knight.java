
public class Knight {
	
	private int hitPoints;
	
		public Knight(){
			this.hitPoints = 100;
	}
	
	public void attack1 (Knight other) {
		Knight knight1 = this;
		Knight knight2 = other;
		
		while (knight1.hitPoints > 0 && knight2.hitPoints > 0) {
			knight2.hitPoints -= (5 - 2);
		}if (knight2.hitPoints > 0) {
			knight1.hitPoints -= (5 - 2);
		}
	}
	
	public void attack2 (Knight other) {
		Knight knight1 = this;
		Knight knight2 = other;
		
		while (knight1.hitPoints > 0) {
			knight2.hitPoints -= (5 - 2);
			
			Knight knightTemp = knight1;
			knight1 = knight2;
			knight2 = knightTemp;
		}
	}
	
	public void attack3 (Knight other) {
		if(this.hitPoints > 0) {
			other.hitPoints -= 3;
			
			other.attack3(this);
		}
	}
	public int hitPoints() {
		return this.hitPoints;
	}
}


