# Laporan JOBSHEET II OBJECT

<h4>Nama : Resya Fajar Putra Pratama<h4>
<h4>NIM : 254107020124<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

Soal :
<img width="852" height="148" alt="image" src="https://github.com/user-attachments/assets/5c8d5c53-71a6-47cd-833b-d0f1cf74972b" />
<img width="924" height="256" alt="image" src="https://github.com/user-attachments/assets/09bc0656-e2eb-4f63-887c-61c0f6a80061" />

Jawaban :
1. Atribut (berfungsi menyimpan state/data) dan Method (berfungsi mendefinisikan behavior/perilaku)
2. Ada 4 yaitu nim, nama, dan kelas menggunakan tipe data String dan ipk menggunakan tipe data double.
3. Ada 4 yaitu tampilaknInformasi, ubahKelas,updateIpk, nliKinerja.
4. <img width="663" height="160" alt="image" src="https://github.com/user-attachments/assets/f15346f2-b8a7-4f89-82f7-5e1c7d46683e" />
5. Cara kerja method nliKinerja adalah, saat nilai  dari IPK sudah muncul, maka method nliKinerja akan mengembalikan nilai dalam bentuk String. Seperti contoh, saat IPK    memiliki nilai di atas 3.5, maka method nliKinerja akan mengembalikan string "Kinerja sangat baik". Begitu dengan seterusnya

## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

Soal :
<img width="525" height="118" alt="image" src="https://github.com/user-attachments/assets/cca3bec1-7600-4a7a-810f-23d44dc74bb9" />

Jawaban : 
1. Baris kodenya adalah Mahasiswa mhs1 = new Mahasiswa();. Nama object yang dihasilkan dari instansiasi tersebut adalah mhs1.
2. Untuk mengakses atribut dan method, perlu digunakannya operator "." setelah nama object, pada kasus ini seperti "mhs1.nama26 = "Muhammad Ali Farhan";" disini untuk      mengisi atribut dan "mhs1.tampilkanInformasi();" untuk memanggil method
3. Kenapa bisa berbeda ?  dikarenakan terjadi beberapa perubahan saat memanggil method yaitu "mhs.ubahKelas" dan "mhs.updateIpk"

## 2.3 Percobaan 3: Membuat Konstruktor

Soal :
<img width="622" height="200" alt="image" src="https://github.com/user-attachments/assets/aa743253-6df3-48e3-a283-50f151028a1c" />
<img width="581" height="96" alt="image" src="https://github.com/user-attachments/assets/2dc0ee7d-e2f1-41f4-aea7-49beaab807a1" />

Jawaban :
1. <img width="619" height="122" alt="image" src="https://github.com/user-attachments/assets/bb9a0b79-e9d7-4b32-ad66-cc950dd0ba17" />
   ini merupakan baris kode yang berupa konstruktor
2. Baris program tersebut sedang melakukan proses pembuatan objek baru (instasiasi) bernama mhs2. Objek ini dibuat menggunakan konstruktor berparameter sehingga atribut    nama, nim, ipk, dan kelas langsung diisi dengan nilai awal secara bersamaan saat objek diciptakan.
3. Jika konstruktor Mahasiswa dihapus, maka saat run file, akan terjadi error. Hal ini dikarenakan, pada class MahasiswaMain terdapat kode "new Mahasiswa26" yang memanggil konstruktor kosong tersebut. Jika konstruktor dihilangkan di file Mahasiswa, maka terjadinya error saat run file akan terjadi
4. Pemanggilan method dapat dilakukan sesuai dengan alur kebutuhan program. Jadi tidak ada kewajiban untuk mengakses method secara berurutan, namun disarankan untuk melakukannya secara berurutan agar memudahkan dalam penggunaan method tersebut.
5. <img width="921" height="44" alt="image" src="https://github.com/user-attachments/assets/0ead01c9-67a9-49ef-8829-e614616a3221" />

## 2.4 Percobaan 4: Latihan Praktikum

Soal :
1. <img width="625" height="634" alt="image" src="https://github.com/user-attachments/assets/8026199f-9a17-4f24-bca1-9a0e468d7648" />
   <img width="609" height="288" alt="image" src="https://github.com/user-attachments/assets/106c5326-6c36-4caa-a6a4-df50eea8ea0d" />
2. <img width="689" height="593" alt="image" src="https://github.com/user-attachments/assets/a2cce92a-eea7-408c-a66a-18c4728f20a4" />
   <img width="594" height="356" alt="image" src="https://github.com/user-attachments/assets/a8aa088e-e77e-4039-893d-b7c45107128f" />

Hasil Running : 
1. <img width="1552" height="344" alt="image" src="https://github.com/user-attachments/assets/22ae70c9-e366-4603-8b0d-b1e7e0afaa1f" />
2. <img width="1556" height="379" alt="image" src="https://github.com/user-attachments/assets/12846688-2895-4103-94ae-7370ce70ac29" />
