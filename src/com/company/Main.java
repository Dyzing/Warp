package com.company;

public class Main {

    public static void main(String[] args) {
        Warp warp = Warp.getInstance();
        System.out.println("Nous sommes an 41e siècle et l’humanité arpente l’espace et a rencontré une pléniade de races\n" +
                "extraterrestres. Une dimension immatérielle, nommé le Warp, a aussi été découverte et est\n" +
                "exploitée par plusieurs races. Elle est peuplée d’entités puissantes qui offrent écoute, pouvoir\n" +
                "et connaissance aux êtres dignes de leur attention.\n\n");
        warp.run();
    }
}
