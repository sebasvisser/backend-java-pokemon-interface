import java.util.List;
import java.util.Objects;

public class FirePokemon implements Pokemon {
    private final String name;
    private int hp;
    private int level;
    private final String food;
    private final String sound;
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
        return "Fire";
    }

    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setHp(int damage) {
        hp = hp - damage;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Inferno");
        fireAttack(gymPokemon);
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Pyro Ball");
        fireAttack(gymPokemon);
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Flame Thrower");
        fireAttack(gymPokemon);
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Flame Thrower");
        fireAttack(gymPokemon);
    }

    private void fireAttack(Pokemon gymPokemon) {
        if(Objects.equals(gymPokemon.getType(), "Grass")){
            System.out.println("It's Super Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 20 hp.");
            gymPokemon.setHp(20);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Water")){
            System.out.println("It's Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 15 hp.");
            gymPokemon.setHp(15);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Electric")){
            System.out.println(gymPokemon.getName()
                    + " loses 10 hp.");
            gymPokemon.setHp(10);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Fire")){
            System.out.println("It's Not Very Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 5 hp.");
            gymPokemon.setHp(5);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
    }
    public void levelUp(){
        level++;
    }
}