package com.pboreg;

public class Numeric {

    public static void main(String[] args){

        // Konversi Tipe Data Numerik

        int nilaiInt = 450;
        System.out.println("Nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar

        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil

        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);

        // Casting Pembagian
        float a = 10;
        int b = 4;

        float c = a / b;

        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x / y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
