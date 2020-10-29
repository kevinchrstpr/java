package com.tutorial;

class Buku {
    String judul;
    String penulis;

    Buku (String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("\nPenulis\t: " + this.penulis);
    }
}

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku("A brief history of time", "Stephen Hawking");
        buku1.display();

        String addressBuku = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku);

        // Assignment object
        Buku buku2 = buku1;
        buku2.display();

        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // cause buku1 and buku2 is in the same reference/address
        buku1.judul = "History perjalanan";
        buku1.display();
        buku2.display();

        // we will input object inside methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi : " + addressDataBuku);
        dataBuku.penulis = "Stephen Hauw";
    }
}
