package com.alex.moves;

import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    @Override
    protected String describe(){
        return "use Facade";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status state = pokemon.getCondition();
        if (state.equals(Status.BURN) || state.equals(Status.POISON) || state.equals(Status.PARALYZE))
            pokemon.setMod(Stat.HP,(int)Math.round(v) * 2);
    }
}
