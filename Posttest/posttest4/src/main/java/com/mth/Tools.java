package com.mth;

public class Tools extends Proyek {

    private String kategoriFungsi;

    public Tools(String nama, String klasifikasi, int harga, String kategori) {
        super(nama, klasifikasi, harga);
        this.kategoriFungsi = kategori;
    }

    public String GetToolsKategori() {
        return kategoriFungsi;
    }

    public void SetToolsKategori(String kategori) {
        this.kategoriFungsi = kategori;
    }

    @Override
    public void TampilkanDetail() {
        super.TampilkanDetail();
        System.out.println("Kategori Tools: " + GetToolsKategori());
    }
}
