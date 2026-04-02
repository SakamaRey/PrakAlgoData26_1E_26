# Laporan JOBSHEET V BRUTE FORCE DAN DIVIDE CONQUER

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 5.2 Percobaan 1: Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
Soal :
<img width="777" height="247" alt="image" src="https://github.com/user-attachments/assets/df6c5be1-ceb8-49ba-a694-3e9c0401e3fa" />

Jawaban : 
1. Bagian if(n==1) bertindak sebagai base case (kondisi berhenti) dalam rekursi; ketika nilai n mencapai 1, fungsi akan langsung mengembalikan nilai 1 tanpa memanggil dirinya sendiri lagi.
   Sementara bagian else adalah recursive step (langkah rekursif) di mana fungsi memecah masalah dengan memanggil kembali dirinya sendiri dengan nilai parameter yang lebih kecil, yaitu n-1.
2. Bisa, sebagai contoh perulangan for bisa diganti dengan perulangan while :
   <img width="303" height="237" alt="image" src="https://github.com/user-attachments/assets/4d2b8f0d-8233-4570-989a-7a0bc1288b16" />
3. - (fakto26 *= i;) adalah instruksi iteratif (Brute Force) yang secara berulang mengalikan nilai variabel fakto saat ini dengan nilai i yang bertambah setiap perulangan.
   - int fakto = n * faktorialDC(n-1); adalah instruksi rekursif (Divide and Conquer) yang menghitung nilai dengan cara mengalikan angka saat ini (n) dengan hasil pemanggilan fungsi itu sendiri
     untuk nilai sebelumnya (n-1).
4. - faktorialBF() (Brute Force): Bekerja secara berurutan dan iteratif (menggunakan perulangan) dengan mengalikan bilangan dari 1 hingga n untuk mendapatkan hasil akhir.
   - faktorialDC() (Divide and Conquer): Bekerja secara rekursif dengan memecah operasi faktorial menjadi sub-masalah yang lebih kecil (mengalikan n dengan (n-1)!) hingga mencapai
   - kondisi dasar (1! = 1), lalu menggabungkan hasil perhitungannya secara mundur.

## 5.3 Percobaan 2: Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Soal :
<img width="517" height="182" alt="image" src="https://github.com/user-attachments/assets/96d66ddd-bfe1-4ecb-8f37-937929f63d66" />

Jawaban : 
1. pangkatBF() menghitung pangkat dengan mengalikan basis (a) secara berulang sebanyak eksponen (n) kali menggunakan perulangan iteratif. Sedangkan pangkatDC() menghitung pangkat dengan membagi masalah
   secara rekursif, eksponen (n) dibagi 2 pada setiap pemanggilan, yang secara signifikan mengurangi jumlah operasi perkalian dibandingkan Brute Force.
2. Tahap combine sudah termasuk dalam kode pangkatDC(). Tahap combine terjadi pada bagian return, di mana hasil dari sub-masalah digabungkan.
   <img width="390" height="16" alt="image" src="https://github.com/user-attachments/assets/dd7ea2eb-0484-4345-9440-a97667faff7f" />
3. Dikarenakan Pangkat26 sudah memiliki atribut nilai dan pangkat pada konstruktornya , menambahkan parameter pada method sebenarnya kurang relevan karena method bisa langsung mengakses atribut class.
   Berikut merupakan contoh jika parameternya tidak ada :
   <img width="364" height="147" alt="image" src="https://github.com/user-attachments/assets/904aca64-714d-4ede-a7af-da45cf28f12d" />
4. pangkatBF() mencari hasil pangkat dengan operasi perkalian linier selangkah demi selangkah. pangkatDC() mengoptimalkan perhitungan pangkat yang besar dengan membelah eksponen menjadi dua secara terus-menerus,
   memprosesnya secara rekursif, lalu menggabungkan hasilnya.

## 5.4 Percobaan 3: Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Soal :
<img width="413" height="185" alt="image" src="https://github.com/user-attachments/assets/c0e9cf89-d2c2-48d3-bf58-c665ee743607" />

Jawaban : 
1. Variabel mid digunakan sebagai titik tengah untuk membagi (divide) array menjadi dua bagian yang sama (atau hampir sama), yaitu sisi kiri dan sisi kanan, untuk diproses secara terpisah.
2. Statement tersebut berfungsi untuk memanggil fungsi totalDC() secara rekursif guna menghitung total keuntungan pada bagian kiri array (lsum) mulai dari indeks l hingga mid, dan bagian kanan array (rsum) mulai dari indeks mid+1 hingga r.
3. Dikarenakan Ini adalah tahap combine (penggabungan). Setelah bagian kiri dan kanan array dijumlahkan secara terpisah, hasilnya harus ditambahkan bersama (lsum + rsum) untuk mendapatkan total nilai keseluruhan dari array pada tingkat rekursi tersebut.
4. Base case-nya adalah if(l==r). Kondisi ini terpenuhi jika rentang array yang diperiksa hanya memiliki 1 elemen. Saat kondisi ini tercapai, fungsi akan langsung mengembalikan nilai array pada indeks tersebut (return arr[l];).
5. Algoritma membelah array keuntungan menjadi dua bagian berulang kali hingga hanya tersisa satu elemen per bagian (Divide). Kemudian, nilai dari elemen-elemen individual tersebut dijumlahkan kembali secara bertahap dari bawah ke atas (Conquer dan Combine) untuk mendapatkan nilai total keseluruhan.

## TUGAS : 
Soal : 
<img width="539" height="324" alt="image" src="https://github.com/user-attachments/assets/3d63c969-77f6-4467-a670-ab9c68e16fab" />

Jawaban : 
<img width="1552" height="117" alt="image" src="https://github.com/user-attachments/assets/50e0fd6a-329c-4db9-87a0-4f4d2be80bf9" />
