package com.alex.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.alex.moves.*;

public class Trapinch extends Pokemon{
    public Trapinch(String name,int lvl){
        super(name,lvl);
        this.setStats(45,100,45,45,45,10);
        this.setType(Type.GROUND);
        this.setMove(new MudSlap(),new DoubleTeam());
    }
}
