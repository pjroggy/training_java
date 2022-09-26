
public class Fighter {
	
	private int hitpoints;
	private int hitpointss;
	
		public Fighter() {
			this.hitpoints = 100;
			this.hitpointss = 120;
		}
		
		public void attack1(Fighter other) {
			Fighter swordsman = this;
			Fighter viking = other;
			
			while (swordsman.hitpoints > 0 && viking.hitpointss >0) {
				viking.hitpointss -= 5;
			}
			if(viking.hitpointss > 0) {
				swordsman.hitpoints -=6;
			}
		}
		
		public void attack2(Fighter other) {
			Fighter swordsman = this;
			Fighter viking = other;
			
			while (swordsman.hitpoints > 0) {
				viking.hitpointss -=5;
				swordsman.hitpoints -=6;
				
				Fighter fighterTemp = swordsman;
				swordsman = viking;
				viking = fighterTemp;
			}
		}
		
		public void attack3(Fighter other) {
			if(this.hitpoints >0 && this.hitpointss >0) {
				other.hitpoints -= 6;
				other.hitpointss -= 5;
				
				other.attack3(this);
			}
				
	}
		public int hitpoints;
		public int hitpointss;	
			
		return this.hitpoints;
		return this.hitpointss;
	}	
}		
