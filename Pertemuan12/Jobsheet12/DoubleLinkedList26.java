package Jobsheet12;

public class DoubleLinkedList26 {
    Node26 head;
    Node26 tail;
    // Jawaban Tugas Praktikum No 5 : Atribut size
    int size;

    public DoubleLinkedList26() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Jawaban Tugas Praktikum No 1: Method add(int index, Mahasiswa data)
    public void add(int index, Mahasiswa26 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            // Asumsi method addLast sudah dideklarasikan dan melakukan size++
            // list.addLast(data);
        } else {
            Node26 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node26 newNode = new Node26(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void addLast(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa26 data){
        Node26 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node26 newNode = new Node26(data);
        // Jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //Node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // Jawaban Tugas Praktikum No 2: Method removeAfter()
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }
        Node26 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null || current.next == null) {
            System.out.println("Node dengan NIM " + keyNim + 
            " tidak ditemukan atau tidak ada node setelahnya.");
            return;
        }

        Node26 toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current; // Jika node yang dihapus adalah tail
        }
        size--;
        System.out.println("Berhasil menghapus data setelah NIM: " + keyNim);
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        Mahasiswa26 deleteData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data yang dihapus: " + deleteData.nama);
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked Link kosong.");
            return;
        }
        Mahasiswa26 deletedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data yang dihapus: " + deletedData.nama);
    }

    // Jawaban Tugas Praktikum No 3: Method remove(int index)
    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau List kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node26 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus.");
        }
    }

    // Jawaban Tugas Praktikum No 4a: Method getFirst()
    public Mahasiswa26 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
            return null;
        }
        return head.data;
    }

    // Jawaban Tugas Praktikum No 4b: Method getLast()
    public Mahasiswa26 getLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
            return null;
        }
        return tail.data;
    }

    // Jawaban Tugas Praktikum No 4c: Method getIndex()
    public Mahasiswa26 getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau List kosong!");
            return null;
        }
        Node26 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Jawaban Tugas Praktikum No 5: Method untuk mendapatkan jumlah data 
    public int getSize() {
        return size;
    }
}
