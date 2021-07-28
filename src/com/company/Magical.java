package com.company;

public class Magical extends Player{

    private String magic;

    public Magical(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Magical() {
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }
}