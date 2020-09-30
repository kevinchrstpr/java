package com.pboreg;

public class Unary {

    public static void main(String[] args){

        // Unary = operasi yang dilakukan pada satu variable

        int angka = 1;
        System.out.printf("Unary '-', %d menjadi %d\n",angka,-angka);
        System.out.printf("Unary '+', %d menjadi %d\n",angka,+angka);

        // Unary decrement and increment

        int angka2 = 10;
        angka2++; // ini increment
        System.out.println("Nilai dengan ++ menjadi = " + angka2);

        int angka3 = 10;
        angka3--; // ini decrement
        System.out.println("Nilai dengan -- menjadi = " + angka3);

        int a = 5;
        System.out.printf("Nilai prefix = %d\n", ++a);
        int b = 5;
        System.out.printf("Nilai postfix = %d\n", b++);
        System.out.printf("Nilai postfix = %d\n", b);

        // unary boolean dengan ! untuk negasi

        boolean ope = true;
        System.out.println("Nilai boolean = " + ope);
        System.out.println("Nilai boolean = " + !ope);
    }
}
