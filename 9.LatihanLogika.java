package com.pboreg;

import java.util.Scanner;

public class Logicpractice {

    public static void main(String[] args) {

        // Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiDugaan;
        boolean statusDugaan;

        System.out.println("Masukan nilai dugaan anda = ");
        nilaiDugaan = inputUser.nextInt();
        System.out.println("Nilai dugaan anda adalah = " + nilaiDugaan);

        // Operasi Logika
        statusDugaan = (nilaiDugaan == nilaiBenar);
        System.out.println("Dugaan anda = " + statusDugaan);

        // Operasi Aljabar Boolean ( AND / OR )

        System.out.println("Masukan nilai antara 4 dan 9");
        nilaiDugaan = inputUser.nextInt();
        statusDugaan = (nilaiDugaan > 4) && (nilaiDugaan < 9);

        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.println("Dugaan anda = " + statusDugaan);
    }
}
