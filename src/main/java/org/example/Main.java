package org.example;

import configuration.ApplicationConfiguration;
import org.example.entity.*;
import org.example.factory.MusicienFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        System.out.println("==== Utilisation d'une cleasse de configuration======");
        withACinClasse();
    }

    private static void withACinClasse() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Instrument laCornemuse = context.getBean(Cornemuse.class);
        System.out.println(laCornemuse.toString());
        Musicien leMusicien = context.getBean(Sonneur.class);
        leMusicien.jouer();


        context.close();
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
