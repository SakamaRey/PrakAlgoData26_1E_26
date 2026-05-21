public class DLLAntrian26 {
    NodePembeli26 head, tail;
    int size;
    int counterAntrian;

    public DLLAntrian26() {
        head = null;
        tail = null;
        size = 0;
        counterAntrian = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli26 data) {
        if (isEmpty()) {
            head = tail = new NodePembeli26(data, counterAntrian, null, null);
        } else {
            NodePembeli26 newNode = new NodePembeli26(data, counterAntrian, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: "+counterAntrian);
        counterAntrian++;
        size++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrean ksoong.");
            return;
        }
        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.printf("%-15s %-15s %-15s\n", " No Antrian", "Nama", "No Hp");
        NodePembeli26 current = head;
        while (current != null) { 
            System.out.printf("%-15d %-15s %-15s\n",  current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current  = current.next;
        }
    }

    public NodePembeli26 hapusAntrian26() {
        if (isEmpty()) {
            System.out.println("Antrean sudah kosong!");
            return null;
        }
        NodePembeli26 removedNode = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return  removedNode;
    }
}
