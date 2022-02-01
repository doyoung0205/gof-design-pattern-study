package me.doyoung.gof.bridge.after;

import me.doyoung.gof.bridge.Champion;

public class App {
    public static void main(String[] args) {
        Champion ari = new Ari(new PoolParty());
        ari.move();
        ari.skillE();
    }
    // Portable Service Abstraction
}
