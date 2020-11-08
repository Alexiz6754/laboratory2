package com.alex.pokemons;

import ru.ifmo.se.pokemon.Type;
import com.alex.moves.*;

public class Flygon extends Vibrava{
    public Flygon(String name,int lvl){
        super(name,lvl);
        this.setStats(80,100,80,80,80,100);
        this.setType(Type.GROUND,Type.DRAGON);
        this.setMove(new MudSlap(),new DoubleTeam(),new BugBuzz(),new Facade());
    }
}
