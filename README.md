Jawaban Pertanyaan untuk Percobaan 1

1. Yang pertama adalah inisialisasi, yaitu nilai awal dari sebuah perulangan(int i = 0), lalu kondisi, yang menentukan batasan dari sebuah perulangan (i <= 10), Ketiga, Statement, untuk membuat outputnya, dan yang terakhir update, untuk membuat perulangannya
2. Karena batasan nilai tertinggi harus dimulai dari yg terendah, begitu juga sebaliknya. Jika nilainya ditukar maka system akan memunculkan bug, dan nilai yg harus diinput harus melebihi 100 dan dibawah 0
3. if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
    Program akan membandingkan nilai dengan variable nilai tertinggi lalu mengubah variable tertinggi menjadi nilai yang diinput diawal, begitu juga dengan yang terendah.

Jawaban Pertanyaan untuk Percobaan 2

1. a. nilai kurang dari 0 atau nilai lebih dari 100, jadi program akan menghasilkan true apabila salah satu kondisi terpenuhi
    b. continue berfungsi untuk melanjutkan program entah kondisinya true atau false
2. Operator i++ ditempatkan di bagian akhir agar nilainya tidak langsung bertambah sebelum menjalankan perintah di atasnya. Jika i++ diletakkan di awal, maka proses perhitungan (i+1) akan dimulai dari angka 2.
3. Jumlah perulangannya tetap 19 kali karena nilai awal i adalah 0.

Jawaban Pertanyaan untuk Percobaan 3

1. Program tidak akan mengulangi prosesnya dan akan langsung berhenti karena ada perintah break;.
2. Perulangan do-while akan berhenti ketika pengguna memasukkan kata "batal" sebagai nama pelanggan, sebab perintah break membuat loop berhenti secara paksa.
3. Kata true digunakan agar perulangan berjalan terus-menerus tanpa batas, jadi program hanya akan berhenti kalau ada perintah khusus seperti break;.
<<<<<<< HEAD
4. Hal ini terjadi karena kendali perulangan sepenuhnya bergantung pada kondisi dan perintah yang ada di dalam blok while(kondisi).
=======
4. Hal ini terjadi karena kendali perulangan sepenuhnya bergantung pada kondisi dan perintah yang ada di dalam blok while(kondisi).
>>>>>>> 2e2d079e1e8a24e58619aca2ef654ea0958d8cd4
