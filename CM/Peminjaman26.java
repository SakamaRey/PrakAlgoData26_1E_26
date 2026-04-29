package CM;

public class Peminjaman26 {
    Mahasiswa26 mhs;
    Buku26 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman26(Mahasiswa26 mhs, Buku26 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    // Modifikasi untuk menentukan perbedaan denda buku sesuai dengan Grade Buku
    void hitungDenda() {
        if (lamaPinjam>batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            // Logika denda berdasarkan Grade Buku
            if (buku.status.equalsIgnoreCase("Grade A")) {
                denda = terlambat * 5000;
            } else {
                denda = terlambat * 2000;
            }
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    void tampilPeminjaman() {
        System.out.println(String.format("%-10s | %-15s (%-7s) | Denda: Rp %-6d", 
        mhs.nama, buku.judul, buku.status, denda));
    }
}