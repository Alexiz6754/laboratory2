package com.alex.moves;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL,85,100);
    }

    @Override
    protected String describe(){
        return "use Body Slam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!(pokemon.hasType(Type.ELECTRIC)))
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
}
