package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kondisi = true;
        double opsi = 0;
        double totalJam = 0;
        int golongan = 0;
        Golongan gol = new Golongan();
        Perhitungan perhitungan = new Perhitungan();

//        System.out.println(total.getTotalBayar1());
//        System.out.println(total.getTotalBayar2());
//        System.out.println(total.getTotalBayar3());
//        System.out.println(total.getTotalBayar4());

        System.out.print("Masukan jam kerja : ");
        totalJam = input.nextDouble();
        System.out.println("Jam lembur : " + perhitungan.getTotalJam(totalJam));
        System.out.println("Uang lembur : " + perhitungan.getUangLembur(perhitungan.getTotalJam(totalJam)));
        double a = perhitungan.getUangLembur(perhitungan.getTotalJam(totalJam));
        System.out.println(perhitungan.getTotalBayar1());
        System.out.println("Total Bayar : " + perhitungan.getBayar1(a));

// 7430, 1478570,248750











//        do {
//            System.out.print("Pilih golongan anda ( 1 / 2 / 3 / 4 ) :");
//            golongan = input.nextInt();
//            if (golongan == 1){
//                System.out.println("Total gaji dan tunjangan anda : " + total.getTotalBayar1());
////                System.out.print("Masukan jam kerja : ");
////                totalJam = input.nextDouble();
////                System.out.println("Total jam lembur : " + total.getTotalJam(totalJam));
////                System.out.println("Uang lembur : " + total.getUangLembur(total.getTotalJam(totalJam)));
//            } else {
//                kondisi = false;
//            }
//        } while (kondisi);









    }

}
