
import java.util.Scanner;

public class CMMain26 {
    public static void main(String[] args) {
        Scanner reyyo = new Scanner(System.in);
        DLLAntrian26 antrian = new DLLAntrian26();
        DLLPesanan26 daftarPesanan =  new DLLPesanan26();
        
        int pilihan;
        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = reyyo.nextInt();
            reyyo.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = reyyo.nextLine();
                    System.out.print("No Hp        : ");
                    String hp = reyyo.nextLine();
                    antrian.tambahAntrian(new Pembeli26(nama, hp));
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    NodePembeli26 diproses = antrian.hapusAntrian26();
                    if (diproses != null) {
                        System.out.println("Pembeli yang diproses: " + diproses.data.namaPembeli);
                        System.out.print("Kode Pesanan : ");
                        int kode = reyyo.nextInt();
                        reyyo.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = reyyo.nextLine();
                        System.out.print("Harga        : ");
                        int harga = reyyo.nextInt();

                        daftarPesanan.tambahPesanan(new Pesanan26(kode, namaPesanan, harga));
                        System.out.println(diproses.data.namaPembeli + "telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    daftarPesanan.cetakLaporanPesanan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem kami !");
                    break;
                default:
                    System.out.println("Menu tidak valid !");
            }
        } while (pilihan != 0);
        reyyo.close();
    }
}
