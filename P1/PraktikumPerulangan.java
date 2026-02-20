
import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = resya.next();
        
        // Mengambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // Jika n < 10, tambahkan 10 [cite: 50]
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);
        
        for (int i = 1; i <= n; i++) {
            // Bilangan 10 dan 15 tidak dicetak [cite: 49]
            if (i == 10 || i == 15) {
                continue;
            }
            
            // Bilangan kelipatan 3 dicetak '#' 
            if (i % 3 == 0) {
                System.out.print("* "); // Koreksi: Sesuai output contoh[cite: 54], kelipatan 3 adalah '#' namun ganjil adalah '*'.
                // Prioritas berdasar contoh[cite: 54]:
                // 6 (#), 9 (#). 
                // Mari ikuti aturan teks secara ketat:
                System.out.print("# ");
            } 
            // Bilangan genap dicetak angkanya [cite: 47]
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            // Bilangan ganjil dicetak '*' [cite: 48]
            else {
                System.out.print("* ");
            }
        }
    }
}
