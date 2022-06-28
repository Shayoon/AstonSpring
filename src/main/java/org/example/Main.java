package org.example;

import org.example.entity.Guitare;
import org.example.entity.Guitariste;
import org.example.entity.Musicien;
import org.example.factory.MusicienFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ dependance directe =============");
        dependanceDirecte();
        System.out.println("================ Injection de dependance =============");
        injectionDependance();
    }

    public static void injectionDependance(){
        Musicien leMusicien = MusicienFactory.getGuitariste("Michel", "MicheloGuitare");
        leMusicien.jouer();
        Musicien lePianiste = MusicienFactory.getPianiste("Fred","Yamaha");
        lePianiste.jouer();
    }

    private static void dependanceDirecte() {
        Musicien leMusicien = new Guitariste("Bob", new Guitare("power 3000"));
        leMusicien.jouer();
    }
}
