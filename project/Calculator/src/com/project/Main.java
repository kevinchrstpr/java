package com.project;

import java.util.*;

public class Main {
    static double add(double x, double y){
        return x + y;
    }
    static double subs(double x, double y){
        return x - y;
    }
    static double multiply(double x, double y){
        return x * y;
    }
    static double divide(double x, double y){
        return x / y;
    }
    static double modulus(double x, double y){
        return x % y;
    }
    static double square(double x, double y){
        return Math.pow(x, y);
    }
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int opsi;
        double x,y;
        boolean kondisi = true;
        System.out.println("\n\t\tKalkulator 3.0 Kevin Ope");
        System.out.println("\t\t=========================");
        System.out.println("\nAvailable Operators : ");
        System.out.println("\n1. Addition \n2. Substraction \n.3 Multiplication \n4. Divide \n5 MOdulus \n6. Square \n0. Exit");

        do{
            System.out.print("\nChoose one of these options 1 / 2 / 3 / 4 / 5 / 6 / 0 = ");
            opsi = inputUser.nextInt();

            if (opsi == 1){
                System.out.println("\n 1. Addition");
                System.out.print("\nInput numbers to calculate : ");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + add(x,y));
            } else if(opsi == 2){
                System.out.println("\n2. Substraction");
                System.out.print("Input numbers to calculate :");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + subs(x, y));
            } else if (opsi == 3){
                System.out.println("\n3. Multiplication");
                System.out.print("Input numbers to calculate : ");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + multiply(x, y));
            } else if (opsi == 4){
                System.out.println("\n4. Divide");
                System.out.print("Input numbers to calculate : ");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + divide(x, y));
            } else if (opsi == 5){
                System.out.println("\n5. Modulus");
                System.out.print("Input numbers to calculate : ");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + modulus(x, y));
            } else if (opsi == 6){
                System.out.println("\n6. Square");
                System.out.print("Input numbers to calculate : ");
                x = inputUser.nextDouble();
                System.out.print("Second numbers : ");
                y = inputUser.nextDouble();
                System.out.println("Result : " + square(x, y));
            } else if (opsi == 0){
                System.out.println("\nThanks for using our calculator!");
                kondisi = false;
            } else {
                System.out.println("Wrong operators! Please type \n'1' For Addition \n'2' For Substraction \n'3' For Multiplication \n'4' For Divide \n'5' For Modulus \n'6' For Square \n'0' to Exit ");
            }

        }while (kondisi);

    }

}
