package com.alex.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleSlap extends PhysicalMove {
    public DoubleSlap(){
        super(Type.NORMAL,15,85);
        super.hits = slapCount();
    }

    @Override
    protected String describe(){
        return "use Double Slap";
    }

    //Рассчет кол-ва ударов за ход
    //Вынесен в отдельный метод для удобства
    private int slapCount(){
        int hits = 1;
        for (int i = 0;i < 4;++i) {
            if (Math.random() <= 3 / 8 && i < 2)
                ++hits;
            else if (Math.random() <= 1/8)
                ++hits;
            else break;
        }
        return hits;
    }
}
