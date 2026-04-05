package com.mth;

public class Tools extends Proyek {
    private String kategoriFungsi;

    public Tools(String nama, String klasifikasi, int harga, String kategori) {
        super(nama, klasifikasi, harga);
        this.kategoriFungsi = kategori;
    }

    public String getToolsKategori() {
        return kategoriFungsi;
    }

    public void setToolsKategori(String kategori) {
        this.kategoriFungsi = kategori;
    }
}