import java.util.List;

public class GrassPokemon implements Pokemon {
    private String name;
    private int hp;
    private int level;
    private String food;
    private String sound;

    public GrassPokemon(String name, int hp, int level, String food, String sound) {
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

    @Override
    public List<String> getAttacks() {
        return null;
    }

    @Override
    public void setHp(int damage) {
        hp = hp - damage;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}