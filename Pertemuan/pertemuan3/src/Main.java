import java.util.ArrayList;
import java.util.Scanner;

import Tes.Hewan;

public class Main {
    void main()
    {
        // Hewan kucing = new Hewan("A", 2);
        // kucing.SetJenis("Anggora");
        // System.out.println("Jenis : " + kucing.GetJenis());   

        ArrayList<Hewan>daftarHewan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("1. Tambah");
            System.out.println("2. Tampilkan");
            System.out.println("Masukkan pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> Tambah(daftarHewan, input);
                case 2 -> Tampil(daftarHewan);
            }
        } while (true);
    }

    void Tambah(ArrayList<Hewan> daftarHewan, Scanner input)
    {
        Hewan h = new Hewan();
        System.out.print("Masukkan jenis : ");
        h.SetJenis(input.nextLine());
        System.out.print("Masukkan usia : ");
        h.SetUsia(input.nextInt());
        input.nextLine();
        daftarHewan.add(h);
    }

    void Tampil(ArrayList<Hewan> daftarHewan)
    {
        Hewan h = new Hewan();
        for (Hewan hewan : daftarHewan) {
            System.out.println();
            System.out.println("Jenis : " + hewan.GetJenis());
            System.out.println("Usia : " + hewan.GetUsia());
        }
    }
}
