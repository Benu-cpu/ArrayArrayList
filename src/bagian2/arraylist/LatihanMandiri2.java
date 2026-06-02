package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // --- Latihan 1: Daftar Belanja ---
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Beras");
        daftarBelanja.add("Telur");  // Ini item ke-2 (indeks 1)
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Gula");

        daftarBelanja.remove(1); // Menghapus item ke-2 (Telur)

        System.out.println("======= Latihan Mandiri 2.1 =======");
        System.out.println("Isi Daftar Belanja: " + daftarBelanja);
        System.out.println("Jumlah akhir: " + daftarBelanja.size() + " item");


        // --- Latihan 2: Nilai Terbesar ---
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(12);
        angka.add(45);
        angka.add(7);
        angka.add(23);
        angka.add(31);

        int terbesar = angka.get(0); // Ambil angka pertama sebagai acuan
        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }
        System.out.println("\n======= Latihan Mandiri 2.2 =======");
        System.out.println("Nilai terbesar dari " + angka + " adalah: " + terbesar);


        // --- Latihan 3: Nama Berawalan 'A' ---
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Anisa");
        nama.add("Citra");
        nama.add("Aris");
        nama.add("Dedi");
        
        System.out.println("\n======= Latihan Mandiri 2.3 =======");
        System.out.println("Nama yang diawali huruf 'A':");
        for (String s : nama) {
            if (s.startsWith("A")) {
                System.out.println("    - " + s);
            }
        }
    }
}
