package P2;

public class MataKuliahMain26 {
    public static void main(String[] args) {
        MataKuliah26 mk1 = new MataKuliah26();
        mk1.kodeMK26 = "ASD";
        mk1.nama26 = "Algoritma dan Struktur Data";
        mk1.sks26 = 2;
        mk1.jumlahJam26 =  4;

        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilInformasi26();
        mk1.ubahSKS(3);
        mk1.tambahJam26(2);
        mk1.kurangiJam26(4);
        System.out.println();

        MataKuliah26 mk2 = new MataKuliah26("BD", "Basis Data", 2, 4);
        System.out.println("=== Informasi Mata Kuliah 2 ===");
        mk2.tampilInformasi26();
        mk2.kurangiJam26(2);

    }
}
