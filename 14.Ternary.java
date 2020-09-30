package com.pboreg;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        // Ternary Operator
        // Variable x = ekspresi ? statement_true : statement_false

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan nilai = ");
        input = inputUser.nextInt();
        System.out.println(input);

        x = (input == 10) ? input * input : input/2;

//      jika memakai if
//      if (input == 10){
//          x = input * input;
//      }else{
//          x = input/2;
//      }

        System.out.println("Hasilnya adalah = " + x);

    }
}
