package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menampung objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMhs = new ArrayList<>();

    // Tambah mahasiswa ke list
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMhs.add(mhs);
    }

    // Menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMhs.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMhs) {
            total = total + mhs.getNilai(); // penjumlahan manual biasa
        }
        return total / daftarMhs.size();
    }

    // Menghitung berapa banyak yang lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMhs) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Menampilkan semua data mahasiswa
    public void tampilkanSemua() {
        System.out.println("====== Daftar Mahasiswa ======");
        for (Mahasiswa mhs : daftarMhs) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.println("NPM: " + mhs.getNpm() + " | Nama: " + mhs.getNama() + " | Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
    }

    // Method tambahan untuk melihat total ukuran arraylist saat ini
    public int getJumlahMahasiswa() {
        return daftarMhs.size();
    }
}