package org.example.entity;

public class Guitariste implements Musicien{
    private String nom;
    private Instrument guitare;

    public Guitariste(String nom, Instrument guitare) {
        this.nom = nom;
        this.guitare = guitare;
    }

    public Guitariste() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getGuitare() {
        return guitare;
    }

    public void setGuitare(Instrument guitare) {
        this.guitare = guitare;
    }

    @Override
    public void jouer() {
        System.out.println(this.getNom() + " Joue : "+ this.guitare);
    }
}
