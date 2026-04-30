
import java.util.Scanner;

public class SuratDemo26 {
    public static void main(String[] args) {
        StackSurat26 stack = new StackSurat26(10);
        Scanner resya = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin Mahasiswa:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = resya.nextInt();
            resya.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = resya.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = resya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = resya.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin lain): ");
                    char jenis = resya.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = resya.nextInt();
                    
                    Surat26 suratBaru = new Surat26(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat izin berhasil ditambahkan.");
                    break;
                case 2:
                    Surat26 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat dari " + proses.namaMahasiswa + " telah berhasil diproses/divalidasi.");
                    }
                    break;
                case 3:
                    Surat26 cekTerakhir = stack.peek();
                    if (cekTerakhir != null) {
                        System.out.println("Surat terakhir diajukan oleh " + cekTerakhir.namaMahasiswa + " (ID: " + cekTerakhir.idSurat + ")");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = resya.nextLine();
                    stack.cariSurat(cariNama);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
