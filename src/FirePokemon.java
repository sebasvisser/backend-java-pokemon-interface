import java.util.List;

public class FirePokemon implements Pokemon {
    private String name;
    private int hp;
    private int level;
    private String food;
    private String sound;
    private List<String> attacks;

    public FirePokemon(String name, int hp, int level, String food, String sound) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String getType() {
        return null;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }
}