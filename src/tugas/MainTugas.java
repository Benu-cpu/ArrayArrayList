// Nama  : M. Ibnu
// Kelas : 2410010254

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Array String Mata Kuliah (Syarat No. 4)
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Basis Data", "Struktur Data"};
        
        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // 2. Membuat objek pengelola
        KelasKuliah kelas = new KelasKuliah();

        // 3. 5 mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Akbar", "241001", 75.5));
        kelas.tambahMahasiswa(new Mahasiswa("Ibnu", "241002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Pendi", "241003", 88.0));
        kelas.tambahMahasiswa(new Mahasiswa("Nuib", "241004", 42.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dimas", "241005", 65.0));

        // 4. Tampilkan semua data awal
        kelas.tampilkanSemua();
        System.out.println();

        // 5. Menampilkan rata-rata dan jumlah lulus (Syarat No. 5)
        System.out.println("Rata-rata Nilai Kelas : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Mahasiswa Saat Ini: " + kelas.getJumlahMahasiswa());
        System.out.println();

        // 6. Menambahkan 1 mahasiswa baru dan cetak data terbaru (Syarat No. 6)
        System.out.println("... Menambahkan 1 mahasiswa baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("M. Ibnu", "241006", 90.0));
        
        System.out.println("Total Mahasiswa Terbaru : " + kelas.getJumlahMahasiswa());
        System.out.println("Rata-rata Kelas Terbaru : " + kelas.hitungRataRata());
    }
}