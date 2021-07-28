package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Список персонажей с их характеристиками:");
        System.out.println();

        Boss boss = new Boss("Alex",500,50);
        System.out.println("Имя персонажа: " + boss.getName() + ", жизнь равна: " + boss.getHealth() + ", сила удара: " + boss.getDamage());
        boss.smile();
        System.out.println("______________________________________________________________________");

        Warrior warrior = new Warrior("Stew", 300, 30, "Rich");
        System.out.printf("Имя персонажа: %s, жизнь равна: %s, сила удара: %d, суперспособность: %s\n", warrior.getName(), warrior.getHealth(), warrior.getDamage(), warrior.getSuperNatural());
        System.out.println("______________________________________________________________________");

        Magical magical = new Magical();
        magical.setName("Андрей");
        magical.setHealth(200);
        magical.setDamage(40);
        magical.setMagic("Абра кадабра");
        System.out.print("Имя персонажа: " + magical.getName());
        System.out.print(", жизнь равна: " + magical.getHealth());
        System.out.print(", сила удара : " + magical.getDamage());
        System.out.print(", магия: " + magical.getMagic());
        System.out.print("\n______________________________________________________________________\n");

        Mental mental = new Mental("Боб", 100, 10);
        mental.setMental("IQ 500");
        String name = mental.getName();
        int health = mental.getHealth();
        int damage = mental.getDamage();
        String mental0 = mental.getMental();
        System.out.println("Имя персонажа " + name + ", жизнь равна: " + health + ", сила удара: " + damage + ", разум " + mental0);
    }
}