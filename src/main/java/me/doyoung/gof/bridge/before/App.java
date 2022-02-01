package me.doyoung.gof.bridge.before;

import me.doyoung.gof.bridge.Champion;

public class App {
    public static void main(String[] args) {
        final Champion kdaAri = new KDAAri();
        kdaAri.move();
    }
}
