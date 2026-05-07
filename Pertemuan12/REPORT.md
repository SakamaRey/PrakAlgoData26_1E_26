# Laporan JOBSHEET 11 - LINKED LIST


<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Pembuatan Single Linked List
Soal : 
<img width="567" height="109" alt="image" src="https://github.com/user-attachments/assets/5030a6a5-8a60-4ac2-acfc-5fb781e7ea3d" />

Jawaban : 
1. Karena pada awal program object SingleLinkedList00 baru dibuat dan belum memiliki node sama sekali.
2. Variabel temp digunakan sebagai penunjuk sementara untuk melakukan traversal/penelusuran linked list. Fungsinya mengakses node satu per satu, mencari data tertentu, membantu proses insert, membantu proses remove, menghindari perubahan langsung pada head. Tanpa temp, pointer head bisa berubah dan linked list menjadi rusak.
3. <img width="547" height="464" alt="image" src="https://github.com/user-attachments/assets/8d807a19-04bf-4471-8115-ac8ce4c2288e" />

## 2.2 Modifikasi Elemen pada Single Linked List
Soal : 
<img width="479" height="312" alt="image" src="https://github.com/user-attachments/assets/1e98b82b-62fb-47d1-b674-b9f0f8f335cd" />

Jawaban : 
1. Karena setelah data ditemukan dan dihapus, proses pencarian tidak perlu dilanjutkan lagi. Jika tidak menggunakan break akan terjadi beberapa hal, yaitu : program tetap menelusuri node berikutnya, proses menjadi tidak efisien, berpotensi error jika node sudah berubah. Break digunakan untuk langsung keluar dari perulangan.
2. Baris 1 digunakan untuk melewati node yang ingin dihapus. Baris 2 digunakan untuk memperbarui tail jika node yang dihapus adalah node terakhir. Karena setelah node terakhir dihapus, node sebelumnya menjadi tail baru.

## Tugas
Soal : 
<img width="558" height="226" alt="image" src="https://github.com/user-attachments/assets/a0689594-4cd9-4846-846e-7e80d25cdcd7" />

Jawaban : 
<img width="587" height="972" alt="image" src="https://github.com/user-attachments/assets/318c2560-de37-42f4-9bd1-ab7694f9007f" />
<img width="587" height="941" alt="image" src="https://github.com/user-attachments/assets/beb40c35-b0c2-4fb9-9e24-26f9c88f1b88" />
<img width="588" height="952" alt="image" src="https://github.com/user-attachments/assets/b11329f6-a752-42da-a10f-002f8178eb05" />
<img width="588" height="822" alt="image" src="https://github.com/user-attachments/assets/28280886-4d4f-4f9e-b21b-7bec8e027eeb" />
