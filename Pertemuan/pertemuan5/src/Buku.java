import java.util.*;
import java.io.*;
public class Buku {
    String judul;
    int harga;
    Buku(String judul, int harga){
        this.judul=judul;
        this.harga=harga;
    }
    void Tampilkan(){
        System.out.println("Judul : "+this.judul);
        System.out.println("Harga : "+this.harga);
    }

    static void main() {
        ArrayList<Buku>DaftarBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("1.Add Komik");
            System.out.println("2.Add Novel");
            System.out.println("3.Tampilkan");
            System.out.println("4.Tampilkan komik");
            System.out.println("5.Tampilkan Novel");
            System.out.print("Masukkan pilihan anda : ");
            pilihan= input.nextInt();
            input.nextLine();
            switch (pilihan){
                case 1->AddKomik(DaftarBuku,input);
                case 2->AddNovel(DaftarBuku,input);
                case 3->Show(DaftarBuku);
                case 4->Show(DaftarBuku,"komik");
                case 5->Show(DaftarBuku,"novel");
            }
        }while(pilihan !=0);
    }
    static void AddKomik(ArrayList<Buku>DaftarBuku, Scanner input){
        System.out.print("Masukkan judul : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Harga : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Genre : ");
        String genre = input.nextLine();
        Komik k = new Komik(judul,harga,genre);
        DaftarBuku.add(k);
    }
    static void AddNovel(ArrayList<Buku>DaftarBuku, Scanner input){
        System.out.print("Masukkan judul : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Harga : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Halaman : ");
        int halaman = input.nextInt();
        input.nextLine();
        Novel n = new Novel(judul,harga,halaman);
        DaftarBuku.add(n);
    }
    static void Show(ArrayList<Buku>DaftarBuku){
        for(Buku b : DaftarBuku){
            b.Tampilkan();
        }
    }
    static void Show(ArrayList<Buku>DaftarBuku,String jenis){
        for(Buku b : DaftarBuku){
            if(jenis.equalsIgnoreCase("komik") && b instanceof Komik){
                b.Tampilkan();
            }
            else if(jenis.equalsIgnoreCase("novel") && b instanceof Novel){
                b.Tampilkan();
            }
        }
    }
}