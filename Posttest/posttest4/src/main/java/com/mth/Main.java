package com.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private String _pilihan = "";
    private String _curMenu = "menu_utama";
    private String _temp = "";
    private int _tempInt = 0;
    private boolean _isExit = false;
    private Scanner input = new Scanner(System.in);

    public ArrayList<Proyek> dataProyek = new ArrayList<>();
    public ArrayList<String> riwayatHalaman = new ArrayList<>();

    void main() {
        do {
            switch (_pilihan) {
                case "B", "b" -> {
                }
                default ->
                    TambahHalaman();
            }

            _pilihan = "";

            switch (_curMenu) {
                case "menu_utama" ->
                    MenuUtama();
                case "kelola_proyek" ->
                    MenuKelolaProyek();
                default -> {
                    _curMenu = "menu_utama";
                    System.out.println("Halaman tidak ditemukan...");
                    input.nextLine();
                }
            }

            System.out.println("\n");
        } while (!_isExit);
    }

    private void MenuUtama() {
        System.out.println("===========================================");
        System.out.println("> Menu Utama <");
        System.out.println("———————————————————————————————————————————");
        System.out.println("Menu Utama");
        System.out.println();
        System.out.println("1. Upload Proyek");
        System.out.println("2. Kelola Proyek");
        System.out.println("———————————————————————————————————————————");
        System.out.println("B > Kembali");
        System.out.println("Q > Keluar");
        System.out.println("===========================================");

        System.out.print("Masukkan pilihan: ");
        _pilihan = input.nextLine();
        switch (_pilihan) {
            case "M1", "m1" ->
                _curMenu = "menu_utama";
            case "1" ->
                UploadProyek();
            case "2" ->
                _curMenu = "kelola_proyek";
            case "B", "b" ->
                Kembali();
            case "Q", "q" ->
                _isExit = true;
            default -> {
                System.out.print("Pilihan tidak valid!");
                input.nextLine();
            }
        }
    }

    private void UploadProyek() {
        String _namaProyek = "";
        String _klasifikasiProyek = "";
        int _hargaProyek = 0;

        System.out.println("———————————————————————————————————————————");
        System.out.println("Upload Proyek");
        System.out.println();

        boolean namaValid;
        do {
            namaValid = true;
            System.out.print("Nama Proyek: ");
            _temp = input.nextLine();
            if (_temp.isBlank()) {
                System.out.println("Nama tidak boleh kosong!");
            }

            for (Proyek findProyek : dataProyek) {
                if (findProyek.GetNama().equals(_temp)) {
                    namaValid = false;
                }
            }
            if (!namaValid) {
                System.out.println("Nama sudah digunakan!");
            }
        } while (!namaValid);
        _namaProyek = _temp;

        System.out.println();
        System.out.println("Daftar Klasifikasi:");
        System.out.println("1. Games");
        System.out.println("2. Tools");
        System.out.println("3. Add Ons");
        do {
            System.out.print("Masukkan pilihan klasifikasi: ");
            _temp = input.nextLine();
            switch (_temp) {
                case "1" ->
                    _klasifikasiProyek = "Games";
                case "2" ->
                    _klasifikasiProyek = "Tools";
                case "3" ->
                    _klasifikasiProyek = "Add Ons";
                default -> {
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        } while (_klasifikasiProyek.isBlank());

        System.out.println();
        do {
            System.out.print("Harga: Rp");
            _tempInt = input.nextInt();
            input.nextLine();
            if (_tempInt < 0) {
                System.out.println("Harga tidak boleh kurang dari 0");
            }
        } while (_tempInt < 0);
        _hargaProyek = _tempInt;

        switch (_klasifikasiProyek) {
            case "Games":
                ArrayList<String> _genre = new ArrayList<>();

                do {
                    System.out.println();
                    System.out.println("Daftar Genre Game:");
                    System.out.println("1. Adventure " + (_genre.contains("Adventure") ? "(x)" : ""));
                    System.out.println("2. Action " + (_genre.contains("Action") ? "(x)" : ""));
                    System.out.println("3. RPG " + (_genre.contains("RPG") ? "(x)" : ""));
                    System.out.println("4. Shooter " + (_genre.contains("Shooter") ? "(x)" : ""));
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
                        if (_genre.contains(_choiceName)) {
                            _genre.remove(_choiceName);
                        } else {
                            _genre.add(_choiceName);
                        }
                    }
                } while (!"0".equals(_temp));

                Games g = new Games(_namaProyek, _klasifikasiProyek, _hargaProyek, _genre);
                dataProyek.add(g);
                break;
            case "Add Ons":
                System.out.print("Target Software: ");
                String _targetApps = input.nextLine();

                AddOns ao = new AddOns(_namaProyek, _klasifikasiProyek, _hargaProyek, _targetApps);
                dataProyek.add(ao);
                break;
            case "Tools":
                System.out.print("Kategori Tools: ");
                String _kategoriFungsi = input.nextLine();

                Tools t = new Tools(_namaProyek, _klasifikasiProyek, _hargaProyek, _kategoriFungsi);
                dataProyek.add(t);
                break;
        }

        System.out.print("Berhasil mempublikasikan proyek!");
        input.nextLine();
    }

    private void MenuKelolaProyek() {
        System.out.println("===========================================");
        System.out.println("M1 > Menu Utama");
        System.out.println("———————————————————————————————————————————");
        System.out.println("Kelola Proyek");
        System.out.println();
        if (dataProyek.isEmpty()) {
            System.out.println("Belum ada proyek yang di-upload.");
        } else {
            for (int i = 0; i < dataProyek.size(); i++) {
                System.out.println(i + 1 + ". " + dataProyek.get(i).GetNama());
            }
            System.out.println("(Masukkan nama proyek untuk menu aksi.)");
        }
        System.out.println("———————————————————————————————————————————");
        System.out.println("B > Kembali");
        System.out.println("Q > Keluar");
        System.out.println("===========================================");

        System.out.print("Masukkan pilihan: ");
        _pilihan = input.nextLine();
        int indexDipilih = GetProyekIndex(_pilihan);

        if (indexDipilih >= 0 && indexDipilih < dataProyek.size()) {
            System.out.println();
            System.out.println("Pilih tindakan untuk \"" + dataProyek.get(indexDipilih).GetNama() + "\": ");
            System.out.println("1. Lihat");
            System.out.println("2. Edit");
            System.out.println("3. Hapus");
            System.out.print("Masukkan pilihan: ");

            _temp = input.nextLine();
            switch (_temp) {
                case "1" ->
                    LihatDetailProyek(indexDipilih);
                case "2" ->
                    EditProyek(indexDipilih);
                case "3" ->
                    HapusProyek(indexDipilih);
                default -> {
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        } else {
            switch (_pilihan) {
                case "M1", "m1" ->
                    _curMenu = "menu_utama";
                case "B", "b" ->
                    Kembali();
                case "Q", "q" ->
                    _isExit = true;
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        }
    }

    private int GetProyekIndex(String nama) {
        for (int i = 0; i < dataProyek.size(); i++) {
            // System.out.println(dataProyek.get(i).GetNama());
            if (nama.equals(dataProyek.get(i).GetNama())) {
                return i;
            }
        }
        return -1;
    }

    private void LihatDetailProyek(int id) {
        Proyek p = dataProyek.get(id);

        System.out.println("===========================================");
        System.out.println(p.GetNama());
        System.out.println("———————————————————————————————————————————");
        
        p.TampilkanDetail();

        System.out.println("———————————————————————————————————————————");
        System.out.println("Tekan tombol apa pun untuk kembali...");
        System.out.println("===========================================");
        input.nextLine();
    }

    private void EditProyek(int id) {
        String _namaProyek = "";
        String _klasifikasiProyek = "";
        int _hargaProyek = 0;

        Proyek p = dataProyek.get(id);

        System.out.println("———————————————————————————————————————————");
        System.out.println("Edit Proyek \"" + p.GetNama() + "\"");
        System.out.println();

        boolean namaValid;
        do {
            namaValid = true;
            System.out.print("Nama Proyek (\"" + p.GetNama() + "\"): ");
            _temp = input.nextLine();
            if (_temp.isBlank()) {
                System.out.println("Nama tidak boleh kosong!");
            }

            for (Proyek findProyek : dataProyek) {
                if (findProyek.GetNama().equals(p.GetNama())) continue;
                
                if (findProyek.GetNama().equals(_temp)) {
                    namaValid = false;
                }
            }
            if (!namaValid) {
                System.out.println("Nama sudah digunakan!");
            }
        } while (!namaValid);
        _namaProyek = _temp.isBlank() ? p.GetNama() : _temp;

        System.out.println();
        do {
            System.out.print("Harga (Rp" + p.GetHarga() + "): Rp");
            _tempInt = input.nextInt();
            input.nextLine();
            if (_tempInt < 0) {
                System.out.println("Harga tidak boleh kurang dari 0");
            }
        } while (_tempInt < 0);
        _hargaProyek = _tempInt;

        if (p instanceof Games g) {
            ArrayList<String> _genre = g.GetGenre();

            do {
                System.out.println();
                System.out.println("Daftar Genre Game:");
                System.out.println("1. Adventure " + (_genre.contains("Adventure") ? "(x)" : ""));
                System.out.println("2. Action " + (_genre.contains("Action") ? "(x)" : ""));
                System.out.println("3. RPG " + (_genre.contains("RPG") ? "(x)" : ""));
                System.out.println("4. Shooter " + (_genre.contains("Shooter") ? "(x)" : ""));
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
                        if (_genre.contains(_choiceName)) {
                            _genre.remove(_choiceName);
                        } else {
                            _genre.add(_choiceName);
                        }
                    }
            } while (!"0".equals(_temp));

            g.SetGenre(_genre);
        } else if (p instanceof AddOns ao) {
            System.out.print("Target Software (\"" + ao.GetTargetApps() + "\"): ");
            _temp = input.nextLine();
            String _targetSoftware = _temp.isBlank() ? ao.GetTargetApps() : _temp;

            ao.SetTargetApps(_targetSoftware);
        } else if (p instanceof Tools t) {
            System.out.print("Kategori Tools (\"" + t.GetToolsKategori() + "\"): ");
            _temp = input.nextLine();
            String _kategoriFungsi = _temp.isBlank() ? t.GetToolsKategori() : _temp;

            t.SetToolsKategori(_kategoriFungsi);
        }

        p.SetNama(_namaProyek);
        p.SetKlasifikasi(_klasifikasiProyek);
        p.SetHarga(_hargaProyek);

        System.out.print("Berhasil memperbarui data proyek!");
        input.nextLine();
    }

    private void HapusProyek(int id) {
        Proyek p = dataProyek.get(id);

        System.out.print("Apakah Anda yakin ingin menghapus \"" + p.GetNama() + "\"? (y/n): ");
        do {
            _temp = input.nextLine();
            switch (_temp) {
                case "Y", "y" -> {
                    System.out.print("Berhasil menghapus \"" + p.GetNama() + "\"!");
                    input.nextLine();
                    dataProyek.remove(id);
                    return;
                }
                case "N", "n" -> {
                    System.out.print("Membatatalkan penghapusan!");
                    input.nextLine();
                    return;
                }
                default -> {
                    System.out.print("Input tidak valid!");
                    input.nextLine();
                }
            }
        } while (true);
    }

    private void TambahHalaman() {
        // System.out.println(_curMenu);
        if (riwayatHalaman.isEmpty() || riwayatHalaman.get(riwayatHalaman.size() - 1) != _curMenu) {
            riwayatHalaman.add(_curMenu);
        }
    }

    private void Kembali() {
        // System.out.println(riwayatHalaman.size());
        if (riwayatHalaman.size() > 1) {
            _curMenu = riwayatHalaman.get(riwayatHalaman.size() - 2);
            riwayatHalaman.removeLast();
        }
    }
}
