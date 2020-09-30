package com.pboreg;

public class Operator {

    public static void main(String[] args){

        // Operator Aritmatika

        int var1 = 10;
        int var2 = 5;

        int hasil;

        //  1. Penjumlahan ( Addition )

        hasil = var1 + var2;
        System.out.println(hasil);
        System.out.println(var1 + " + " + var2 + " = " + hasil);

        //  2. Pengurangan ( Substraction )

        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n",var1,var2,hasil);
        //  3. Perkalian   ( Multiplication )

        hasil = var1 * var2;
        System.out.println(hasil);
        System.out.println(var1 + " x " + var2 + " = " + hasil);

        //  4. Pembagian   ( Divide )

        hasil = var1 / var2;
        System.out.println(hasil);
        System.out.println(var1 + " / " + var2 + " = " + hasil);

        float a = 6;
        float b = 4;
        float hasilFloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        //  5. Modulus

        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d \n",var1,var2,hasil);
    }
}