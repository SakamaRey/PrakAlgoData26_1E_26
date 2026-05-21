public class DLLPesanan26 {
    NodePesanan26 head, tail;
    int size;

    public DLLPesanan26() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan26 data) {
        if (isEmpty()) {
            head = tail = new NodePesanan26(data, null, null);
        } else {
            NodePesanan26 newNode = new NodePesanan26(data, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void sortPesanan() {
        if (isEmpty() || head.next == null) return;

        boolean swapped;
        do { 
            swapped = false;
            NodePesanan26 current = head;
            while (current.next != null) { 
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan26 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakLaporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada data pesanan.");
            return;
        }
        sortPesanan();
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (Berdasarkan urutan nama");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan26 current = head;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("======================================");
        System.out.println("TOTAL PENDAPATAN : Rp. " + totalPendapatan);
    }
}
