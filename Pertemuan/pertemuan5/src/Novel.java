public class Novel extends Buku{
    int halaman;
    Novel(String judul, int harga, int halaman){
        super(judul, harga);
        this.halaman=halaman;
    }

    @Override
    void Tampilkan() {
        super.Tampilkan();
        System.out.println("Halaman : "+this.halaman);
    }
}