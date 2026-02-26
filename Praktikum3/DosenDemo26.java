package Praktikum3;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);

        Dosen26[] arrayOfDosen26 =  new Dosen26[3];
        String kode26, nama26, jkInput;
        int usia26;
        Boolean jenisKelamin26;

        for (int i = 0; i < arrayOfDosen26.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode      : ");
            kode26 = resya.nextLine();
            System.out.print("Nama      : ");
            nama26 = resya.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jkInput = resya.nextLine();
            if (jkInput.equalsIgnoreCase("Pria")) {
                jenisKelamin26 = true;
            } else {
                jenisKelamin26 = false;
            }
            System.out.print("Usia      : ");
            usia26 = Integer.parseInt(resya.nextLine());
            System.out.println("--------------------------------------------");

            arrayOfDosen26[i] = new Dosen26(kode26, nama26, jenisKelamin26, usia26);
        }

        System.out.println("=== HASIL DATA DOSEN ===");
        int counter = 1;
        for (Dosen26 dsn : arrayOfDosen26) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode        : "+dsn.kode26);
            System.out.println("Nama        : "+dsn.nama26);
            System.out.println("Jenis Kelamin : "+(dsn.jenisKelamin26 ? "Pria" : "Wanita"));
            System.out.println("Usia        : "+dsn.usia26);
            System.out.println("--------------------------------------------");
            counter++;
        }

        DataDosen26.dataSemuaDosen26(arrayOfDosen26);
        DataDosen26.jumlahDosenPerJenisKelamin26(arrayOfDosen26);
        DataDosen26.rerataUsiaDosenPerJenisKelamin(arrayOfDosen26);
        DataDosen26.infoDosenPalingTua(arrayOfDosen26);
        DataDosen26.infoDosenPalingMuda(arrayOfDosen26);
    }
}
