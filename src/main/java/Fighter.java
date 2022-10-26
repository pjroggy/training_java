
public abstract class Fighter {

    private int hitPoints;
    // TODO initialize fighter damages !
    private int damages;

    public Fighter(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int hitPoints() {
        return Math.max(this.hitPoints, 0);
    }

    // TODO implement generic method !
    public abstract void attack(Fighter other);

    public void takeDamage(int damages) {
        this.hitPoints -= damages;
    }

    public boolean isAlive() {
        return this.hitPoints > 0;
    }
}		
