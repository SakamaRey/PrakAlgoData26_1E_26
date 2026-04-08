# Laporan Praktikum 5 - Sorting & Praktikum 6 SEARCHING

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 5.2 Percobaan 1: Mengimplementasikan Sorting menggunakan object
Soal : 
<img width="319" height="178" alt="image" src="https://github.com/user-attachments/assets/fcb14d99-d0db-4286-9b64-dae480e19ffe" />

Jawaban : 
1. Blok kode if (data[j-1]>data[j]) bersama variabel temp digunakan untuk menukar posisi dua elemen array. Pada Bubble Sort, kalau elemen sebelumnya (j-1) lebih besar dari elemen sekarang (j), keduanya akan ditukar supaya urutannya jadi dari yang terkecil ke terbesar (ascending).
2. Kode Pencarian Nilai Minimum (Selection Sort) Bagian kode yang merupakan proses algoritma untuk mencari nilai minimum pada selection sort adalah: <img width="312" height="121" alt="image" src="https://github.com/user-attachments/assets/3a0ab0af-8622-40a5-8559-4564ec34f69b" />
3. Kondisi while (j>=0 && data[j]>temp) (memperbaiki typo pada soal) berarti perulangan akan terus berjalan selama dua syarat terpenuhi: indeks j belum sampai ke awal array (harus ≥ 0), dan elemen di indeks j masih lebih besar dari temp. Tujuannya adalah untuk menggeser elemen-elemen ke kanan sampai ketemu posisi yang tepat untuk menyisipkan elemen baru.
4. Tujuannya adalah untuk menggeser elemen ke sebelah kanannya (ke indeks berikutnya). Hal ini dilakukan untuk memberikan ruang kosong (membuat celah) agar nilai baru (temp) dapat disisipkan tepat di posisi terurutnya.

## 5.3 Percobaan 2: Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort) & Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)
Soal 1 : 
<img width="519" height="218" alt="image" src="https://github.com/user-attachments/assets/5a59b37f-40a4-43e6-93d5-89d15a924498" />

Jawaban : 
1. 
a. Karena kalau semua elemen kecuali 1 sudah diurutkan, elemen terakhir itu otomatis sudah berada di posisi yang benar (paling kecil), jadi tidak perlu ada perulangan tambahan untuk membandingkannya lagi.
b. Karena di setiap iterasi i, elemen terbesar akan "menggelembung" ke posisi yang tepat di akhir array. Jadi di iterasi berikutnya, elemen-elemen yang sudah terurut di bagian akhir tidak perlu dibandingkan lagi.
2. <img width="562" height="486" alt="image" src="https://github.com/user-attachments/assets/120aba51-0cd5-44af-99b5-314d0c5353d6" />

Soal 2 : 
<img width="448" height="201" alt="image" src="https://github.com/user-attachments/assets/45ba8a9c-2ac3-4fe0-bf9b-e8cfb763f2e3" />

Jawaban : 
1. Blok kode tersebut merupakan proses swap pada Selection Sort. Fungsinya untuk menukar objek Mahasiswa di indeks i dengan objek Mahasiswa di indeks idxMin (indeks nilai minimum) yang sudah ditentukan sebelumnya.

## 5.4 Percobaan 3: Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
Soal : 
<img width="551" height="61" alt="image" src="https://github.com/user-attachments/assets/7bc0dc57-6eab-4649-9557-045edcbdb494" />

Jawaban : 
1. <img width="454" height="243" alt="image" src="https://github.com/user-attachments/assets/0fab1ce8-5c73-41d4-a7a9-4dfed40266f6" />

## 5.5 Latihan Praktikum:
<img width="478" height="957" alt="image" src="https://github.com/user-attachments/assets/825e18c3-eb03-4452-8432-7fce08d92292" />
<img width="577" height="959" alt="image" src="https://github.com/user-attachments/assets/9d695602-dbfe-4542-abfe-68be2283a243" />
<img width="544" height="811" alt="image" src="https://github.com/user-attachments/assets/d7399280-53c4-433f-b958-1ed7a7388587" />

## 6.2 Percobaan 1: Searching/ Pencarian Menggunakan Algoritma Sequential Search
Soal :
<img width="542" height="289" alt="image" src="https://github.com/user-attachments/assets/a640af9d-c77f-4a34-b2d1-627b2a2e357d" />

Jawaban : 
1. Method tampilPosisi menampilkan indeks lokasi data yang ditemukan dalam array. sedangkan Method tampilDataSearch menampilkan detail lengkap mahasiswa (NIM, Nama, Kelas, dan IPK) berdasarkan indeks yang ditemukan.
2. Perintah break menghentikan perulangan (for loop) segera setelah data ditemukan (listMhs[j].ipk == cari), sehingga program lebih efisien karena tidak perlu memeriksa sisa elemen array.
3. Variabel pos menyimpan indeks array tempat data ditemukan. Nilai ini dikembalikan (return) untuk digunakan method lain dalam mengakses objek secara spesifik, misalnya untuk menampilkan data. Jika data tidak ditemukan, variabel ini menyimpan nilai -1 sebagai penanda.
4. Program akan menampilkan data pertama yang ia temukan. Hal ini dikarenakan algoritma melakukan pencarian secara berurutan dari indeks awal (j = 0) , dan ketika menemukan data yang cocok pertama kali, perintah break akan langsung menghentikan perulangan.
5. Tanpa break, perulangan akan memeriksa seluruh elemen array hingga akhir meskipun data sudah ditemukan. Jika terdapat lebih dari satu data dengan IPK yang sama, variabel posisi akan terus diperbarui, sehingga hasilnya menunjukkan posisi data terakhir yang cocok.

## 6.3 Percobaan 2: Searching/ Pencarian Menggunakan Algoritma Binary Search
Soal : 
<img width="551" height="291" alt="image" src="https://github.com/user-attachments/assets/866cccc6-8e9a-4e4f-b8cc-77553436e908" />

Jawaban : 
1. Proses divide (pembagian area pencarian) dijalankan pada baris kode yang mencari nilai tengah (mid), yaitu:
<img width="232" height="20" alt="image" src="https://github.com/user-attachments/assets/de43f149-76bf-43cc-84dc-d1784fb8ce05" />
2. Proses conquer (penaklukan sub-masalah secara rekursif) dijalankan pada baris pemanggilan method itu sendiri (rekursi) untuk mencari ke sisi kiri atau sisi kanan, yaitu:
<img width="373" height="62" alt="image" src="https://github.com/user-attachments/assets/5a94936a-77e5-4b6a-8a04-8eeba290c8ad" />
3. - left: Menyimpan indeks batas paling kiri (awal) dari area array yang sedang dicari.
   - right: Menyimpan indeks batas paling kanan (akhir) dari area array yang sedang dicari.
   - mid: Menyimpan indeks nilai tengah dari area pencarian yang digunakan sebagai titik pivot atau pembanding utama pada iterasi/rekursi tersebut.
4. Program tetap berjalan tanpa error, tetapi hasil pencarian menjadi tidak valid. Binary Search memerlukan data terurut (Ascending/Descending) karena algoritmanya mengeliminasi setengah area pencarian berdasarkan perbandingan nilai tengah. Tanpa pengurutan, eliminasi area menjadi tidak relevan dan hasil pencarian salah.
5. Hasilnya tidak sesuai karena kode dirancang untuk urutan Ascending. Pada Ascending, jika nilai tengah lebih besar dari yang dicari (listMhs[mid].ipk > cari), pencarian dilanjutkan ke kiri (mid-1). Untuk Descending, logika perbandingan harus dibalik. Berikut adalah modifikasi untuk data descending :
<img width="473" height="301" alt="image" src="https://github.com/user-attachments/assets/7c65daa1-83b3-4503-9b23-50fc9ce28f59" />
6. Binary Search menentukan data tidak ditemukan ketika area pencarian habis, ditandai dengan left > right. Kondisi ini ditangani oleh blok if (right >= left). Jika kondisi bernilai false, program mengeksekusi return -1 sebagai penanda data tidak ditemukan.
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard : 
<img width="422" height="42" alt="image" src="https://github.com/user-attachments/assets/93d4e8a0-0c03-4b70-a613-1677381433ce" />
