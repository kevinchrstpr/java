package com.pboreg;

import java.util.Scanner;

public class LatihanKalkulator {

    public static void main(String[] args) {

        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user = " + a + " " + operator + " " + b);

        //operator tersedia x / + -

        if(operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);

        } else if(operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);

        } else if(operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hinga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else if(operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else {
            System.out.println("operator not found");
        }
    }
}
