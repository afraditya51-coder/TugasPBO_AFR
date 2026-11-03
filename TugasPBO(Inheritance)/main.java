package tugas_pbo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(9);
        BangunDatar persegiPanjang = new PersegiPanjang(8, 4);
        BangunDatar segitiga = new Segitiga(5, 7);
 
        tampilkan(persegi);
        tampilkan(lingkaran);
        tampilkan(persegiPanjang);
        tampilkan(segitiga);
    }
 
    // Menerima parent class, method yang dipanggil milik child
    static void tampilkan(BangunDatar bangun) {
        System.out.println("--- " + bangun.getNama() + " ---");
        System.out.printf("Luas     : %.2f%n", bangun.luas());
        System.out.printf("Keliling : %.2f%n", bangun.keliling());
        System.out.println();
    }
}
