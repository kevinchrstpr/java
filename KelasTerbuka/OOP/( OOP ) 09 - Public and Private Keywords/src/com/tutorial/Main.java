package com.tutorial;

class Player {
    String name; // Default
    public int exp; // public, can be read and written from outside class
    private int health; // private, only can be read and written inside class

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    //default modifier access
    void display(){
        tambahExp(); // example of accessing the private methods
        System.out.println("\nName\t : " + this.name);
        System.out.println("Exp\t\t : " + this.exp);
        System.out.println("Health\t : " + this.health);
    }

    // public
    public void ubahNama(String namaBaru){
        this.name = namaBaru;
    }

    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main {

    public static void main(String[] args){
        Player player1 = new Player("Kevin", 0,100);

        // Default
        System.out.println(player1.name); // membaca data
        player1.name = "Ope";
        System.out.println(player1.name);

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 10;
        System.out.println(player1.exp);

        // private ( cannot be accessed )
//        System.out.println(player1.health); // membaca data
//        player1.health = 200;
//        System.out.println(player1.health);

        //methods

        //default
        player1.display();
        //public
        player1.ubahNama("Gans");
        player1.display();

        // private
        //player1.tambahExp();
    }

}
