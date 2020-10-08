package com.nirmayaDwi.modul1;

//sebagai Class main / Demo Class
public class Objek {
    public static void main(String[] args) {
        // Deklarasi object tanpa parameter
        // objek   //nama objek
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("Maya");
        mahasiswaTanpa.setNim(19104044);

        //output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 803303533);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());
    }

}
