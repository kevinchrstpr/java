package com.tutorial;

class Player {

    private String name;
    private int baseAttack;
    private int level;
    private int baseHealth;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;


    // ini adalah object member
    private Weapon weapon;
    private Armor armor;

    public Player(String name){
        this.name = name;
        this.baseAttack = 100;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public String getName() {
        return this.name;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Max Health\t: " + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower() + "\n");

    }

    public void attack(Player opponent) {
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println("Player: " + this.name + " is attacking : " + opponent.getName() + damage + "\n");
        // attack the opponent
        opponent.defence(damage);

    }

    public void defence(int damage) {

    }

    public int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }
    public int getAttack() {
        return this.attack;
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Bios");
        Armor armor1 = new Armor("Iron Plate", 5, 100);
        Weapon weapon1 = new Weapon("Sword", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Ronin");
        Armor armor2 = new Armor("Harajuku Iron", 1, 40);
        Weapon weapon2 = new Weapon("Axe", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
    }

}