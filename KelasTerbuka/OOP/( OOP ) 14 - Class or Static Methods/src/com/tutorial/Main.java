package com.tutorial;

import java.util.ArrayList;

class Player {

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show() {
        System.out.println("Player name = " + this.name);
    }

    // ini adalah static method
    static void showNumberOfPlayer() {
        System.out.println("Number of Player : " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }

}

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Kevin");
        Player player2 = new Player("Ope");
        Player player3 = new Player("Cinthia");
        Player player4 = new Player("Cece");

        player1.show();
        player2.show();
        player3.show();

        Player.showNumberOfPlayer();

        System.out.println("Names : " + Player.getNames());
        //System.out.println("Names : " + player1.getNames()); // bisa dilakukan

    }

}