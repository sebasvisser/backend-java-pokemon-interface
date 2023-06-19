import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }
}
