package com.pboreg;

import java.util.Scanner;

public class Inputuser {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // Luas = Panjang x Lebar

        System.out.println("Panjang = ");
        panjang = userInput.nextInt();
        System.out.println("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("Menghitung Volume");
        System.out.println("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);


    }
}
