public class Komik extends Buku {
    String genre;

    public Komik(String judul, int harga, String genre) {
        super(judul, harga);
        this.genre = genre;
    }

    @Override
    public void Tampilkan() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Harga : " + this.harga);
        System.out.println("Genre : " + this.genre);
    }
}
