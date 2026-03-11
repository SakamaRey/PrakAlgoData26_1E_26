package minggu5;

import java.util.Scanner;

public class MainFaktorial26 {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai26 = resya.nextInt();

        Faktorial26 fk26 = new Faktorial26();
        System.out.println("Nilai faktorial "+nilai26+
            " menggunakan BF: "+fk26.faktorialBF(nilai26));
        System.out.println("Nilai faktorial "+nilai26+
            " menggunakan DC: "+fk26.faktorialDC(nilai26));    
    }
}
