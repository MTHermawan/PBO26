
import java.util.ArrayList;

class Hewan {
    private String jenis;
    private int usia;

    public Hewan(String jenis, int usia) {
        this.jenis = jenis;
        this.usia = usia;
    }

    public void Info() {
        System.out.println("Hewan " + jenis + " berusia " + usia);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> daftarLaptop = new ArrayList<>();
        
        Laptop laptopSatu = new Laptop("Acer Nitro 5", 1500000);
        laptopSatu.TurnOn();
        
        Hewan kucing = new Hewan("Kucing", 5);
        kucing.Info();

        daftarLaptop.addLast(laptopSatu);
        // Laptop laptopDua = new Laptop();
        // laptopDua.TurnOn();
    }
}