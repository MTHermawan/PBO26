
import java.util.ArrayList;
import java.util.Scanner;

public class Buku {
    String judul;
    int harga;

    Buku(String judul, int harga)
    {
        this.judul = judul;
        this.harga = harga;
    }

    void Output() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Harga : " + this.harga);
    }

    static void main() {
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do { 
            System.out.println("1. Tambah Komik");
            System.out.println("2. Tambah Novel");
            System.out.println("3. Tampilkan");
            System.out.print("Masukkan pilihan Anda: ");
            
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1 -> AddKomik(daftarBuku, input);
                case 2 -> AddNovel(daftarBuku, input);
                case 3 -> Show(daftarBuku);
            }
        } while (pilihan!=0);
    }

    static void AddKomik(ArrayList<Buku> daftarBuku, Scanner input) {
        System.out.print("Masukkan Judul : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Harga : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Genre : ");
        String genre = input.nextLine();
        Komik k = new Komik(judul, harga, genre);
        daftarBuku.add(k);
    }
    
    static void AddNovel(ArrayList<Buku> daftarBuku, Scanner input) {
        System.out.print("Masukkan judul : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Harga : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Jumlah Halaman : ");
        int halaman = input.nextInt();
        input.nextLine();
        Novel n = new Novel(judul, harga, halaman);
        daftarBuku.add(n);
    }

    static void Show(ArrayList<Buku> daftarBuku) {
        int i = 1;
        for (Buku b : daftarBuku) {
            System.out.println(i+".");
            b.Output();
            i++;
        }

        // for (Buku b : daftarBuku) {
        //     if (b instanceof Komik)
        //     {
        //         b.Output();
        //     }
        //     else if (b instanceof Novel)
        //     {
        //         b.Output();
        //     }
        // }
    }

    static void Hapus(ArrayList<Buku> daftarBuku, Scanner input) {
        int tipe;
        System.out.println("1. Hapus Komik");
        System.out.println("2. Hapus Novel");
        System.out.print("Masukkan pilihan Anda : ");
        tipe = input.nextInt();
        input.nextLine();
        ArrayList<Integer>jenisBuku = new ArrayList<>();

        int nomor = 0;
        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku b = daftarBuku.get(i);
            if (tipe == 1 && b instanceof Komik) {
                System.out.println(nomor);
                b.Output();
                jenisBuku.add(i);
                nomor++;
            }
            else if (tipe == 2 && b instanceof Novel) {
                System.out.println(nomor);
                b.Output();
                jenisBuku.add(i);
                nomor++;
            }
        }
        System.out.println("Masukkan index yang mau dihapus : ");
        int index = input.nextInt();
        input.nextLine();
    }
}
