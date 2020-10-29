package com.tutorial;

// Player
class Player {
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("Name    : " + this.name);
        System.out.println("Health  : " + this.health + " HP");
        System.out.println("Level   : " + this.level);
        this.weapon.display();
        this.armor.display();
    }
}

// Weapon
class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name + ", Attack : " + this.attackPower);
    }

}
// Armor
class Armor {
    double defensePower;
    String name;

    Armor(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    void display(){
        System.out.println("Armor   : " + this.name + ", Deff : " + this.defensePower);
    }
}

public class Main {

    public static void main(String[] args) {

        // Membuat object player
        Player player1 = new Player("Kevin", 100, 1);
        Player player2 = new Player("Cinthia", 150, 5);

        // Membuat object weapon
        Weapon sword = new Weapon("Sword",15);
        Weapon arrow = new Weapon("Arrow", 20);

        // Membuat object armor
        Armor armor = new Armor("Iron Plate",10);
        Armor armor1 = new Armor("Breast Plate", 25);

        // Equip weapon dan armor
        player1.equipWeapon(sword);
        player1.equipArmor(armor);
        player1.display();

        player2.equipWeapon(arrow);
        player2.equipArmor(armor1);
        player2.display();

    }

}
