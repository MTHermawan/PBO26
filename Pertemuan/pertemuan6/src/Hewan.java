public abstract class Hewan {
    abstract void Suara();

    static void main() {
        // Hewan hewan = new Hewan(); // Tidak bisa diinstantiate, karena abstract
        Kucing k = new Kucing();
        k.Suara();
    }
}
