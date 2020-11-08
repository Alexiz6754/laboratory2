package com.alex.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.alex.moves.*;

public class Raikou extends Pokemon {
    public Raikou(String name, int lvl){
        super(name,lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(90,85,75,115,100,115);
        this.setMove(new Discharge(),new DoubleTeam(), new WildCharge(), new Thunder());
    }

}
