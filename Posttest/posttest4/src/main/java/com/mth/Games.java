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

    public void SetGenre(String genre) {
        this.genre.add(genre);
    }

    public void UnsetGenre(String genre) {
        this.genre.remove(genre);
    }

    public ArrayList<String> GetGenre() {
        return this.genre;
    }

    public String GetGenreString() {
        String text = "";
        for (int i = 0; i < genre.size(); i++) {
            text += genre.get(i) + (i < genre.size() - 1 ? ", " : "");
        }
        return text;
    }

    @Override
    public void TampilkanDetail() {
        super.TampilkanDetail();
        System.out.println("Genre: " + GetGenreString());
    }
}
