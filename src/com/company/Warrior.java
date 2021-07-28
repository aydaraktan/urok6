package com.company;

public class Warrior extends Player{

    private String superNatural;

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Warrior() {
    }

    public Warrior(String name, int health, int damage, String superNatural) {
        super(name, health, damage);
        this.superNatural = superNatural;
    }

    public String getSuperNatural() {
        return superNatural;
    }

    public void setSuperNatural(String superNatural) {
        this.superNatural = superNatural;
    }
}