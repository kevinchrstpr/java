package com.pboreg;

public class Comparations {

    public static void main(String[] args){

        // Operator Komparasi, akan megnhasilkan boolean

        int a,b;
        boolean hasilKomparasi;

        // operator equal
        System.out.println("===Persamaan===");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator not equal
        System.out.println("===Pertidaksamaan===");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator less than
        System.out.println("===Kurang dari===");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator greater than
        System.out.println("===Lebih dari===");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator less than equal
        System.out.println("===Kurang dari sama dengan===");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator greater than equal
        System.out.println("===Lebih dari sama dengan===");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);
    }
}
