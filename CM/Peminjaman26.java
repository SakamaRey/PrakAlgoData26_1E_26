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

    void hitungDenda() {
        if (lamaPinjam>batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat*2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " meminjam " + buku.judul + " | Lama: " + lamaPinjam + 
        " hari | Terlambat: " + terlambat + " hari | Denda: Rp" + denda);
    }
}
