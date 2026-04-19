package com.mth;

import java.util.Scanner;

public class AddOns extends Proyek {
    private String targetApp = "";

    private AddOns(String nama, String klasifikasi, int harga, String targetApps) {
        super(nama, klasifikasi, harga);
        this.targetApp = targetApps;
    }

    public AddOns(String nama, String klasifikasi, int harga) {
        super(nama, klasifikasi, harga);
    }

    void SetTargetApps(String targetApp) {
        this.targetApp = targetApp;
    }

    String GetTargetApps() {
        return this.targetApp;
    }

    @Override
    public void TampilkanDetail() {
        System.out.println("Klasifikasi: " + GetKlasifikasi());
        System.out.println("Harga: " + GetHarga());
        System.out.println("Add Ons untuk " + GetTargetApps());
    }

    @Override
    public boolean InputAtributSpesial() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Target Software: ");
        this.targetApp = input.nextLine();

        return true;
    }
}