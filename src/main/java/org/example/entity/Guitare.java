package org.example.entity;

public class Guitare implements Instrument{

    private String model;

    public Guitare(String model) {
        this.model = model;
    }

    public Guitare() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "gling gling gling";
    }
}
