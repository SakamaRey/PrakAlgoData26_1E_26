package Praktikum3;

public class DataDosen26 {
    public static void  dataSemuaDosen26(Dosen26[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        int i = 1;
        for (Dosen26 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+i);
            System.out.println("Kode        : "+dsn.kode26);
            System.out.println("Nama        : "+dsn.nama26);
            System.out.println("Jenis Kelamin : "+(dsn.jenisKelamin26 ? "Pria" : "Wanita"));
            System.out.println("Usia        : "+dsn.usia26);
            System.out.println("--------------------------------");
            i++;
        }
    }
    public static void jumlahDosenPerJenisKelamin26(Dosen26[] arrayOfDosen) {
        int jumlahPria26 = 0;
        int jumlahWanita26 = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin26) {
                jumlahPria26++;
            } else {
                jumlahWanita26++;
            }
        }
        
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria    : "+jumlahPria26);
        System.out.println("Wanita  : "+jumlahWanita26);
        System.out.println("--------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int hitungPria = 0, hitungWanita = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin26) {
                totalUsiaPria += dsn.usia26;
                hitungPria++;
            } else {
                totalUsiaWanita+=dsn.usia26;
                hitungWanita++;
            }
        }

        System.out.println("=== RATA-RATA USIA DOSEN ===");
        if (hitungPria > 0) {
            System.out.println("Rata-rata Usia Pria : "+(totalUsiaPria/hitungPria));
        } else {
            System.out.println("Rata-rata Usia Wanita : Tidak ada data dosen pria.");
        }

        if (hitungWanita > 0) {
            System.out.println("Rata-rata Usia Wanita : "+(totalUsiaWanita/hitungWanita));
        } else {
            System.out.println("Rata-rata Usia Pria : Tidak ada data dosen wanita.");
        }
        System.out.println("--------------------------------");
    }

    public static void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen26 tertua = arrayOfDosen[0];
        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.usia26>tertua.usia26) {
                tertua = dsn;
            }
        }
        System.out.println("=== INFO DOSEN PALING TUA ===");
        System.out.println("Nama        : "+tertua.nama26);
        System.out.println("Usia        : "+tertua.usia26);
        System.out.println("--------------------------------");
    }

    public static void infoDosenPalingMuda(Dosen26[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen26 termuda = arrayOfDosen[0];
        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.usia26<termuda.usia26) {
                termuda = dsn;
            }
        }
        System.out.println("=== INFO DOSEN PALING MUDA ===");
        System.out.println("Nama        : "+termuda.nama26);
        System.out.println("Usia        : "+termuda.usia26);
        System.out.println("--------------------------------");
    }
}
