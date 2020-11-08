package com.alex.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.alex.moves.*;

public class Trubbish extends Pokemon{
    public Trubbish(String name,int lvl){
        super(name,lvl);
        this.setStats(50,50,62,40,62,65);
        this.setType(Type.POISON);
        this.setMove(new Amnesia(),new Facade(),new DoubleSlap());
    }
}
