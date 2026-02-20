import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("========================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = resya.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = resya.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = resya.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = resya.nextInt();

        System.out.println("========================");
        System.out.println("========================");

        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || 
            (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("========================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            
            String nilaiHuruf;
            String kualifikasi;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                kualifikasi = "LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                kualifikasi = "LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                kualifikasi = "LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                kualifikasi = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                kualifikasi = "LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kualifikasi = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                kualifikasi = "TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("========================");
            
            if (kualifikasi.equals("LULUS")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
    }
}