 meng# Tugas_Latihan_Coding
## Nama : M. Ihtifanul Montaghib
## NPM  : G1A023094
## Informatika, B

# Tugas MKU Koding

1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for

# Penjelasan

## 1 (Perulangan100.java)

pada Perulangan100.java saya menggunakan perulangan "for" dengan memasukkan string dengan nama. selanjutnya memasukkan angka dengan membatasinya antara angka 1 dan 9 dengan dengan menggunakan "if". yang akan mengeluarkan output dari angka 1-9

**if (i <=9) {
  System.out.println(i);**

setelah itu menggunakan kode "else if" saat kodenya terpenuhi, maka output selanjutnya akan di input sebanyak 100 kali

****} else if (i == 10) {
      System.out.println(Name);
  } else {
      System.out.println(Name);**

## 2 (HitungMundur.java)

Pada HitungMundur.java saya dengan menggunakan perulangan while dengan permulaan membuat variabel **i = 10**
lalu saya membuat kondisi while **i > 0**, jadi dengan i > 0 menandakan bahwa while tersebut memenuhi persyaratan untuk dieksekusi isinya.
selanjutnya saya memasukkan System.out.println untuk mencetak outputnya dan menambahkan "i--" untuk mengurangi satu persatu dari nilai variabel i (10)

**System.out.println("Anda hanya punya waktu " + i + " Detik");
   i--;**

gunakan perintah "Try" untuk blok yang digunakan untuk menempatkan kode-kode program Java yang memungkinkan terjadinya exception
selanjutnya saya memasukkan **Thread.sleep(1000);** untuk mengatur waktu jeda output per millis (Millisecond)

kemudian menggunakan perintah "if" sebagai pengingat waktu serta menggunakan "else if" sebagai pertanda waktu telah habis dengan ditambahkan keterangan tulisan

**if (i == 5){
       System.out.println("Waktu tinggal "+ i + " Detik Lagi!" );
   } else if (i == 0) {
       System.out.println("Waktu telah habis");
   }**

dan terakhir menambahkan **catch (InterruptedException e)** yang berfungsi Untuk memeriksa status interupsi thread tertentu terutama pada saat waktu jeda pada bagian **Thread.sleep(1000);**

## 3 (Zodiak.java)

Pada Zodiak.java saya menggunakan **Scanner input = new Scanner(System.in);** agar dapat menginput tulisan terutama pada saat memasukkan tanggal dan bulan

**System.out.print("Masukkan tanggal lahir (1-31): ");**
**int Hari = input.nextInt();**        
**System.out.print("Masukkan bulan lahir (1-12): ");**
**int Bulan = input.nextInt();**    

setelah itu saya menggunakan **public static String metodeZodiak(int Hari, int Bulan) {** untuk membuat metode dari penentuan zodiak

setelah membuat metode penentuan tanggal dan bulan dari 12 zodiak, kemudian saya memasukkan coding pada bagian **public static void main(String[] args) {** untuk melakukan scan pada bagian metode zodiak

**String zodiak = metodeZodiak(Hari, Bulan);
  System.out.println("Zodiak Anda adalah: " + zodiak);**

dan dibagian akhir dari **public static void main(String[] args) {**, saya memasukkan **input.close();** untuk mengakhiri input pada akhir kodingan saat di Run atau dijalankan.

  ## 4 (Array)

Pada Array.java saya membuat variabel String terlebih dahulu yang berisi perkenalan nama yang dipisah dengan koma

**String[] Nama = { "Nama ", "Saya ", "M. ", "Ihtifanul ", "Montaghib" };** Ini adalah deklarasi dan inisialisasi array string diberi nama

Selanjutnya saya menggunakan perulangan "for"

**for (int i = 0; i < Nama.length; i++) {** Ini adalah loop for yang digunakan untuk mengiterasi melalui setiap elemen dalam array nama jadi sebuah variable dibuat yaitu variable bernama "i" yang berisi 0, lalu "i" itu kurang dari panjang variable nama yang merupakan array, dan "i++" sebuah perintah untuk variable "i" bertambah satu persatu.

Dan Terakhir mencetak dengan menggunakan perintah

**System.out.print(Nama[i]);** Di dalam loop, pernyataan ini mencetak elemen array pada indeks ke-i ke layar.
