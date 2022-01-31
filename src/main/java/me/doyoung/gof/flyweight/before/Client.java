package me.doyoung.gof.flyweight.before;

import me.doyoung.gof.flyweight.before.Character;

public class Client {
    public static void main(String[] args) {
        final FontFactory fontFactory = new FontFactory();
        final Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        final Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        final Character c3 = new Character('l', "white", fontFactory.getFont("Nanum:12"));
    }
}
