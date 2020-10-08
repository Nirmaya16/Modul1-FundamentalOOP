package com.nirmayaDwi.modul1.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //Constructor Pertama
    public Manusia(){}

    //Constructor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}



