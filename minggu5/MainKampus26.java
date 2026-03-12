package minggu5;

public class MainKampus26 {
    public static void main(String[] args) {
        Mahasiswa26[] mhs =  {
            new Mahasiswa26("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa26("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa26("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa26("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa26("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa26("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa26("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa26("Hadi", "220101008", 2020, 82, 84)
        };

        Kampus26 kmps = new Kampus26(mhs);
        int n = kmps.daftMahasiswa26.length;

        System.out.println("a) Nilai UTS Tertinggi (DC): " + kmps.maxUtsDC(0, n - 1));
        System.out.println("b) Nilai UTS Terendah (DC): " + kmps.minUtsDC(0, n - 1));
        System.out.println("c) Rata-rata Nilai UAS (BF): " + kmps.rataUasBF());
    }
}
