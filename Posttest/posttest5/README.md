## Abstraction dan Interface
Penerapan interface di sini dilakukan pada class baru bernama IProyek, dengan dua method, yaitu `TampilkanDetail()` dan `InputAtributSpesial()`. Yang, mana setiap Proyek akan memiliki perilaku khusus pada setiap detail dan input atributnya.

![definisi_interface](Assets/10_definisi_interface.png)

Di sini, method interface dari `TampilkanDetail()` menjadi method abstract di proyek, yang mana ketika TampilkanDetail dipanggil sekali, akan memiliki bentuk yang berbeda-beda. 

![implementasi_interface_proyek](Assets/11_implementasi_interface_proyek.png)
![tampilkan_detail](Assets/12_tampilkan_detail.png)

Di sini, method interface dari `InputAtributSpesial()` diimplementasikan pada setiap subclass, sehingga input atribut spesial dapat disesuaikan sesuai kebutuhan subclass. 

![pemanggilan_inputatributclass](Assets/13_pemanggilan_inputatributclass.png)
![inputatributclass_tools](Assets/15_inputatributclass_tools.png)

### Polymorphysm Statis (Overloading)

Penerapan overloading di sini digunakan untuk mengambil data genre untuk diload atau string yang menampilkan seluruh genre. 

![penerapan_overriding](Assets/15_penerapan_overloading.png)

Ketika method dipanggil tanpa argumen, maka method merupakan sebuah array string.

![penerapan_overriding](Assets/16_pemanggilan_overloading_1.png)

Sementara, ketika method dipanggil dengan satu argumen string, maka method menampilkan seluruh string yang terpisah berdasarkan argumen pertama.

![penerapan_overriding](Assets/17_pemanggilan_overloading_2.png)

## Deskripsi Program

Program ini bertujuan untuk para software engineer untuk mempublikasikan karya softwarenya dengan gratis atau pun berbayar. Di dalam program ini terdapat CRUD berupa Upload Proyek hingga memanajemen proyek yang dapat diedit dan dihapus. 

## Fitur dan Tampilan Program
### Menu Utama

Di halaman ini, pengguna dapat memilih untuk melakukan upload atau mengelola proyek yang sudah pernah di-upload sebelumnya.

![menu_utama](Assets/1_menu_utama.png)

### Upload Proyek

Pada pilihan `Upload Proyek,` pengguna akan diarahkan ke dalam pertanyaan-pertanyaan mengenai data-data proyek yang akan dipublikasikannya. Jika pengguna berhasil melakukannya dengan benar, maka program akan memberikan informasi berhasil.

![upload_software](Assets/2_upload_software.png)

### Kelola Proyek

Dengan proyek software yang sudah pernah dipublikasikan oleh pengguna sebelumnya, pengguna dapat mengelolanya kembali untuk diedit atau dihapus dengan memasukkan nama proyeknya.

![kelola_proyek](Assets/3_kelola_proyek.png)

### Aksi Kelola

Memasukkan nama software akan mengarahkan pengguna kepada dua pilihan berupa `Edit` dan `Hapus.`

![aksi_kelola](Assets/4_aksi_kelola.png)

### Edit Proyek

Dalam pilihan `Lihat,` pengguna akan dapat melihat detail lengkap mengenai informasi proyek yang dipilihnya. 

![edit_proyek](Assets/5_lihat_proyek.png)

### Edit Proyek

Dalam pilihan `Edit,` pengguna akan diarahkan ke pertanyaan seperti pada saat melakukan `Upload Proyek.` Pengguna dapat mengganti data-data dalam proyeknya dan program juga akan menampilkan versi sebelumnya. 

![edit_proyek](Assets/6_edit_proyek.png)

Di bawah ini adalah tampilan kelola proyek setelah proyek software diedit.

![kelola_proyek_postedit](Assets/7_kelola_proyek_postedit.png)

### Hapus Proyek

Pada pilihan `Hapus` pada kelola proyek akan menghapus proyek yang sudah pernah dipublikasikan. Dalam proses penghapusan, pengguna diberikan pertanyaan konfirmasi bahwa benar-benar ingin menghapusnya. 

![hapus_proyek](Assets/8_hapus_proyek.png)

Di bawah ini adalah tampilan kelola proyek setelah proyek software dihapus.

![kelola_proyek_postdelete](Assets/9_kelola_proyek_postdelete.png)