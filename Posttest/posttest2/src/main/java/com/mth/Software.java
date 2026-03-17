package com.mth;

class Software {
    private String nama;
    private String tipe;
    private int harga;
    private String deskripsi;

    public Software(String nama, String tipe, int harga, String deskripsi) {
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public Software(String nama, String tipe, String deskripsi) {
        this(nama, tipe, 0, deskripsi);
    }

    public Software(String nama, String tipe) {
        this(nama, tipe, 0, "");
    }

    void SetNama(String nama) {
        this.nama = nama;
    }
    
    String GetNama() {
        return nama;
    }

    void SetTipe(String tipe) {
        this.tipe = tipe;
    }
    
    String GetTipe() {
        return tipe;
    }

    void SetHarga(int harga) {
        this.harga = harga;
    }
    
    int GetHarga() {
        return harga;
    }

    void SetDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    String GetDeskripsi() {
        return deskripsi;
    }
}
