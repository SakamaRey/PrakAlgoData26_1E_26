package P2;

public class Mahasiswa26 {
    String nama26;
    String nim26;
    String kelas26;
    double ipk26;

    public Mahasiswa26() {

    }

    public Mahasiswa26(String nm26, String nim26, double ipk26, String kls26) {
        nama26 = nm26;
        this.nim26 = nim26;
        this.ipk26 = ipk26;
        kelas26 = kls26;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama26);
        System.out.println("NIM: " + nim26);
        System.out.println("IPK: " + ipk26);
        System.out.println("Kelas: " + kelas26);
    }

    void ubahKelas(String kelasBaru) {
        kelas26 = kelasBaru;
    }

    void  updateIpk(double  ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk26 = ipkBaru;
        } else {
            System.out.println("IPK tidak valid (Di antara 0.0 dan 4.0)");
        }
        
    }

    String nliKinerja() {
        if (ipk26 >= 3.5) {
            return "Kinerja Sangat baik";
        } else if (ipk26 >= 3.0) {
            return "Kinerja baik";
        } else if (ipk26 >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
