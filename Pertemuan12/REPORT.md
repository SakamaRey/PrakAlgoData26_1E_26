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
