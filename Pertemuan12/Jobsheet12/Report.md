# Laporan JOBSHEET XII - DOUBLE LINKED LIST


<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Operasi Penambahan pada Double Linked List
Soal : 
<img width="555" height="336" alt="image" src="https://github.com/user-attachments/assets/f4e86144-5535-4173-be88-c558a6ade927" />

Jawaban : 
1. Secara struktur, Single Linked List hanya memiliki satu pointer (next) yang menunjuk ke node berikutnya. Double Linked List memiliki dua pointer, yaitu next (menunjuk node berikutnya) dan prev (menunjuk node sebelumnya). Dan secara Mekanisme Traversal, Karena hanya memiliki pointer next, traversal pada Single Linked List hanya bisa dilakukan satu arah (maju). Sedangkan pada Double Linked List, traversal bisa dilakukan dua arah (maju dan mundur) menggunakan pointer next dan prev.
2. Atribut next berfungsi untuk menyimpan referensi atau menunjuk ke node selanjutnya di dalam list. Ini digunakan untuk bergerak maju saat traversal. Sedangkan atribut prev berfungsi untuk menyimpan referensi atau menunjuk ke node sebelumnya di dalam list. Ini digunakan untuk bergerak mundur dan sangat memudahkan saat menyisipkan atau menghapus node di tengah list karena kita langsung mengetahui node sebelumnya.
3. Konstruktor menginisialisasi atribut head dan tail dengan nilai null . Hal ini mendefinisikan kondisi awal bahwa saat objek DoubleLinkedList26 pertama kali dibuat, list tersebut masih sepenuhnya kosong dan belum memiliki elemen (node) apa pun di dalamnya.
4. Ketika linked list dalam keadaan kosong dan satu node baru ditambahkan, node tersebut secara otomatis berperan ganda: sebagai elemen pertama (head) sekaligus elemen terakhir (tail) di dalam struktur list tersebut.
5. <img width="501" height="251" alt="image" src="https://github.com/user-attachments/assets/2bc374c6-ca6b-4405-901c-949114e1bf11" />
6. <img width="483" height="243" alt="image" src="https://github.com/user-attachments/assets/2aff6018-7cf4-496a-8a55-077683893429" />



