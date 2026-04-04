public class Novel extends Buku {
    int halaman;

    public Novel(String judul, int harga, int halaman) {
        super(judul, harga);
        this.halaman = halaman;
    }

    @Override
    void Output() {
        super.Output();
        System.out.println("Jumlah Halaman : " + this.halaman);
    }
}
