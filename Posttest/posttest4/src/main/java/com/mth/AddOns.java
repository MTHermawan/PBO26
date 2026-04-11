package com.mth;

public class AddOns extends Proyek {
    private String targetApp;

    public AddOns(String nama, String klasifikasi, int harga, String targetApps) {
        super(nama, klasifikasi, harga);
        this.targetApp = targetApps;
    }

    void SetTargetApps(String targetApp)
    {
        this.targetApp = targetApp;
    }

    String GetTargetApps()
    {
        return this.targetApp;
    }

    @Override
    public void TampilkanDetail() {
        super.TampilkanDetail();
        System.out.println("Add Ons untuk " + GetTargetApps());
    }
}