package com.mth;

import java.util.ArrayList;

public class Games extends Proyek {

    private ArrayList<String> genre;

    public Games(String nama, String klasifikasi, int harga, ArrayList<String> genre) {
        super(nama, klasifikasi, harga);
        this.genre = genre;
    }

    public void SetGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public ArrayList<String> GetGenre() {
        return this.genre;
    }

    public String GetGenre(String separator) {
        String text = "";
        for (int i = 0; i < genre.size(); i++) {
            text += genre.get(i) + (i < genre.size() - 1 ? separator : "");
        }
        return text;
    }

    @Override
    public void TampilkanDetail() {
        super.TampilkanDetail();
        System.out.println("Genre: " + GetGenre(", "));
    }
}
