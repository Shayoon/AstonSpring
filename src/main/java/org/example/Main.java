package org.example;

import org.example.entity.Guitare;
import org.example.entity.Guitariste;
import org.example.entity.Musicien;
import org.example.factory.MusicienFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ dependance directe =============");
        dependanceDirecte();
        System.out.println("================ Injection de dependance =============");
        injectionDependance();
        System.out.println("====== utilisation d'une application context en xml ====");
        withApplicationContext();
    }

    private static void withApplicationContext() {
        AbstractApplicationContext context  = new ClassPathXmlApplicationContext("application-context.xml");
        Musicien leMusicien = (Musicien) context.getBean("guitariste");
        leMusicien.jouer();
        Musicien lePianiste = (Musicien) context.getBean("pianiste");
        lePianiste.jouer();
        context.close();
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
