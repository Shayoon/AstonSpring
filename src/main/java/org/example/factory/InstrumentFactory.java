package org.example.factory;

import org.example.entity.Guitare;
import org.example.entity.Instrument;
import org.example.entity.Piano;

/**
 * Factory qui a pour rôle d'instancier des instruments
 * @author Quentin
 */

public class InstrumentFactory {

    // toutes les methodes de mes factory sont static
    public static Instrument getGuitare(){
        return new Guitare();
    }

    public static Instrument getGuitare(String model){
        return new Guitare(model);
    }

    public static Instrument getPiano(){
        return new Piano();
    }

    public static Instrument getPiano(String model){
        return new Piano(model);
    }

}
