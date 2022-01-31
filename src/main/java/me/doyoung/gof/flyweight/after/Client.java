package me.doyoung.gof.flyweight.after;

public class Client {
    public static void main(String[] args) {
        final Character c1 = new Character('h', "white", "Nanum", 12);
        final Character c2 = new Character('e', "white", "Nanum", 12);
        final Character c3 = new Character('l', "white", "Nanum", 12);
        final Character c4 = new Character('l', "white", "Nanum", 12);
        final Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
