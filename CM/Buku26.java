package CM;

// Soal A Pengerjaan 1
// Pemberian variable status untuk buku

public class Buku26 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String status;

    public Buku26(String kodeBuku, String judul, int tahunTerbit, String status) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit + " | Status: " + status);
    }
}
