
public abstract class Fighter {

    protected int hitPoints;

    public Fighter(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int hitPoints() {
        return Math.max(this.hitPoints, 0);
    }

    public abstract void attack(Fighter other);
}		
