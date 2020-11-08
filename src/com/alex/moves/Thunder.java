package com.alex.moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC,110,70);
    }

    @Override
    protected String describe(){
        return "use Thunder";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!(pokemon.hasType(Type.ELECTRIC)))
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
}
