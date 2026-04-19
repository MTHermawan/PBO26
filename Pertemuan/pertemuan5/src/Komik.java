public class Komik extends Buku {
    String genre;
    Komik(String judul, int harga, String genre){
        super(judul,harga);
        this.genre=genre;
    }

    @Override
    void Tampilkan() {
        super.Tampilkan();
        System.out.println("Genre : "+this.genre);
    }
}