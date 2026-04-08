package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        MahasiwaBerprestasi26 list = new MahasiwaBerprestasi26();
        // Mahasiswa26 m1 = new Mahasiswa26("123", "Zidan", "2A", 3.2);
        // Mahasiswa26 m2 = new Mahasiswa26("124", "Ayu", "2A", 3.5);
        // Mahasiswa26 m3 = new Mahasiswa26("125", "Sofi", "2A", 3.1);
        // Mahasiswa26 m4 = new Mahasiswa26("126", "Sita", "2A", 3.9);
        // Mahasiswa26 m5 = new Mahasiswa26("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = resya.nextLine();
            System.out.print("Nama: ");
            String nama = resya.nextLine();
            System.out.print("Kelas: ");
            String kelas = resya.nextLine();
            System.out.print("IPK: ");
            double ipk = resya.nextDouble();
            resya.nextLine();

            Mahasiswa26 m = new Mahasiswa26(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiwa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiwa setelah sorting berdasarkan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiwa setelah sorting berdasarkan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
