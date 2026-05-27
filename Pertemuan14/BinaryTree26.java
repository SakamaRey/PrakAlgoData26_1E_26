public class BinaryTree26 {
    Node26 root;

    public BinaryTree26() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa26 mahasiswa) {
        Node26 newNode = new Node26(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node26 current = root;
            Node26 parent = null;
            while (true) { 
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node26 current = root;
        while (current != null) { 
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node26 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node26 getSuccessor(Node26 del) {
        Node26 successor = del.right;
        Node26 successorParent = del;
        while (successor.left != null) { 
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return  successor;
    }

    void deleted(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // Cari node (current) yang akan dihapus
        Node26 parent = root;
        Node26 current = root;
        boolean isLeftChild = false;
        while (current != null) { 
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //JIka tidak ada anak (leaf) , maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node26 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Jawaban Tugas Praktikum Jbbsheet 14 Tree 
    // 1. Method menambahkan node dengan cara rekursif
    public void addRekursif(Mahasiswa26 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }
    private Node26 addRekursif(Node26 current, Mahasiswa26 mahasiswa) {
        if (current == null) {
            return new Node26(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    // 2. Method mencari Mahasiswa dengan IPK terkecil dan terbesar
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node26 current = root;
        while (current.left != null) { 
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IP terkecil :");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node26 current = root;
        while (current.right != null) { 
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IP terbesar :");
        current.mahasiswa.tampilInformasi();
    }

    // 3. Method menampilkan data mahasiswa dengan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Daftar Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node26 node, double ipkBatas){
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas); // Traverse Kiri
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi(); // Cetak ketika memenuhi syarat
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas); // Traverse Kanan
        }
    }
}
