package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        //Membuat Objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1995));
        perpus.tambahBuku(new Buku("Negeri 5 Menaea", "Ahmad Fuadi", 2008));
        perpus.tambahBuku(new Buku("Padang Bulan", "Andrea Hirata", 2010));
        
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // TES 1: Mencari penulis yang ada di perpustakaan (punya 2 buku)
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();

        // TES 2: Mencari penulis yang tidak ada
        perpus.cariPenulis("Mr. Poetry");
        
        System.out.println("\n--- PROSES PINJAM ---");
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia saat ini: " + perpus.jumlahTersedia());
        
        System.out.println("\n--- PROSES PENGEMBALIAN ---");
        perpus.kembalikanBuku("Bumi Manusia"); // Mengembalikan buku yang dipinjam
        perpus.kembalikanBuku("Bumi Manusia"); // Mencoba mengembalikan lagi untuk tes kondisi kedua
        
        System.out.println("\n--- STATUS AKHIR ---");
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia akhir: " + perpus.jumlahTersedia());
    }
}
