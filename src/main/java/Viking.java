<<<<<<< HEAD
//création de la classe publique viking
public class Viking {
	//attribut hitPoints reservé à la classe viking (nbre de PV d'un viking)
 private int hitPoints;
 	 //constructeur du nom de la classe viking definissant la valeur de hitpoint de l'objet viking (par default this)
 	public Viking(){
 		this.hitPoints = 120;
 	}
 
 	public void attack1(Viking other) {
 		Viking viking1 = this;
 		Viking viking2 = other;
 		
 		while(viking1.hitPoints > 0 && viking2.hitPoints > 0) {
 			viking2.hitPoints -= 6;
 			
 			if(viking2.hitPoints > 0) {
 			viking1.hitPoints -= 6;
 		}
 		
 		}
 	}
 	
 	public void attack2(Viking other) {
 		Viking viking1 = this;
 		Viking viking2 = other;
 		
 		while(viking1.hitPoints > 0 ) {
 			viking2.hitPoints -= 6;
 			
 			Viking vikingTemp = viking1;
 			viking1 = viking2;
 			viking2 = vikingTemp;
 		}
 	}
 		//méthode nommée attack, paramètre viking nommé other (défini le 2ème combatant)
 	public void attack3(Viking other) {
 			//tant que les PV de this (premier viking) sont >0
 		if(this.hitPoints >0) {
 				//les PV de other baisse de 6 (le premier viking inflige 6 points de dégâts)
 			other.hitPoints -= 6;
 					//le premier viking (this) prend la place de deuxieme viking (other) et deviens à son tour other
 			other.attack3(this);
 		}
 	}//retourne la nouvelle valeur public de hitPoints
 	public int hitPoints(){
 		return this.hitPoints;
 	}
	
=======
//crï¿½ation de la classe publique viking
public class Viking extends Fighter {
    //attribut hitPoints reservï¿½ ï¿½ la classe viking (nbre de PV d'un viking)
//    private int hitPoints;

    //constructeur du nom de la classe viking definissant la valeur de hitpoint de l'objet viking (par default this)
    public Viking() {
        super(120);
//        this.hitPoints = 120;
    }

    public void attack(Fighter other) {
        this.attack3(other);
    }

    @Deprecated
    private void attack1(Viking other) {
        Viking viking1 = this;
        Viking viking2 = other;

        while (viking1.hitPoints > 0 && viking2.hitPoints > 0) {
            viking2.hitPoints -= 6;
            if (viking2.hitPoints > 0) {
                viking1.hitPoints -= 6;
            }
        }
    }

    @Deprecated
    private void attack2(Viking other) {
        Viking viking1 = this;
        Viking viking2 = other;

        while (viking1.hitPoints > 0) {
            viking2.hitPoints -= 6;

            Viking vikingTemp = viking1;
            viking1 = viking2;
            viking2 = vikingTemp;
        }
    }

    //mï¿½thode nommï¿½e attack, paramï¿½tre viking nommï¿½ other (dï¿½fini le 2ï¿½me combatant)
    private void attack3(Fighter other) {
        //tant que les PV de this (premier viking) sont >0
        if (this.hitPoints > 0) {
            //les PV de other baisse de 6 (le premier viking inflige 6 points de dï¿½gï¿½ts)
            other.hitPoints -= 6;
            //le premier viking (this) prend la place de deuxieme viking (other) et deviens ï¿½ son tour other
            other.attack(this);
        }
    }//retourne la nouvelle valeur public de hitPoints

//    public int hitPoints() {
//        return this.hitPoints;
//    }

>>>>>>> 4fe5dacd2dd47364a8e9d0326ab65c2865925aa5
}
