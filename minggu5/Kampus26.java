package minggu5;

public class Kampus26 {
    Mahasiswa26[] daftMahasiswa26;

    public Kampus26(Mahasiswa26[] mhs) {
        this.daftMahasiswa26 = mhs;
    }

        int maxUtsDC( int l, int r) {
        if (l==r) {
            return daftMahasiswa26[l].nliUts26;
        }
        int mid26 = (l+r)/2;
        int lmax = maxUtsDC( l, mid26);
        int rmax = maxUtsDC( mid26+1, r);
        return Math.max(lmax, rmax);
    }

    int minUtsDC(int l, int r) {
        if (l==r) {
            return daftMahasiswa26[l].nliUts26;
        }
        int mid26 = (l+r)/2;
        int lmax = minUtsDC(l, mid26);
        int rmax = minUtsDC(mid26+1, r);
        return Math.min(lmax, rmax);
    }

    double rataUasBF(){
        double total26 = 0;
        for (int i = 0; i < daftMahasiswa26.length; i++) {
            total26 += daftMahasiswa26[i].nliUas26;
        }
        return total26/daftMahasiswa26.length;
    }
}
