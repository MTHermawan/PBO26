public class BangunDatar {
    double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    double hitungLuas(double jari, boolean isLingkaran) {
        return 3.14 * jari * jari;
    }

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        double luasPersegi = bd.hitungLuas(4);
        double luasPersegiPanjang = bd.hitungLuas(5, 3);
        double luasLingkaran = bd.hitungLuas(7,true);

        System.out.println("Luas Persegi : " + luasPersegi);
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
