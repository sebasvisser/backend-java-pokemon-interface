import java.util.List;

public abstract class Pokemon {
    protected int level;  // protected so it can be accessed by subclasses

    public abstract String getName();
    public abstract int getHp();
    public int getLevel() {
        return level;
    }
    public abstract String getFood();
    public abstract String getSound();
    public abstract String getType();
    public abstract List<String> getAttacks();

    public abstract void setHp(int damage);

    public void levelUp() {
        level++;
    }
}
