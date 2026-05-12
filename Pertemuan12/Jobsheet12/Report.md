# Laporan JOBSHEET XII - DOUBLE LINKED LIST


<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 12.2 Operasi Penambahan pada Double Linked List
Soal : 
<img width="555" height="336" alt="image" src="https://github.com/user-attachments/assets/f4e86144-5535-4173-be88-c558a6ade927" />

Jawaban : 
1. Secara struktur, Single Linked List hanya memiliki satu pointer (next) yang menunjuk ke node berikutnya. Double Linked List memiliki dua pointer, yaitu next (menunjuk node berikutnya) dan prev (menunjuk node sebelumnya). Dan secara Mekanisme Traversal, Karena hanya memiliki pointer next, traversal pada Single Linked List hanya bisa dilakukan satu arah (maju). Sedangkan pada Double Linked List, traversal bisa dilakukan dua arah (maju dan mundur) menggunakan pointer next dan prev.
2. Atribut next berfungsi untuk menyimpan referensi atau menunjuk ke node selanjutnya di dalam list. Ini digunakan untuk bergerak maju saat traversal. Sedangkan atribut prev berfungsi untuk menyimpan referensi atau menunjuk ke node sebelumnya di dalam list. Ini digunakan untuk bergerak mundur dan sangat memudahkan saat menyisipkan atau menghapus node di tengah list karena kita langsung mengetahui node sebelumnya.
3. Konstruktor menginisialisasi atribut head dan tail dengan nilai null . Hal ini mendefinisikan kondisi awal bahwa saat objek DoubleLinkedList26 pertama kali dibuat, list tersebut masih sepenuhnya kosong dan belum memiliki elemen (node) apa pun di dalamnya.
4. Ketika linked list dalam keadaan kosong dan satu node baru ditambahkan, node tersebut secara otomatis berperan ganda: sebagai elemen pertama (head) sekaligus elemen terakhir (tail) di dalam struktur list tersebut.
5. <img width="501" height="251" alt="image" src="https://github.com/user-attachments/assets/2bc374c6-ca6b-4405-901c-949114e1bf11" />
6. <img width="483" height="243" alt="image" src="https://github.com/user-attachments/assets/2aff6018-7cf4-496a-8a55-077683893429" />

## 12.3 Operasi Penghapusan pada Double Linked List
Soal : 
<img width="551" height="147" alt="image" src="https://github.com/user-attachments/assets/73f95275-39c5-4b20-8070-56154d9d1252" />

Jawaban : 
1. Fungsi statement head = head.next; pada removeFirst() adalah menggeser pointer head ke node urutan kedua. Ini membuat node kedua tersebut menjadi elemen pertama yang baru. dan untuk head.prev = null; berfungsi untuk memutus koneksi prev dari head yang baru agar tidak lagi menunjuk ke node pertama yang lama. Dengan demikian, node pertama yang lama terlepas sepenuhnya dari list dan memorinya akan dibersihkan oleh Garbage Collector.
2. <img width="538" height="311" alt="image" src="https://github.com/user-attachments/assets/f03957c0-930a-4ed9-9d1e-9ea79d844fd5" />
<img width="577" height="312" alt="image" src="https://github.com/user-attachments/assets/803431e7-44b0-4f86-bfd0-bdf26fe7889b" />

## TUGAS
Soal : 
<img width="557" height="232" alt="image" src="https://github.com/user-attachments/assets/e0f2d624-1cf2-4593-86f4-187975a6cc14" />

Jawaban : 
1. <img width="610" height="485" alt="image" src="https://github.com/user-attachments/assets/13d04b67-cb80-497b-bcc4-c906ee4af0c9" />
2. <img width="598" height="537" alt="image" src="https://github.com/user-attachments/assets/7dc1456f-ba8e-4ffa-aab8-85048045e33b" />
3. <img width="655" height="428" alt="image" src="https://github.com/user-attachments/assets/40cd6314-d8f2-4cac-861b-06be5880cf26" />
4. <img width="581" height="605" alt="image" src="https://github.com/user-attachments/assets/e593d38a-16c8-4d75-990e-c919f1254bf6" />
5. <img width="567" height="82" alt="image" src="https://github.com/user-attachments/assets/74fcf540-af46-4510-b080-3a64b1ac498d" />
