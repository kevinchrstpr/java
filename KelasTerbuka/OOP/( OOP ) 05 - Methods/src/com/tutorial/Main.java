package com.tutorial;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // Method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM()  {
        return this.NIM;
    }

    // method dengan return dan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }

}

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Kevin", "2019071012");
        //method
        mahasiswa1.show();
        mahasiswa1.setNama("ope");
        mahasiswa1.show();

        System.out.println("Nama : " + mahasiswa1.getNama());
        System.out.println("NIM : " + mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Ganteeng");
        System.out.println(data);

        Dosen dosen1 = new Dosen("Otong");
        System.out.println(dosen1.nama);
    }

}
