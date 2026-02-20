package P2;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26 mhs1 = new Mahasiswa26();
        mhs1.nama26 = "Muhammad Ali Farhan";
        mhs1.nim26 = "2241720171";
        mhs1.kelas26 = "SI 2J";
        mhs1.ipk26 = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}
