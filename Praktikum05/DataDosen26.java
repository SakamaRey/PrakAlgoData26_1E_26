package Praktikum05;

public class DataDosen26 {
    Dosen26[] listDosen = new Dosen26[10];
    int idx = 0;

    void tambah(Dosen26 dsn) {
        if (idx < listDosen.length) {
            listDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Maaf, Array Data Dosen sudah penuh !");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
        }
    }

    void bubblesort() {
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (listDosen[j-1].usia > listDosen[j].usia) {
                    Dosen26 temp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < idx; j++) {
                if (listDosen[j].usia > listDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            } 
            Dosen26 temp = listDosen[maxIdx];
            listDosen[maxIdx] = listDosen[i];
            listDosen[i] = temp;
        }
    }
}
