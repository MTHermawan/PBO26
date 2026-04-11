package com.mth;

public class Proyek {

    private String nama;
    private String klasifikasi;
    private int harga;

    public Proyek(String nama, String klasifikasi, int harga) {
        this.nama = nama;
        this.klasifikasi = klasifikasi;
        this.harga = harga;
    }

    public Proyek(String nama, String klasifikasi) {
        this(nama, klasifikasi, 0);
    }

    public void SetNama(String nama) {
        this.nama = nama;
    }

    public String GetNama() {
        return nama;
    }

    public void SetKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public String GetKlasifikasi() {
        return klasifikasi;
    }

    public void SetHarga(int harga) {
        this.harga = harga;
    }

    public int GetHarga() {
        return harga;
    }

    public void TampilkanDetail() {
        System.out.println("Klasifikasi: " + GetKlasifikasi());
        System.out.println("Harga: " + GetHarga());
    }
}
