import java.util.*;

public class Hewan {
    String jenis;
    int usia;

    //    Hewan(){
//        this.jenis = "kucing";
//        this.usia  = 2;
//    }
    Hewan(String jenis, int usia) {
        this.jenis = jenis;
        this.usia = usia;
    }

    // void Suara() {
    //     System.out.println("Hewan ini mengeluarkan suara");
    // }
}

void main() {
//    Hewan hewan = new Hewan();
//    hewan.Suara();
//    Hewan Kucing = new Hewan();
//    System.out.println("Jenis : "+Kucing.jenis);
//    System.out.println("Usia : "+Kucing.usia);
//    Hewan Anjing = new Hewan("Anjing",3);
//    System.out.println("Jenis : "+Anjing.jenis);
//    System.out.println("Usia : "+Anjing.usia);
//    Hewan Monyet= new Hewan();
//    Monyet.jenis="Monyet";
//    Monyet.usia=5;
//    System.out.println("Jenis : "+Monyet.jenis);
//    System.out.println("Usia : "+Monyet.usia);
    ArrayList<Hewan> DaftarHewan = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int pilihan;
    do {
        System.out.println("1. Tambah");
        System.out.println("2. Tampil");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1 -> Tambah(DaftarHewan, input);
            case 2 -> Tampil(DaftarHewan);
        }
    } while (pilihan != 0);
    System.out.println("Selesai");
}

void Tambah(ArrayList<Hewan> DaftarHewan, Scanner input) {
    String jenis;
    int usia;
    System.out.print("Masukkan jenis : ");
    jenis = input.nextLine();
    System.out.print("Masukkan usia : ");
    usia = input.nextInt();
    input.nextLine();
    Hewan hewan = new Hewan(jenis, usia);
    DaftarHewan.add(hewan);
}

void Tampil(ArrayList<Hewan> DaftarHewan) {
    if (DaftarHewan.isEmpty()) {
        System.out.println("Kosonggg");
    } else {
        for (Hewan hewan : DaftarHewan) {
            System.out.println("Jenis : " + hewan.jenis);
            System.out.println("usia : " + hewan.usia);
        }
    }
}