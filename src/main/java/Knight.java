
public class Knight extends Fighter {

    public Knight() {
        super(100);
    }

    @Override
    public void attack(Fighter other) {
        if (this.isAlive()) {
            other.takeDamage(5);
            other.attack(this);
        }
    }

    @Override
    public void takeDamage(int damages) {
        super.takeDamage(damages - 2);
    }
}
