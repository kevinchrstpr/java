package com.tutorial;

public class Perhitungan extends Golongan {
    public double totalGajiTunjangan;
    private double bunga;
    private double jamKerja;
    private double jamLembur;
    private double uangLembur;

    Perhitungan(){
        this.totalGajiTunjangan = 0;
        this.bunga = 0.5 / 100;
        this.jamKerja = 173;
        this.jamLembur = 0;
        this.uangLembur = 20000;
    }

    public double getBungaGaji1(){
        return this.gajiSatu * this.bunga;
    }
    public double getBungaGaji2(){
        return this.gajiDua * this.bunga;
    }
    public double getBungaGaji3(){
        return this.gajiTiga * this.bunga;
    }
    public double getBungaGaji4(){
        return this.gajiEmpat * this.bunga;
    }

    public double getBungaTunjangan1(){
        return this.tunjanganSatu * this.bunga;
    }
    public double getBungaTunjangan2(){
        return this.tunjanganDua * this.bunga;
    }
    public double getBungaTunjangan3(){
        return this.tunjanganTiga * this.bunga;
    }
    public double getBungaTunjangan4(){
        return this.tunjanganEmpat * this.bunga;
    }

    public double getTotalJam(double a) {
        return this.jamLembur = a - this.jamKerja;
    }
    public double getUangLembur(double a) {
        return a * this.uangLembur;
    }
    public double getTotalBayar1() {
        return (this.gajiSatu - getBungaGaji1() + this.tunjanganSatu - getBungaTunjangan1());
    }
    public double getTotalBayar2() {
        return this.gajiDua - getBungaGaji2() + this.tunjanganDua - getBungaTunjangan2();
    }
    public double getTotalBayar3() {
        return this.gajiTiga - getBungaGaji3() + this.tunjanganTiga - getBungaTunjangan3();
    }
    public double getTotalBayar4() {
        return this.gajiEmpat - getBungaGaji4() + this.tunjanganEmpat - getBungaTunjangan4();
    }
    public double getBayar1(double totalJam){
        return getUangLembur(totalJam) + getTotalBayar1();
    }
}
