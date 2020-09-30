package com.pboreg;

public class NestedIF {

    public static void main(String[] args) {

        // Nested if

        int a = 5;
        int b = 10;

        System.out.println("Program Awal");

        if (a == 5) {

            if (b == 10){

                System.out.println("Ini adalah aksi, dimana a = 5 dan b = 10");

            } else {

                System.out.println("Ini adalah dimana a = 5 dan b bukan 10");
            }
        } else {

            System.out.println("Ini adalah dimana a salah");
        }

        System.out.println("Ini adalah akhir program");
    }
}
