package P2;

public class DosenMain26 {
    public static void main(String[] args) {
        Dosen26 dsn1 = new Dosen26();
        dsn1.idDosen26 = "IFR";
        dsn1.nama26 = "Imam Fahrur Rozi, S.T., M.T.";
        dsn1.statusAktif26 = true;
        dsn1.tahunBergabung26 = 2015;
        dsn1.bidangKeahlian26 =  "Jaringan Komputer";

        System.out.println("=== Informasi Dosen 1 ===");
        dsn1.tampilInformasi26();
        dsn1.ubahKeahlian26("Keamanan Siber");
        int masaKerja1 = dsn1.hitungMasaKerja26(2026);
        System.out.println("Masa kerja: " + masaKerja1 + " tahun");
        System.out.println();

        Dosen26 dsn2 = new Dosen26("VIS", "Candra Bella Vista, S.Kom., M.T.", false, 2020, "Rekayasa Perangkat Lunak");
        System.out.println("=== Informasi Dosen 2 ===");
        dsn2.tampilInformasi26();
        dsn2.setStatusAktif26(true);
        int masaKerja2 = dsn2.hitungMasaKerja26(2026);
        System.out.println("Masa kerja: "+masaKerja2+" tahun");
    }
}
