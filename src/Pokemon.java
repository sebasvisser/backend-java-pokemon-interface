import java.util.List;

public interface Pokemon {
    String getName();
    int getHp();
    int getLevel();
    String getFood();
    String getSound();
    String getType();
    List<String> getAttacks();

    void setHp(int damage);
}
