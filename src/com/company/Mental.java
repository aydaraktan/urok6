package com.company;


public class Mental extends Player{

    private String mental;

    public Mental(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Mental() {
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }
}
