package com.alex.pokemons;

import com.alex.moves.*;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch {
    public Vibrava(String name,int lvl){
        super(name,lvl);
        this.setStats(50,70,50,50,50,70);
        this.setType(Type.GROUND,Type.DRAGON);
        this.setMove(new MudSlap(),new DoubleTeam(),new BugBuzz());
    }
}