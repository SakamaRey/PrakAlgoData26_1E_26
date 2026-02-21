package P2;

public class MataKuliah26 {
    
    String kodeMK26;
    String nama26;
    int sks26;
    int jumlahJam26;

    public MataKuliah26 () {
    }

    public MataKuliah26(String kode26, String nm26, int  sks26, int jam26){
        kodeMK26 = kode26;
        nama26 =  nm26;
        this.sks26 = sks26;
        jumlahJam26 = jam26;
    }

    void tampilInformasi26() {
        System.out.println("Kode MK     : "+kodeMK26);
        System.out.println("Nama MK     : "+nama26);
        System.out.println("SKS         : "+sks26);
        System.out.println("Jumlah Jam  : "+jumlahJam26);
        System.out.println("-------------------------");
    }

    void ubahSKS(int sksBaru26) {
        sks26 = sksBaru26;
        System.out.println("SKS mata kuliah " + nama26 + " berhasil diubah menjadi: " + sks26);
    }

    void tambahJam26(int jam26) {
        jumlahJam26 += jam26;
        System.out.println("Jam mata kuliah ditambahkan. Total jam sekarang: " + jumlahJam26);
    }

    void kurangiJam26(int jam26) {
        if (jumlahJam26 >= jam26) {
            jumlahJam26 -= jam26;
            System.out.println("Pengurangan jam berhasil. Total jam sekarang: " + jumlahJam26);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Sisa jam kurang dari jam pengurang.");
        }
    }
}
