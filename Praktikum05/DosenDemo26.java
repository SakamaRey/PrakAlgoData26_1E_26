package Praktikum05;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        DataDosen26 data = new DataDosen26();
        int menu;

        do { 
            System.out.println("=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Urutkan Usia (ASC - Dosen Termuda ke Tertua)");
            System.out.println("4. Urutkan Usia (DESC - Dosen Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: "); 
            menu = resya.nextInt();
            resya.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = resya.nextLine();
                    System.out.print("Masukkan nama Dosen: ");
                    String nama = resya.nextLine();
                    System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jenisKelamin = resya.nextBoolean();
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = resya.nextInt();
                    resya.nextLine();

                    Dosen26 dsn = new Dosen26(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    System.out.println("Berhasil Menambahkan data!");
                    break;
                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    System.out.println("\n--- Mengurutkan Data Dosen menggunakan Bubble Sort (ASC) ---");
                    data.bubblesort();
                    data.tampil();
                    break;
                case 4:
                    System.out.println("\n--- Mengurutkan Data Dosen menggunakan Selection Sort (DESC) ---");
                    data.selectionSort();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                   System.out.println("Menu tidak ada. Coba lagi.");
            }
            System.out.println();
        } while (menu !=5);
    }
}
