
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Buku implements Contoh {
    String judul;
    int harga;

    public Buku(String judul, int harga) {
        this.judul = judul;
        this.harga = harga;
    }
    abstract public void Tampilkan();

    static void main(String[] args)
    {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        
        do { 
            System.out.println("1. Add Komik");
            System.out.println("2. Add Novel");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan Komik");
            System.out.println("5. Tampilkan Novel");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1 -> AddKomik(daftarBuku, input);
                case 2 -> AddNovel(daftarBuku, input);
                case 3 -> Show(daftarBuku);
                case 4 -> Show(daftarBuku, "Komik");
                case 5 -> Show(daftarBuku, "Novel");
            }
        } while (pilihan != 0);
    }

    static void AddKomik(ArrayList<Buku> daftarBuku, Scanner input)
    {
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

    static void AddNovel(ArrayList<Buku> daftarBuku, Scanner input)
    {
        System.out.print("Masukkan Judul : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Harga : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Halaman : ");
        int halaman = input.nextInt();
        input.nextLine();
        Novel n = new Novel(judul, harga, halaman);
        daftarBuku.add(n);
    }

    static void Show(ArrayList<Buku> daftarBuku)
    {
        if (daftarBuku.isEmpty())
        {
            System.out.println("Kosong");
            return;
        }
        for (Buku b : daftarBuku) {
            b.Tampilkan();
        }
    }

    static void Show(ArrayList<Buku> daftarBuku, String jenis)
    {
        if (daftarBuku.isEmpty())
        {
            System.out.println("Kosong");
        }
        for (Buku b : daftarBuku) {
            if (jenis.equalsIgnoreCase("komik") && b instanceof Komik)
            {
                b.Tampilkan();
            }
            else if (jenis.equalsIgnoreCase("novel") && b instanceof Novel)
            {
                b.Tampilkan();
            }
        }
    }
}
