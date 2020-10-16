package com.tutorial;

import java.util.*;

public class Kalkulator2 {

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        int opsi;
        double nilaiAwal, nilaiAkhir, hasil;
        boolean kondisi = true;

        System.out.println("\n\t\tKalkulator 2.0 Kevin Ope");
        System.out.println("\t\t=========================");
        System.out.println("\nOperator yang tersedia :");
        System.out.println("\n1. Tambah \n2. Kurang \n3. Kali \n4. Bagi \n5. Modulus \n6. Pangkat");
        System.out.println("0. Keluar dari program.");

        do{

            System.out.print("\nPilih operator 1 / 2 / 3 / 4 / 5 / 6 / 0 = ");
            opsi = inputUser.nextInt();

            if (opsi == 1){
                System.out.println("\n1. Penjumlahan");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = nilaiAwal + nilaiAkhir;
                System.out.print("\nHasil = " + hasil);

            } else if(opsi == 2){
                System.out.println("\n2. Pengurangan");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = nilaiAwal - nilaiAkhir;
                System.out.println("Hasil = " + hasil);

            } else if(opsi == 3){
                System.out.println("\n3. Perkalian");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = nilaiAwal * nilaiAkhir;
                System.out.println("Hasil = " + hasil);

            } else if(opsi == 4){
                System.out.println("\n4. Pembagian");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = nilaiAwal / nilaiAkhir;
                System.out.println("Hasil = " + hasil);

            } else if (opsi == 5){
                System.out.println("\n5. Modulus");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = nilaiAwal % nilaiAkhir;
                System.out.println("Hasil = " + hasil);

            } else if (opsi == 0){
                System.out.println("Terima kasih telah menggunakan kalkulator kami");
                kondisi = false;

            } else if (opsi == 6){
                System.out.println("6. Pangkat");
                System.out.print("Masukan angka pertama = ");
                nilaiAwal = inputUser.nextDouble();
                System.out.print("Masukan angka kedua = ");
                nilaiAkhir = inputUser.nextDouble();
                hasil = Math.pow(nilaiAwal, nilaiAkhir);
                System.out.println("Hasil = " + hasil);

            } else {
                System.out.println("Anda salah memasukan opsi.");
            }
        } while(kondisi);
    }
}
