package Tugas;

public class QueueLinkedList26 {
    Node26 front;
    Node26 rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }
    boolean isFull() {
        return false;
    }
    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void enqueue(Mahasiswa26 data) {
        Node26 newNode = new Node26(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            rear.data.tampilData();
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node26 temp = front;
            System.out.println("===== DAFTAR ANTRIAN =====");
            while (temp != null) {
                temp.data.tampilData();
                System.out.println("---------------------");
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre : " + size);
    }
}
