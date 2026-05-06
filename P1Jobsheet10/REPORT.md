# Laporan P1 JOBSHEET 10 - Queue

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1:  Operasi Dasar Queue
Soal :
<img width="561" height="433" alt="image" src="https://github.com/user-attachments/assets/cecc18f2-9b4b-41df-8254-6d6aaf7956d1" />

Jawaban :
1. Karena queue awalnya masih kosong. Jika front dan rear langsung 0, program akan menganggap sudah ada data pada index pertama.
2. Kode ini digunakan untuk circular queue. Tujuannya agar queue bisa memakai kembali index kosong di depan array.
3. Kode ini juga digunakan untuk circular queue. Tujuannya agar proses penghapusan data tetap berjalan melingkar.
4. Karena data pertama queue tidak selalu berada di index 0.
   Pada circular queue:
   front dapat berpindah.
   Data valid dimulai dari posisi front.
   Jika dimulai dari 0:
   Bisa menampilkan data sampah.
   Bisa menampilkan elemen yang sudah keluar.
5. Kode ini digunakan agar index bergerak melingkar, contoh :
   max = 5
   i = 4
   maka:
   (4 + 1) % 5 = 0
   Artinya index kembali ke awal array.
6. <img width="387" height="47" alt="image" src="https://github.com/user-attachments/assets/925d57a9-12d6-40f0-9388-5f2886bc229b" />
7. <img width="444" height="90" alt="image" src="https://github.com/user-attachments/assets/2d107b42-ec4c-45a1-b6ab-291630b5f78e" />
   <img width="436" height="109" alt="image" src="https://github.com/user-attachments/assets/684fad30-9105-445f-aaa5-184e770b4871" />
