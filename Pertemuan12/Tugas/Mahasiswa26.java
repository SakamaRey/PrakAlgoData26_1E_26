package Tugas;

public class Mahasiswa26 {
    String nim;
    String nama;
    String jurusan;

    public Mahasiswa26(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilData() {
        System.out.println("NIM      : " + nim +"\nNama     : " + nama +"\nJurusan  : " + jurusan);
    }
}
