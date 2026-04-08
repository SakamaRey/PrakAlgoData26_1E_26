# Laporan Praktikum 5 - Sorting

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 5.2 Percobaan 2: Mengimplementasikan Sorting menggunakan object
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
