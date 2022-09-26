//cr�ation de la classe publique viking
public class Viking extends Fighter {
    //attribut hitPoints reserv� � la classe viking (nbre de PV d'un viking)
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

    //m�thode nomm�e attack, param�tre viking nomm� other (d�fini le 2�me combatant)
    private void attack3(Fighter other) {
        //tant que les PV de this (premier viking) sont >0
        if (this.hitPoints > 0) {
            //les PV de other baisse de 6 (le premier viking inflige 6 points de d�g�ts)
            other.hitPoints -= 6;
            //le premier viking (this) prend la place de deuxieme viking (other) et deviens � son tour other
            other.attack(this);
        }
    }//retourne la nouvelle valeur public de hitPoints

//    public int hitPoints() {
//        return this.hitPoints;
//    }

}
