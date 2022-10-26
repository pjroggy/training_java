/**
 * This is a Viking public class
 */
public class Viking extends Fighter {

    /**
     * This is the Viking constructor. It defines hitpoints values of the super class (Fighter)
     */
    public Viking() {
        super(120);
    }

    /**
     * This attack method, deal damages on other fighter then end turns.
     * It is then to the other to attack.
     * The combat lasts until one of the Fighters is dead (hitPoints <= 0)
     * @param other
     */
    public void attack(Fighter other) {
        //tant que les PV de this (premier viking) sont >0
        if (this.isAlive()) {
            //les PV de other baisse de 6 (le premier viking inflige 6 points de d�g�ts)
            other.takeDamage(6);

            //le premier viking (this) prend la place de deuxieme viking (other) et deviens � son tour other
            other.attack(this);
        }
    }

}
