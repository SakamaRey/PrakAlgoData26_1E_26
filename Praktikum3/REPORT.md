# Laporan JOBSHEET III ARRAY OF OBJECTS

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
Soal :
<img width="683" height="399" alt="image" src="https://github.com/user-attachments/assets/1609bd73-88eb-404f-ae86-9304b92552d6" />

Jawaban :
1. Tidak selalu. Sebuah class di Java bisa hanya berisi atribut saja (seperti struktur data konvensional) tanpa method, atau sebaliknya
2. Kode tersebut melakukan deklarasi sekaligus instansiasi array bernama arrayOfMahasiswa dengan tipe data Mahasiswa.
3. Pada pendefinisian awal, class Mahasiswa tidak dituliskan konstruktornya secara jelas. Namun secara otomatis Java, menyediakan Default Constructor
   (konstruktor tanpa parameter) jika tidak ada konstruktor yang dibuat. Oleh karena itu, pemanggilan new Mahasiswa(); tetap bisa dijalankan.
4. Kode tersebut digunakan untuk melakukan instansiasi sebuah objek Mahasiswa dan menyimpannya arrayOfMahasiswa.
5. Pemisahan ini bertujuan untuk menerapkan prinsip Modularitas dan Single Responsibility Principle. Class Mahasiswa bertugas murni sebagai model data,
   sedangkan MahasiswaDemo khusus berfungsi sebagai program utama yang memiliki main method untuk mengeksekusi logika aplikasi.

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
Soal :
<img width="668" height="243" alt="image" src="https://github.com/user-attachments/assets/b58c2b1b-29e3-412c-880b-c35a71bf267b" />

Jawaban :
1. <img width="523" height="143" alt="image" src="https://github.com/user-attachments/assets/ea6ad79f-6b3c-415f-94e0-6647ccdf85a7" />
   <img width="611" height="187" alt="image" src="https://github.com/user-attachments/assets/ba94b44f-30c3-4307-8ab8-ba1e1cdc5c44" />
2. Meskipun telah dibuat array new Mahasiswa[3}, tetapi objek Mahasiswanya belum dibuat. Elemen myArrayOfMahasiswa[0] masih bernilai null.
   Maka dari itu wajib melakukan instansiasi objek terlebih dahulu dengan menambahkan myArrayOfMahasiswa[0] = new Mahasiswa();
   sebelum memberikan nilai pada atributnya.

## 3.4 Percobaan 3: Constructor Berparameter
Soal :
1. <img width="868" height="269" alt="image" src="https://github.com/user-attachments/assets/556a3fc6-440c-4e9c-a08f-fdd45c05a81b" />

Jawaban :
1. Bisa, ini disebut dengan Constructor Overloading. Contohnya, dalam satu class Mahasiswa terdapat constructor tanpa parameter public Mahasiswa() { }
   dan constructor berparameter public Mahasiswa(String nama) { this.nama = nama; }
2. <img width="654" height="126" alt="image" src="https://github.com/user-attachments/assets/2a648aa0-f24a-4c61-a394-4a329e3882ab" />
3. <img width="510" height="141" alt="image" src="https://github.com/user-attachments/assets/36868aae-0298-49fc-9579-ee0eba777a6e" />
4. <img width="558" height="75" alt="image" src="https://github.com/user-attachments/assets/e836bcbc-3570-42aa-bdd9-71824241d956" />

## TUGAS PRAKTIKUM 3 : 
Soal :
1. <img width="654" height="371" alt="image" src="https://github.com/user-attachments/assets/70feb615-07e2-4136-98ad-bdb9b0c89be2" />
2. <img width="624" height="309" alt="image" src="https://github.com/user-attachments/assets/3dc0ade2-f122-4afd-aac5-c2b996e4a866" />

Hasil Running :
1. <img width="632" height="707" alt="image" src="https://github.com/user-attachments/assets/5e4d2b80-d549-42a7-b34f-261473afa1d4" />
2. <img width="369" height="713" alt="image" src="https://github.com/user-attachments/assets/b9ffc16b-5b54-447b-807c-c4b00be9fb6b" />
   <img width="431" height="638" alt="image" src="https://github.com/user-attachments/assets/0ad71b99-ac74-4e81-83ee-59492fc49ec5" />

