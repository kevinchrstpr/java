package com.pboreg;

import java.util.Scanner;

public class Pengelompokan {

    public static void main(String[] args) {

        // Perkalian dan Pembagian akan di lakukan terlebih dahulu
        // BODMAS Body of Division, Multiplication, Addition, and Substraction
        int hasil = 10 / 2 + 2 * 5;
        System.out.println(hasil);
        int hasil2 = 5 + 2 - 10;
        System.out.println(hasil2);

        // Menggunakan pengelompokan operasi ( ) parenthesis
        hasil = 5 * (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //Perhitungan persamaan kuadrat
        System.out.println("Persamaan Kuadrat");
        int m,x,c;

        System.out.println("Nilai x = ");
        x = userInput.nextInt();
        System.out.println("Gradient m = ");
        m = userInput.nextInt();
        System.out.println("Bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("Nilai y = " + y);

    }
}
