import java.util.Scanner;

public class JadwalKuliah {
    static Scanner resya = new Scanner(System.in);
    // Array 2D untuk menyimpan data: [Baris][0=MK, 1=SKS, 2=Hari, 3=Jam]
    // Sesuai ketentuan kolom [cite: 239]
    static String[][] jadwal;
    static int n; // Jumlah mata kuliah

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah yang akan diinput: ");
        n = resya.nextInt();
        resya.nextLine(); // Konsumsi newline
        
        // Inisialisasi array sesuai jumlah input pengguna [cite: 245]
        jadwal = new String[n][4];

        // 1. Input Data [cite: 247]
        inputJadwal();

        // Menu Loop
        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Nama MK");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = resya.nextInt();
            resya.nextLine(); // Konsumsi newline

            switch (menu) {
                case 1:
                    tampilkanSeluruhJadwal(); // [cite: 248]
                    break;
                case 2:
                    tampilkanJadwalPerHari(); // [cite: 249]
                    break;
                case 3:
                    tampilkanJadwalPerMK();   // [cite: 250]
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }

    // Fungsi a: Input data jadwal kuliah
    static void inputJadwal() {
        System.out.println("\n--- Input Data Jadwal ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = resya.nextLine();
            System.out.print("Ruangan          : ");
            jadwal[i][1] = resya.nextLine();
            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = resya.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = resya.nextLine();
        }
    }

    // Fungsi b: Menampilkan seluruh jadwal
    static void tampilkanSeluruhJadwal() {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        // Header tabel
        System.out.printf("%-30s %-5s %-10s %-15s\n", "Mata Kuliah", "SKS", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-30s %-5s %-10s %-15s\n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // Fungsi c: Menampilkan jadwal berdasarkan hari
    static void tampilkanJadwalPerHari() {
        System.out.print("\nMasukkan hari yang ingin ditampilkan (misal: Senin): ");
        String cariHari = resya.nextLine();
        
        System.out.println("--- Jadwal Hari " + cariHari + " ---");
        System.out.printf("%-30s %-5s %-10s %-15s\n", "Mata Kuliah", "SKS", "Hari", "Jam");
        
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            // Menggunakan equalsIgnoreCase agar tidak sensitif huruf besar/kecil
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-30s %-5s %-10s %-15s\n", 
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    // Fungsi d: Menampilkan jadwal berdasarkan nama mata kuliah
    static void tampilkanJadwalPerMK() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String cariMK = resya.nextLine();
        
        System.out.println("--- Hasil Pencarian Mata Kuliah ---");
        System.out.printf("%-30s %-5s %-10s %-15s\n", "Mata Kuliah", "SKS", "Hari", "Jam");
        
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMK)) {
                System.out.printf("%-30s %-5s %-10s %-15s\n", 
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah tidak ditemukan.");
    }
}
