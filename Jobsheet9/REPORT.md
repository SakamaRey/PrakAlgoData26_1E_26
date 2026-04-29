# Jobsheet 9: Stack dan Aplikasinya

## Objektif
Memahami dan mengimplementasikan struktur data Stack (Tumpukan) serta penerapannya dalam sistem pengumpulan dan penilaian tugas mahasiswa.

## Deskripsi Program

### 1. Mahasiswa26.java
Class yang merepresentasikan data mahasiswa dengan:
- **nim**: Nomor identitas mahasiswa
- **nama**: Nama mahasiswa  
- **kelas**: Kelas mahasiswa
- **nilai**: Nilai tugas yang diperoleh
- **Method tugasDinilai()**: Untuk menyimpan nilai tugas

### 2. StackTugasMahasiswa26.java
Implementasi Stack dengan operasi:
- **push()**: Menambahkan tugas mahasiswa ke stack
- **pop()**: Mengeluarkan tugas dari stack (LIFO - Last In First Out)
- **peek()**: Melihat tugas di puncak stack tanpa mengeluarkannya
- **isFull()**: Mengecek apakah stack penuh
- **isEmpty()**: Mengecek apakah stack kosong
- **print()**: Menampilkan semua tugas dalam stack
- **peekBottom()**: Melihat tugas pertama di dasar stack
- **getJumlahTugas()**: Menghitung jumlah tugas dalam stack

### 3. MahasiswaDemo26.java
Program utama dengan menu interaktif:
1. **Mengumpulkan Tugas** - Menambah tugas ke stack
2. **Menilai Tugas** - Mengeluarkan tugas dan memberikan nilai
3. **Melihat Tugas Teratas** - Melihat tugas yang paling baru dikumpulkan
4. **Melihat Daftar Tugas** - Menampilkan semua tugas dalam stack
5. **Melihat Tugas Pertama** - Melihat tugas yang paling lama (di dasar stack)
6. **Jumlah Tugas** - Menampilkan total tugas yang dikumpulkan

## Konsep Stack
Stack adalah struktur data dengan prinsip LIFO (Last In First Out):
- Elemen yang terakhir dimasukkan akan menjadi yang pertama dikeluarkan
- Analog dengan tumpukan piring di meja makan

## Cara Menggunakan
1. Jalankan program: `java Jobsheet9.MahasiswaDemo26`
2. Pilih menu (1-6) sesuai kebutuhan
3. Masukkan data mahasiswa dan tugas sesuai permintaan program
4. Program akan terus berjalan sampai kondisi tertentu dipenuhi

## Perbaikan yang Dilakukan
- ✅ Memperbaiki logika method `pop()` pada StackTugasMahasiswa26.java
- ✅ Memperluas kondisi loop untuk mendukung semua opsi menu (1-6)
- ✅ Menambahkan dokumentasi lengkap pada REPORT.md
