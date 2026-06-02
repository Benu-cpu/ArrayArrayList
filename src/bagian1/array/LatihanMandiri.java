package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        double[] suhu = new double[6];
            suhu[0] = 10.0;
            suhu[1] = 13.2;
            suhu[2] = 15.0;
            suhu[3] = 19.5;
            suhu[4] = 20.0;
            suhu[5] = 22.0;
        
        double Max = suhu[0];
        double Min = suhu[0];
        
        for (int i = 1; i < suhu.length; i++) {
            // Cek suhu tertinggi
            if (suhu[i] > Max) {
                Max = suhu[i];
            }
            
            // Cek suhu terendah
            if (suhu[i] < Min) {
                Min = suhu[i];
            }
        }
        
        System.out.println("======= Latihan Mandiri 1.1 =======");
        System.out.println("Suhu Tertinggi: " + Max + " Celcius");
        System.out.println("Suhu Terendah: " + Min + " Celcius");
        System.out.print("\n");
        
        System.out.println("======= Latihan Mandiri 1.2 =======");  
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at"};
            for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("Hari yang lebih dari lima huruf adalah: " + h);
                }
            }
        System.out.print("\n");
        
        System.out.println("======= Latihan Mandiri 1.3 ======="); 
        int[] angka = {4, 8, 15, 16, 23, 42}; 
        int jumlahGenap = 0;
        System.out.print("Angka genap yang ditemukan: ");
        for (int n : angka) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                jumlahGenap = jumlahGenap + 1;
            }
        }
        System.out.println();
        System.out.println("Total banyak angka genap: " + jumlahGenap);
        
    }
}
