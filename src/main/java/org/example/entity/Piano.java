package org.example.entity;

public class Piano implements Instrument{

    /**
     * Classe Piano qui impémente Instrument
     * @author Quentin
     */

    private String model;

    public Piano(String model) {
        this.model = model;
    }

    public Piano() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "bouloubouloum";
    }
}
