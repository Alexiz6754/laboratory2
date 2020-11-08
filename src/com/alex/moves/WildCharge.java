package com.alex.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
    public WildCharge(){
        super(Type.ELECTRIC,90,100);
    }

    @Override
    protected String describe(){
        return "use Wild Charge";
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
       pokemon.setMod(Stat.HP,(int)Math.round(v)/4);
    }
}
