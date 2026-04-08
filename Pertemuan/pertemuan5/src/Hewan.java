
class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }

    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        Hewan h3 = new Sapi();

        h1.suara();
        h2.suara();
        h3.suara();
    }
}
