public class Novel extends Buku {
    int halaman;

    public Novel(String judul, int harga, int halaman) {
        super(judul, harga);
        this.halaman = halaman;
    }

    @Override
    public void Tampilkan() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Harga : " + this.harga);
        System.out.println("Halaman : " + this.halaman);
    }
}
