import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WaterPokemon extends Pokemon {
    private final String name;
    private int hp;
    private int level;
    private final String food;
    private final String sound;
    private final List<String> attacks;


    public WaterPokemon(String name, int hp, int level, String food, String sound) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.food = food;
        this.sound = sound;
        this.attacks = Arrays.asList("Water Gun", "Bubble Beam", "Hydro Pump", "Surf");
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
        return "Water";
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setHp(int damage) {
        hp = hp - damage;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Surf");
        waterAttack(gymPokemon);
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Hydro Pump");
        waterAttack(gymPokemon);
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Hydro Cannon");
        waterAttack(gymPokemon);
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName()
                + " attacks "
                + gymPokemon.getName()
                + " with Rain Dance");
        // waterAttack(gymPokemon); NIET IVM speciale attack functies
        if(Objects.equals(gymPokemon.getType(), "Fire")){
            System.out.println("It's Super Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 20 hp.");
            gymPokemon.setHp(20);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Electric")){
            System.out.println("Rain Dance Has no effect on " + gymPokemon.getName());
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Grass")){
            System.out.println(gymPokemon.getName()
                    + " get's an hp boost!");
            gymPokemon.setHp(-10);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Water")){
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
    private void waterAttack(Pokemon gymPokemon) {
        if(Objects.equals(gymPokemon.getType(), "Fire")){
            System.out.println("It's Super Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 20 hp.");
            gymPokemon.setHp(20);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Electric")){
            System.out.println("It's Effective!");
            System.out.println(gymPokemon.getName()
                    + " loses 15 hp.");
            gymPokemon.setHp(15);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Grass")){
            System.out.println(gymPokemon.getName()
                    + " loses 10 hp.");
            gymPokemon.setHp(10);
            System.out.println(gymPokemon.getName()
                    + " has "
                    + gymPokemon.getHp()
                    + " hp remaining.");
        }
        if(Objects.equals(gymPokemon.getType(), "Water")){
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