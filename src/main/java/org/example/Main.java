package org.example;

import org.example.entity.Guitare;
import org.example.entity.Guitariste;
import org.example.entity.Musicien;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ dependance directe =============");
        dependanceDirecte();
    }

    private static void dependanceDirecte() {
        Musicien leMusicien = new Guitariste("Bob", new Guitare("power 3000"));
        leMusicien.jouer();
    }
}
