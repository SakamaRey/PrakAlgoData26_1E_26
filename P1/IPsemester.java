
import java.util.Scanner;

public class IPsemester {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);

        // Definisi Mata Kuliah sesuai contoh [cite: 76-83]
        String[] matkul = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2}; // Bobot SKS asumsi standar (karena tidak spesifik di soal)
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];
        
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==================================");
        
        // Input Nilai
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = resya.nextDouble();
            
            // Konversi ke Nilai Huruf dan Nilai Setara [cite: 71]
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B"; nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+"; nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C"; nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D"; nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; nilaiSetara[i] = 0.0;
            }
        }
        
        System.out.println("==================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==================================");
        
        // Menampilkan Hasil dan Menghitung IP
        double totalNilaiSetaraKaliSks = 0;
        double totalSks = 0;
        
        // Header Tabel Sederhana
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
            totalNilaiSetaraKaliSks += (nilaiSetara[i] * sks[i]);
            totalSks += sks[i];
        }
        
        double ipSemester = totalNilaiSetaraKaliSks / totalSks; // [cite: 69]
        
        System.out.println("==================================");
        System.out.printf("IP : %.2f\n", ipSemester);
    }
}
