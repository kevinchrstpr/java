package com.pboreg;

public class Logic {

    public static void main(String[] args){

        // operator logika --> tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;

        // OR / atau (||)

        System.out.println("=== OR (||) ===");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)
        System.out.println("=== AND ===");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR (^)
        System.out.println("=== XOR ===");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / Negasi !=
        System.out.println("=== NOT ===");
        a = true;
        c = !a;
        System.out.println(a + "--> (!) = " +c);

    }
}
