package com.mth;

import java.util.Scanner;

public class Tools extends Proyek {

    private String kategoriFungsi = "";

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
        System.out.println("Klasifikasi: " + GetKlasifikasi());
        System.out.println("Harga: " + GetHarga());
        System.out.println("Kategori Tools: " + GetToolsKategori());
    }

    @Override
    public boolean InputAtributSpesial() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kategori Tools: ");
        this.kategoriFungsi = input.nextLine();

        return true;
    }
}
