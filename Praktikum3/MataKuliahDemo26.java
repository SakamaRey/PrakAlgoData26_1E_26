package Praktikum3;

import java.util.Scanner;

public class MataKuliahDemo26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        String kode26, nama26, dummy;
        int sks26,jumlahJam26;

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul26 =  Integer.parseInt(resya.nextLine());
        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[jumlahMatkul26];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data MataKuliah ke-"+(i+1));
            System.out.print("Kode      : ");
            kode26 = resya.nextLine();
            System.out.print("Nama      : ");
            nama26 = resya.nextLine();
            System.out.print("Sks       : ");
            dummy = resya.nextLine();
            sks26 = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = resya.nextLine();
            jumlahJam26 = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah26(kode26, nama26, sks26, jumlahJam26);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-"+(i+1));
            arrayOfMataKuliah[i].cetakInfo26();
            // System.out.println("Kode        : "+arrayOfMataKuliah[i].kode26);
            // System.out.println("Nama        : "+arrayOfMataKuliah[i].nama26);
            // System.out.println("Sks         : "+arrayOfMataKuliah[i].sks26);
            // System.out.println("Jumlah Jam  : "+arrayOfMataKuliah[i].jumlahJam26);
            System.out.println("--------------------------------------------");
        }
    }
}
