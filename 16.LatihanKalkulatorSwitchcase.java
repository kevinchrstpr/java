package com.pboreg;

import java.util.Scanner;

public class LatihanKalkulator2 {

    public static void main(String[] args) {

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);
        System.out.println("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.println("Operator = ");
        operator = inputUser.next();
        System.out.println("Nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case"+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case"-":
                //penngurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case"*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case"/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
        }

    }
}
