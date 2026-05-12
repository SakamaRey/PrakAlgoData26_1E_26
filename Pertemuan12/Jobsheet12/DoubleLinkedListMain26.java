package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain26 {
    static Mahasiswa26 inputMahasiswa26 (Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkab IPK   : ");
        String dummy = scan.nextLine();
        double ipk = Double.parseDouble(dummy);
        Mahasiswa26 mhs = new Mahasiswa26(nim, nama, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList26 list = new DoubleLinkedList26();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sissipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa26 mhsAwal = inputMahasiswa26(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa26 mhsAkhir = inputMahasiswa26(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yyang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa26 dataBaru = inputMahasiswa26(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
