package Praktikum3;

public class MataKuliah26 {
    public String kode26;
    public String nama26;
    public int sks26;
    public int jumlahJam26;
    
    public MataKuliah26(String kode26, String nama26, int sks26, int jumlahJam26) {
        this.kode26 = kode26;
        this.nama26 = nama26;
        this.sks26 = sks26;
        this.jumlahJam26 = jumlahJam26;
    }

    void tambahData26(String kode26, String nama26, int sks26, int jumlahJam26) {
        this.kode26 = kode26;
        this.nama26 = nama26;
        this.sks26 = sks26;
        this.jumlahJam26 = jumlahJam26;
    }

    void cetakInfo26() {
        System.out.println("Kode        : "+this.kode26);
        System.out.println("Nama        : "+this.nama26);
        System.out.println("Sks         : "+this.sks26);
        System.out.println("Jumlah Jam  : "+this.jumlahJam26);
        System.out.println("--------------------------------");
    }
}
