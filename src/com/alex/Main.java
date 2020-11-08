package com.alex;
import ru.ifmo.se.pokemon.*;
import com.alex.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Flygon("Severus",2));
        b.addAlly(new Garbodor("Lucik",2));
        b.addAlly(new Raikou("Tom",2));
        b.addFoe(new Trapinch("Siriu",2));
        b.addFoe(new Trubbish("Rimus",2));
        b.addFoe(new Vibrava("James",2));
        b.go();
    }
}
