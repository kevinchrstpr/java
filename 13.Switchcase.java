package com.pboreg;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {

        // switch case

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama = ");
        input = inputUser.next();

        // ekspresinya berupa satuan(int,long,byte,short), String, atau enum

        switch (input){
            case "otong":
                System.out.println("Otong Hadir");
                break;
            case "ope":
                System.out.println("Ope hadir");
                break;
            default:
                System.out.println("Dia tidak hadir");
        }
        System.out.println("Program Selesai");

    }
}
