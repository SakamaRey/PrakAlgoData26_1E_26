package P2;

public class Dosen26 {
    
    String idDosen26;
    String nama26;
    boolean statusAktif26 ;
    int tahunBergabung26;
    String bidangKeahlian26;

    public  Dosen26() {
    }

    public Dosen26(String id26, String nm26, boolean status26, int tahun26, String bidang26){
        idDosen26 = id26;
        nama26 = nm26;
        statusAktif26 = status26;
        tahunBergabung26 = tahun26;
        bidangKeahlian26 = bidang26;
    }

    void  tampilInformasi26() {
        System.out.println("ID Dosen        : "+idDosen26);
        System.out.println("Nama Dosen      : "+nama26);
        System.out.println("Status Aktif    : "+(statusAktif26 ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : "+tahunBergabung26);
        System.out.println("Bidang Keahlian : "+bidangKeahlian26);
        System.out.println("---------------------------------");
    }

    void setStatusAktif26(boolean status26) {
        statusAktif26 = status26;
        System.out.println("Status aktif dosen " + nama26 + " diubah menjadi: " + (statusAktif26 ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja26(int thnSkrg26){
        return thnSkrg26 - tahunBergabung26;
    }

    void ubahKeahlian26(String bidang26) {
        bidangKeahlian26 = bidang26;
        System.out.println("Bidang keahlian "+ nama26 + " berhasil diubah menjadi: " + bidangKeahlian26);
    }
}
