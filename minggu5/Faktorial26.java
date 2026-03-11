package minggu5;

public class Faktorial26 {
    
    int faktorialBF(int n) {
        int fakto26 = 1;
        int i = 1;
        // for (int i = 1; i <= n; i++) {
        //     fakto26 = fakto26 * i;
        // }
        while (i <= n) { 
            fakto26 *= i;
            i++;
        }
        return fakto26;
    }

    int faktorialDC(int n){
        if (n==1) {
            return 1;
        } else {
            int fakto26 = n * faktorialDC(n-1);
            return fakto26;
        }
    }
}
