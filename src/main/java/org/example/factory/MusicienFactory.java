package org.example.factory;

import org.example.entity.Guitariste;
import org.example.entity.Instrument;
import org.example.entity.Musicien;
import org.example.entity.Pianiste;

public class MusicienFactory {

    public static Musicien getGuitariste(){
        return new Guitariste();
    }

    public static Musicien getGuitariste(String nom){
        return new Guitariste(nom, InstrumentFactory.getGuitare());
    }

    public static Musicien getGuitariste(String nom, String model){
        return new Guitariste(nom, InstrumentFactory.getGuitare(model));
    }

    public static Musicien getPianiste(){
        return new Pianiste();
    }

    public static Musicien getPianiste(String nom){
        return new Pianiste(nom, InstrumentFactory.getPiano());
    }

    public static Musicien getPianiste(String nom, String model){
        return new Guitariste(nom, InstrumentFactory.getPiano(model));
    }


}
