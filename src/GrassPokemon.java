import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GrassPokemon extends Pokemon {
    private final String name;
    private int hp;
    private int level;
    private final String food;
    private final String sound;
    private final List<String> attacks;


    public GrassPokemon(String name, int hp, int level, String food, String sound) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.food = food;
        this.sound = sound;
        this.attacks = Arrays.asList("Vine Whip", "Razor Leaf", "Solar Beam", "Leaf Storm");
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
        return "Grass";
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setHp(int damage) {
        hp = hp - damage;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Leaf Storm");
        grassAttack(gymPokemon);
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Solar Beam");
        grassAttack(gymPokemon);
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Leech Seed");
        grassAttack(gymPokemon);
        if(Objects.equals(gymPokemon.getType(), "Electric")){
            pokemon.setHp(-20);
            System.out.println(pokemon.getName() + " stole 20 hp.");
        }
        if(Objects.equals(gymPokemon.getType(), "Fire")){
            pokemon.setHp(-15);
            System.out.println(pokemon.getName() + " stole 15 hp.");
        }
        if(Objects.equals(gymPokemon.getType(), "Water")){
            pokemon.setHp(-10);
            System.out.println(pokemon.getName() + " stole 10 hp.");
        }
        if(Objects.equals(gymPokemon.getType(), "Grass")){
            pokemon.setHp(-5);
            System.out.println(pokemon.getName() + " stole 5 hp.");
        }
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Leave Blade");
        grassAttack(gymPokemon);
    }

    private void grassAttack(Pokemon gymPokemon) {
        if(Objects.equals(gymPokemon.getType(), "Electric")){
            System.out.println("It's Super Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 20 hp.");
            gymPokemon.setHp(20);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Fire")){
            System.out.println("It's Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 15 hp.");
            gymPokemon.setHp(15);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Water")){
            System.out.println(gymPokemon.getName()
                    + " loses 10 hp.");
            gymPokemon.setHp(10);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Grass")){
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