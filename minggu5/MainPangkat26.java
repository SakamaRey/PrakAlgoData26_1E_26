package minggu5;

import java.util.Scanner;

public class MainPangkat26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen26 = resya.nextInt();

        Pangkat26[] png = new Pangkat26[elemen26];
        for (int i = 0; i < elemen26; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis26 = resya.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat26 = resya.nextInt();
            png[i] = new Pangkat26(basis26, pangkat26);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat26 p : png) {
            System.out.println(p.nilai26+"^"+p.pangkat26+": "+p.pangkatBF(p.nilai26, p.pangkat26));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat26 p : png) {
            System.out.println(p.nilai26+"^"+p.pangkat26+": "+p.pangkatDC(p.nilai26, p.pangkat26));
        }
    }
}
