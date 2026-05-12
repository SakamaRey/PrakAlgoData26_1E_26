package Tugas;

import java.util.Scanner;

public class MainQueueList26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList26 queue = new QueueLinkedList26();
        int pilih;

        do { 
            System.out.println("\n===== MENU ANTRIAN KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Keluar");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n=== Input Data Mahasiswa ===");
                    System.out.print("NIM      : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama     : ");
                    String nama = sc.nextLine();
                    System.out.print("Jurusan  : ");
                    String jurusan = sc.nextLine();
                    Mahasiswa26 mhs =
                    new Mahasiswa26(nim, nama, jurusan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    queue.peekFront();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    queue.jumlahAntrian();
                    break;
                case 7:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian Masih Kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;
                case 8:
                    queue.clear();
                    break;
                case 9:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilih != 9);
    }
}
