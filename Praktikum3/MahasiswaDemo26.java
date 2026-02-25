package Praktikum3;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
      Mahasiswa26[] arrayOfMahasiswa26s = new Mahasiswa26[3];
      arrayOfMahasiswa26s[0] = new Mahasiswa26();
      arrayOfMahasiswa26s[0].nim26 = "244107060033";
      arrayOfMahasiswa26s[0].nama26 = "AGNES TITANIA KINANTI";
      arrayOfMahasiswa26s[0].kelas26 =  "SIB-1E";
      arrayOfMahasiswa26s[0].ipk26 = (float) 3.75;  

      arrayOfMahasiswa26s[1] = new Mahasiswa26();
      arrayOfMahasiswa26s[1].nim26 = "2341720172";
      arrayOfMahasiswa26s[1].nama26 = "ACHMAD MAULANA HAMZAH";
      arrayOfMahasiswa26s[1].kelas26 =  "TI-2A";
      arrayOfMahasiswa26s[1].ipk26 = (float) 3.36;

      arrayOfMahasiswa26s[2] = new Mahasiswa26();
      arrayOfMahasiswa26s[2].nim26 = "244107023006";
      arrayOfMahasiswa26s[2].nama26 = "DIRHAMAWAN PUTRANTO";
      arrayOfMahasiswa26s[2].kelas26 =  "TI-2E";
      arrayOfMahasiswa26s[2].ipk26 = (float) 3.80;

      System.out.println("NIM       : "+arrayOfMahasiswa26s[0].nim26);
      System.out.println("Nama      : "+arrayOfMahasiswa26s[0].nama26);
      System.out.println("Kelas     : "+arrayOfMahasiswa26s[0].kelas26);
      System.out.println("IPK       : "+arrayOfMahasiswa26s[0].ipk26);
      System.out.println("--------------------------------------------");
      System.out.println("NIM       : "+arrayOfMahasiswa26s[1].nim26);
      System.out.println("Nama      : "+arrayOfMahasiswa26s[1].nama26);
      System.out.println("Kelas     : "+arrayOfMahasiswa26s[1].kelas26);
      System.out.println("IPK       : "+arrayOfMahasiswa26s[1].ipk26);
      System.out.println("--------------------------------------------");
      System.out.println("NIM       : "+arrayOfMahasiswa26s[2].nim26);
      System.out.println("Nama      : "+arrayOfMahasiswa26s[2].nama26);
      System.out.println("Kelas     : "+arrayOfMahasiswa26s[2].kelas26);
      System.out.println("IPK       : "+arrayOfMahasiswa26s[2].ipk26);
      System.out.println("--------------------------------------------");
    }
}
