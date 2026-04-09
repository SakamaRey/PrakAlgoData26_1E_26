package CM;

import java.util.Scanner;

public class SistemPinjamMain26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);

        //Inisialisasi Data Mahasiswa
        Mahasiswa26[] arrMhs = {
            new Mahasiswa26("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa26("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa26("22003", "Citra", "Sistem Informasi Bisnis")
        };

        //Inisialisasi Data Buku
        Buku26[] arrBuku = {
            new Buku26("B001", "Algoritma", 2020),
            new Buku26("B002", "Basis Data", 2019),
            new Buku26("B003", "Pemrograman", 2021),
            new Buku26("B004", "Fisika", 2024)
        };

        //Inisialisasi Data Peminjaman
        Peminjaman26[] arrPeminjaman = {
            new Peminjaman26(arrMhs[0], arrBuku[0], 7),
            new Peminjaman26(arrMhs[1], arrBuku[1], 3),
            new Peminjaman26(arrMhs[2], arrBuku[2], 10),
            new Peminjaman26(arrMhs[2], arrBuku[3], 6),
            new Peminjaman26(arrMhs[0], arrBuku[1], 4)
        };

        int menu;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN BUKU ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = resya.nextInt();
            resya.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n--- Daftar Mahasiswa ---");
                    for (Mahasiswa26 m : arrMhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\n--- Daftar Buku ---");
                    for (Buku26 b : arrBuku) {
                        b.tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("\n--- Data Peminjaman ---");
                    for (Peminjaman26 p : arrPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 4:
                    urutBerdasarDenda(arrPeminjaman);
                    System.out.println("\n--- Data Peminjaman (Diurutkan berdasarkan denda terbesar) ---");
                    for (Peminjaman26 p : arrPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String cariNIM = resya.nextLine();
                    System.out.println("Hasil Pencarian:");
                    cariBerdasarNIM(arrPeminjaman, cariNIM);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;    
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (menu != 0);

        resya.close();
    }

    // Menggunakan Insertion Sort (Descending) untuk denda terbesar ke terkecil
    static void urutBerdasarDenda(Peminjaman26[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman26 key = arr[i];
            int j = i -1;
            while (j  >= 0 &&  arr[j].denda < key.denda) { 
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Menggunakan Binary Search untuk pencarian berdasarkan NIM
    static void  cariBerdasarNIM(Peminjaman26[] arr, String nim) {
        // Menyalin array agar data asli (menu 3) tidak berubah urutannya
        Peminjaman26 [] temp = new Peminjaman26[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        // Binary Search mensyaratkan data harus urut (Ascending) terlebih dahulu
        for (int i = 1; i < temp.length; i++) {
            Peminjaman26 key = temp[i];
            int j = i-1;
            while (j >= 0 && temp[j].mhs.nim.compareTo(key.mhs.nim)>0) { 
                temp[j+1] = temp[j];
                j--;
            }
            temp[j+1] = key;
        }

        // Proses Binary Search
        int left = 0;
        int right = temp.length - 1;
        int foundIdx = -1;

        while (left <= right) { 
            int mid = left+(right-left) / 2;
            int cmp = temp[mid].mhs.nim.compareTo(nim);

            if (cmp == 0) {
                foundIdx = mid;
                break; // NIM ditemukan
            } else if (cmp<0) {
                left = mid +1;
            } else {
                right = mid - 1;
            }
            }

            // Menampilkan hasil jika ditemukan 
            if (foundIdx != -1) {
                // Melakukan pengecekan mulai dari belakang dan ke depan dari indeks yang ditemukan
                int start = foundIdx;
                while (start > 0 && temp[start-1].mhs.nim.equals(nim)) {
                    start--;
                }
                int end = foundIdx;
                while (end < temp.length - 1 && temp[end +1].mhs.nim.equals(nim)) {
                    end++;
                }
                // Tampilkan semua riwayat peminjaman NIM yang dicari
                for (int i = start; i <= end; i++) {
                    temp[i].tampilPeminjaman();
                }
            } else {
                System.out.println("Data Peminjaman dengan NIM " + nim + "tidak ditemukan");
            }
        }
    }
