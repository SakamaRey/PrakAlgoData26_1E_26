package minggu5;

public class Pangkat26 {
    int nilai26, pangkat26;

    public Pangkat26(int n, int p) {
        nilai26 = n;
        pangkat26 = p ;
    }
    
    int pangkatBF(int a, int n) {
        int hasil26 = 1;
        for (int i = 0; i <this.pangkat26; i++) {
            hasil26 = hasil26*a;
        }
        return hasil26;
    }

    int pangkatDC(int a, int n) {
        if (n==1) {
            return a;
        } else {
            if (n%2==1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            } else {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
