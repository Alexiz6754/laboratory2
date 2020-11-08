package com.alex.moves;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {

    public Discharge(){
        super(Type.ELECTRIC,80,100);
    }

    @Override
    protected String describe(){
        return "use Discharge";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!(pokemon.hasType(Type.ELECTRIC)))
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
}
