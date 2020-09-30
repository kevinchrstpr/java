package com.pboreg;

public class Tugasnestedif {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Program Awal");
        if (a == 5) {
            System.out.println("ini adalah aksi dimana a == 5");
        } else {
            if (b == 10) {
                System.out.println("ini adalah aksi dimana a != 5 dan b == 10");
            } else {
                if (a < 10) {
                    System.out.println("ini adalah aksi dimana a != 5 dan b !== 10 tetapi a < 10");
                } else {
                    System.out.println("ini adalah aksi dimana a != 5 dan b != 10 tetapi a >= 10");
                }
            }
        }
    }
}
