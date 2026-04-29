# Laporan Praktikum 9 - STACK

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas
Soal :
<img width="529" height="272" alt="image" src="https://github.com/user-attachments/assets/926b2ed9-85d2-431a-9322-47c740c46d9b" />

Jawaban : 
1. <img width="353" height="190" alt="image" src="https://github.com/user-attachments/assets/721918d8-ef28-4f82-aa3c-9703e6d5b3f4" />
  Bagian yang perlu diperbaiki, ada pada method Print yang berada di class StackTugasMahasiswa26. Untuk mengahaislkan keluaran yang sesuai
  dengan program, Iterasi maju yang awalnya dari bawah ke atas, diubah menjadi iterasi mundur yaitu dari atas ke bawah (Top-Down)
2. Data mahasiswa yang dapat ditampung adalah sebanyak 5 mahasiswa yang ditunjukkan pada potongan kode berikut:
   <img width="519" height="18" alt="image" src="https://github.com/user-attachments/assets/dd44b7f5-ce09-4e0e-98e5-ce087d3d456b" />
3. Pengecekan ini krusial untuk memastikan array yang menampung stack tidak melebihi ukuran yang dideklarasikan. Jika dihapus dan dilakukan
   push ketika array sudah penuh, maka akan terjadi error karena mencoba mengisi indeks array yang tidak ada.
4. <img width="658" height="165" alt="image" src="https://github.com/user-attachments/assets/77908f48-6462-48df-8efb-846afe11230b" />
   <img width="617" height="101" alt="image" src="https://github.com/user-attachments/assets/8714e363-1c19-45a7-9c23-d33815eb6710" />
5. <img width="275" height="78" alt="image" src="https://github.com/user-attachments/assets/54ca2ef7-11ab-4488-8464-9e499e234324" />
   <img width="632" height="63" alt="image" src="https://github.com/user-attachments/assets/4e219f1e-bf85-4cc0-adeb-270b8f3c3ddd" />

## 2.2 Percobaan 2:  Konversi Nilai Tugas ke Biner
Soal :
<img width="523" height="78" alt="image" src="https://github.com/user-attachments/assets/574f1edf-3780-4583-a7f6-184ee4f04c7a" />

Jawaban :
1. Method ini bekerja dengan konsep pembagian berulang sisa hasil bagi. Untuk mendapatkan sisa baginya (0 atau 1), dan sisa tersebut di-push
   ke dalam objek StackKonversi26. Kemudian angka desimal dibagi 2, berulang selama nilai desimal > 0. Setelah perulangan selesai, data dikeluarkan
   (di-pop) dari stack.
