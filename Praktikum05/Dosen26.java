package Praktikum05;

public class Dosen26 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen26(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;  
    }

    void tampil() {
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Gender     : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia       : " + usia);
        System.out.println("-------------------------");
    }
}
