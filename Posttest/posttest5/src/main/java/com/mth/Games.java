package com.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Games extends Proyek {

    private ArrayList<String> genre = new ArrayList<String>();

    private Games(String nama, String klasifikasi, int harga, ArrayList<String> genre) {
        super(nama, klasifikasi, harga);
        this.genre = genre;
    }

    public Games(String nama, String klasifikasi, int harga) {
        super(nama, klasifikasi, harga);
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
        System.out.println("Klasifikasi: " + GetKlasifikasi());
        System.out.println("Harga: " + GetHarga());
        System.out.println("Genre: " + GetGenre(", "));
    }

    @Override
    public boolean InputAtributSpesial() {
        String _temp = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Daftar Genre Game:");
            System.out.println("1. Adventure " + (this.genre.contains("Adventure") ? "(x)" : ""));
            System.out.println("2. Action " + (this.genre.contains("Action") ? "(x)" : ""));
            System.out.println("3. RPG " + (this.genre.contains("RPG") ? "(x)" : ""));
            System.out.println("4. Shooter " + (this.genre.contains("Shooter") ? "(x)" : ""));
            System.out.println("0. (Selesaikan Pilihan)");
            System.out.print("Masukkan pilihan klasifikasi: ");
            _temp = input.nextLine();

            String _choiceName = "";
            switch (_temp) {
                case "0" -> {
                    break;
                }
                case "1" -> {
                    _choiceName = "Adventure";
                }
                case "2" -> {
                    _choiceName = "Action";
                }
                case "3" -> {
                    _choiceName = "RPG";
                }
                case "4" -> {
                    _choiceName = "Shooter";
                }
                default -> {
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
            }

            if (!_choiceName.isBlank()) {
                if (this.genre.contains(_choiceName)) {
                    this.genre.remove(_choiceName);
                } else {
                    this.genre.add(_choiceName);
                }
            }
        } while (!"0".equals(_temp));

        return true;
    }
}
