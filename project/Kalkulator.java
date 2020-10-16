package com.tutorial;

import java.util.*;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        double angkaPertama, angkaKedua, hasil;
        int opsi;

        System.out.println("\t\tKalkulator Ope");
        System.out.println("\nPilih salah satu opsi \n 1. Tambah \n 2. Kurang \n 3. Kali \n 4. Bagi");
        System.out.print("Opsi anda = ");
        opsi = inputUser.nextInt();

        if (opsi == 1) {

            System.out.print("Masukan angka pertama = ");
            angkaPertama = inputUser.nextDouble();
            System.out.print("Masukan angka kedua = ");
            angkaKedua = inputUser.nextDouble();
            hasil = angkaPertama + angkaKedua;
            System.out.println("Hasil = " + hasil);

        } else if (opsi == 2) {

            System.out.print("Masukan angka pertama = ");
            angkaPertama = inputUser.nextDouble();
            System.out.print("Masukan angka kedua = ");
            angkaKedua = inputUser.nextDouble();
            hasil = angkaPertama - angkaKedua;
            System.out.println("Hasil = " + hasil);

        } else if (opsi == 3) {

            System.out.print("Masukan angka pertama = ");
            angkaPertama = inputUser.nextDouble();
            System.out.print("Masukan angka kedua = ");
            angkaKedua = inputUser.nextDouble();
            hasil = angkaPertama * angkaKedua;
            System.out.println("Hasil = " + hasil);

        } else if (opsi == 4) {

            System.out.print("Masukan angka pertama = ");
            angkaPertama = inputUser.nextDouble();
            System.out.print("Masukan angka kedua = ");
            angkaKedua = inputUser.nextDouble();
            hasil = angkaPertama / angkaKedua;
            System.out.println("Hasil = " + hasil);
        } else {

            System.out.println("Opsi anda salah");

        }

    }

}
