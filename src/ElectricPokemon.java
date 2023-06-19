import java.util.List;

public class ElectricPokemon implements Pokemon {
    private String name;
    private int hp;
    private int level;
    private String food;
    private String sound;

    public ElectricPokemon(String name, int hp, int level, String food, String sound) {
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

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}