public class Komik extends Buku {
    String genre;

    Komik(String judul, int harga, String genre) {
        super(judul, harga);
        this.genre=genre;
    }

    @Override
    void Output() {
        super.Output();
        System.out.println("Genre : " + this.genre);
    }    
}
