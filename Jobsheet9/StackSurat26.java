public class StackSurat26 {
    Surat26[] stack;
    int size;
    int top;

    public StackSurat26(int size) {
        this.size = size;
        stack = new Surat26[size];
        top = -1;
    }
    
    public boolean isFull(){
        return top == size -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Surat26 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Tumpukan surat penuh");
        }
    }

    public Surat26 pop(){
        if (!isEmpty()) {
            Surat26 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat masuk");
            return null;
        }
    }

    public Surat26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMhs) {
        boolean ditemukan = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                   System.out.println("Surat ditemukan!");
                    System.out.println("ID Surat\t: " + stack[i].idSurat);
                    System.out.println("Nama\t\t: " + stack[i].namaMahasiswa);
                    System.out.println("Jenis Izin\t: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Lainnya"));
                    System.out.println("Durasi\t\t: " + stack[i].durasi + " hari");
                    ditemukan = true;
                    break; 
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin atas nama "+namaMhs+" tidak ditemukan.");
        }
    }
}
