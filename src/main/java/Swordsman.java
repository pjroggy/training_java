// ceci est une classe
public class Swordsman {

    // ceci est un attribut de classe
    private int hitPoints;

    // ceci est un constructeur (methode qui porte le nom de la classe)
    public Swordsman(){
        this.hitPoints = 100;
    }

    // ceci est une methode
    public void attack1(Swordsman other) {
        Swordsman swordsman1 = this;
        Swordsman swordsman2 = other;
        // tant que... les points de vie de swordsman1 sont superieurs a 0
        while(swordsman1.hitPoints > 0 && swordsman2.hitPoints > 0) {
            // swordsman1 frappe !
            swordsman2.hitPoints = swordsman2.hitPoints - 5; // ~ swordsman2.hitPoints -= 5

            System.out.println("ceci est un message de debug...."  + swordsman2.hitPoints);

            // on s'arrete si il est mort
            if (swordsman2.hitPoints > 0) {
                // c'est a swordsman2 de frapper !
                swordsman1.hitPoints = swordsman1.hitPoints - 5; // ~ swordsman1.hitPoints -= 5
            }
        }
    }

    public void attack2(Swordsman other) {
        Swordsman swordsman1 = this;
        Swordsman swordsman2 = other;

        // tant que... les points de vie de swordsman1 sont superieurs a 0
        while(swordsman1.hitPoints > 0) {
            // swordsman1 frappe !
            swordsman2.hitPoints = swordsman2.hitPoints - 5; // ~ swordsman2.hitPoints -= 5

            // on inverse les roles !
            // A = 1; B = 2
            Swordsman swordsmanTemp = swordsman1; // T = 1
            swordsman1 = swordsman2; // A = 2; B = 2; T = 1
            swordsman2 = swordsmanTemp; // A = 2; B = 1; T = 1 ...
        }
    }

    // cest une methode recursive +++
    public void attack3(Swordsman other) {
        // tant que... les points de vie de swordsman1 sont superieurs a 0
        if(this.hitPoints > 0) {
            // swordsman1 frappe !
            other.hitPoints = other.hitPoints - 5; // ~ swordsman2.hitPoints -= 5

            // swordsman2 m'attaque !
            other.attack3(this);
        }
    }

    public int hitPoints() {
        return this.hitPoints;
    }
}
