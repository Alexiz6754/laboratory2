package com.alex.pokemons;

import ru.ifmo.se.pokemon.Type;
import com.alex.moves.*;

public class Garbodor extends Trubbish {
    public Garbodor(String name, int lvl) {
        super(name, lvl);
        this.setStats(80,95,82,60,82,75);
        //По идее не обязательно, так как вызывается super() от Trubbish с таким же типом
        //Но оставлено для очевидности происходящего
        this.setType(Type.POISON);
        this.setMove(new Amnesia(),new Facade(),new DoubleSlap(),new BodySlam());
    }
}
