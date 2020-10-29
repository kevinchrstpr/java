package com.tutorial;

import java.util.*;

class Polos {
    String dataString;
    int dataInt;
}

// class with constructor

class Mahasiswa {
    Scanner inputUser = new Scanner(System.in);
    String nama;
    String NIM;
    String Jurusan;

//    Mahasiswa() {
//        System.out.print("Ketikan nama anda di sini : ");
//        nama = inputUser.next();
//        System.out.println(nama);
//    }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Jurusan : " + Jurusan);
    }

}

public class Main {

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Kevin", "2019071012", "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Cinthia", "2019071013", "Akuntansi");


//        Polos polos1 = new Polos();
//        polos1.dataString = "Peler";
//        polos1.dataInt = 20;
//
//        System.out.println(polos1.dataString);
//        System.out.println(polos1.dataInt);
    }

}
