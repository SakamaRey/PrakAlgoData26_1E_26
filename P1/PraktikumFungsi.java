public class PraktikumFungsi {
    
    static int[][] stockBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        System.out.println("Laporan Pendapatan Cabang RoyalGarden");
        System.out.println("=====================================");
        
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = cekStatus(pendapatan);
            
            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan: Rp " + pendapatan);
            System.out.println("Status    : " + status); 
            System.out.println("-------------------------");
        }
    }

    static int hitungPendapatan(int indexCabang) {
        int total = 0;
        for (int j = 0; j < stockBunga[indexCabang].length; j++) {
            total += stockBunga[indexCabang][j] * hargaBunga[j];
        }
        return total;
    }

    // Fungsi cek status kelayakan [cite: 141, 142, 143]
    static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}
