public class BinaryTreeArray26 {
    Mahasiswa26[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray26() {
        this.dataMahasiswa = new Mahasiswa26[10];
    }

    void populateData(Mahasiswa26 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}
