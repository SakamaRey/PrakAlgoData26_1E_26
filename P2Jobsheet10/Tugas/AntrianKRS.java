package Tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses;

    public AntrianKRS(int max) {
        data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.max = max;
        this.jumlahDiproses = 0;
    }

     public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(Mahasiswa mhs) {

        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public void prosesKRS() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int dipanggil = Math.min(2, size);
        System.out.println("Mahasiswa diproses KRS:");
        for (int i = 0; i < dipanggil; i++) {
            Mahasiswa mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
        if (size == 0) {
            front = rear = -1;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian:");
        int i = front;
        while (true) {
            data[i].tampilkanData();
            if (i == rear) {
                break;
            }
            i = (i + 1) % max;
        }
    }

     public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        int tampil = Math.min(2, size);
        int index = front;
        for (int i = 0; i < tampil; i++) {
            data[index].tampilkanData();
            index = (index + 1) % max;
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa diproses: " + jumlahDiproses);
    }

    public void cetakBelumProses() {
        int belum = 30 - jumlahDiproses;
        System.out.println("Mahasiswa belum proses KRS: " + belum
        );
    }
}
