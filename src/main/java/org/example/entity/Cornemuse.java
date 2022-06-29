package org.example.entity;

import org.example.entity.Instrument;

public class Cornemuse implements Instrument {
    private String model;

    public Cornemuse(String model) {
        this.model = model;
    }

    public Cornemuse() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "Pfzit Pfzit Pfout";
    }
}
