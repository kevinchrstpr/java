package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    // Getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // Setter
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // Setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // Getter
    public double getJari2() {
        return this.diameter/2;
    }

    // complicated getter
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}

public class Main {

    public static void main(String[] args) {
        Data object = new Data();
        //public
        // read and write using public
        object.intPublic = 5; // Write
        System.out.println("Public : " + object.intPublic); // Read

        // read only ( we can use GETTER )
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        // Write only ( we can use SETTER )
        object.setDoublePrivate(0.05);
        object.display();

        // Combining read and write with setter and getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari - jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari - jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());

    }
}