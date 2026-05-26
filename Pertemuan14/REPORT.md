# Laporan JOBSHEET 14 - TREE

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 14.2 Implementasi Binary Search Tree menggunakan Linked List
Soal : 
<img width="517" height="332" alt="image" src="https://github.com/user-attachments/assets/59f4b5ba-394f-46e0-8c34-6623e2540873" />

Jawaban : 
1. Karena Binary Search Tree (BST) memiliki aturan penempatan node yang terstruktur. Di mana nilai node anak sebelah kiri selalu lebih kecil dari parent-nya, dan nilai node anak sebelah kanan selalu lebih besar dari parent-nya.
2. Atribut left digunakan untuk menyimpan referensi atau alamat memori dari node anak di sebelah kiri (left child). Sementara atribut right digunakan untuk menyimpan referensi atau alamat memori dari node anak di sebelah kanan (right child).
3. a. Atribut root berguna sebagai pintu masuk utama, titik awal, atau fondasi teratas untuk mengakses seluruh struktur komponen node yang ada di dalam pohon biner tersebut.
   b. Nilai dari root saat pertama kali objek pohon dibuat adalah null
4. Program akan memeriksa kondisi pohon melalui method isEmpty(). Karena kondisi bernilai true, node baru (newNode) yang baru saja dibuat akan langsung ditunjuk dan ditetapkan menjadi root dari pohon tersebut.
5. Baris program tersebut berfungsi untuk mencari posisi kosong yang tepat bagi node baru berdasarkan perbandingan nilai IPK mahasiswa secara non-rekursif. parent = current; digunakan untuk mengunci/menyimpan posisi node saat ini sebagai parent sebelum melangkah ke level bawahnya. if (mahasiswa.ipk < current.mahasiswa.ipk) memeriksa apakah IPK mahasiswa yang baru dimasukkan lebih kecil dari IPK node saat ini. Bagian else dieksekusi jika IPK mahasiswa baru lebih besar dari IPK node saat ini.
6. Method delete() mendeteksi bahwa node yang akan dihapus (current) memiliki dua anak. Method delete() memanggil helper method getSuccessor(current) untuk mencari node pengganti yang paling ideal. Di dalam getSuccessor(), pengganti (successor) dicari dengan cara bergeser satu kali ke kanan (del.right), lalu menelusuri cabang kiri hingga ujung terdalam (while (successor.left != null)) untuk mendapatkan nilai terkecil di sub-pohon kanan tersebut. Jika node pengganti bukan anak langsung dari node yang dihapus, posisi lamanya akan dilepas dan anak kanan milik successor akan disambungkan ke parent dari successor tersebut. Anak kanan successor kemudian disesuaikan agar mengambil alih anak kanan milik node yang dihapus. Di dalam method delete(), posisi current digantikan sepenuhnya oleh successor. Terakhir, anak kiri milik successor diatur untuk memegang kendali atas anak kiri milik node yang baru saja dihapus tersebut (successor.left = current.left).

## 14.3 Implementasi Binary Tree dengan Array
Soal : 
<img width="530" height="157" alt="image" src="https://github.com/user-attachments/assets/e13e4f79-de73-445f-9ee0-8b28dd2e0de0" />
