package org.example.entity;

import org.example.entity.Instrument;
import org.example.entity.Musicien;

public class Sonneur implements Musicien {
    private String nom;
    private Instrument cornemuse;

    public Sonneur(String nom, Instrument cornemuse) {
        this.nom = nom;
        this.cornemuse = cornemuse;
    }

    public Sonneur() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getCornmuse() {
        return cornemuse;
    }

    public void setPiano(Instrument cornemuse) {
        this.cornemuse = cornemuse;
    }

    @Override
    public void jouer() {
        System.out.println(this.getNom()+" joue : "+ this.getCornmuse());
    }
}
