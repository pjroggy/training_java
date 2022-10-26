// ceci est une classe
public class Swordsman extends Fighter {

    // ceci est un constructeur (methode qui porte le nom de la classe)
    public Swordsman(){
        super(100);
    }

    @Override
    public void attack(Fighter other) {
        // tant que... les points de vie de swordsman1 sont superieurs a 0
        if(this.isAlive()) {
            // swordsman1 frappe !
            //other.hitPoints = other.hitPoints - 5; // ~ swordsman2.hitPoints -= 5
            other.takeDamage(5);

            // swordsman2 m'attaque !
            other.attack(this);
        }
    }
}
