package com.tutorial;

class Player {

    private String name;
    private int baseHealth;
    private Armor armor;
    private int level;
    private int incrementHealth;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementHealth = 20;
    }

    public void display() {
        System.out.println("Player : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("Max Health : " + this.maxHealth());
    }

    public void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealt() * 10;
    }
}

class Armor {

    private String name;
    private int strength;
    private int health;
    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealt() {
        return this.strength * 10 + this.health;
    }

    public int getStrength(){
        return this.strength;
    }

}

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Kevin");
        Armor armor1 = new Armor("Iron Plate", 5, 100);
        player1.setArmor(armor1);

        player1.display();

    }

}
