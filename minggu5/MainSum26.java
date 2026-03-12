package minggu5;

import java.util.Scanner;

public class MainSum26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = resya.nextInt();

        Sum26 sm = new Sum26(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = resya.nextDouble();
        }

        System.out.println("Total Keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total Keuntungan menggunakan Divine and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
