import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        Scanner resya = new Scanner(System.in);
        
        // Array 1 Dimensi untuk KODE (Plat)
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // Array 2 Dimensi untuk KOTA sesuai spesifikasi [cite: 148]
        // Data kota diambil dari ilustrasi visual [cite: 154-232]
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        System.out.print("Masukkan kode plat nomor: ");
        // Mengambil input char pertama dan ubah ke uppercase
        char inputKode = resya.next().toUpperCase().charAt(0); 
        
        boolean found = false;
        
        // Mencari indeks kode yang cocok
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                found = true;
                System.out.print("Kota: ");
                // Mencetak array char kota menjadi String
                for (int j = 0; j < KOTA[i].length; j++) {
                     System.out.print(KOTA[i][j]);
                }
                System.out.println();
                break;
            }
        }
        
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
