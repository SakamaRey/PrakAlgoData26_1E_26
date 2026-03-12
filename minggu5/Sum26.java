package minggu5;

public class Sum26 {
    double keuntungan[];

    public Sum26(int e1) {
        keuntungan = new double[e1];
    }

    double totalBF() {
        double total26 = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total26 = total26+keuntungan[i];
        }
        return total26;
    }

    double totalDC(double arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }

        int mid26 = (1+r)/2;
        double lsum = totalDC(arr, l, mid26);
        double rsum = totalDC(arr, mid26+1, r);
        return lsum+rsum;
    }
}
