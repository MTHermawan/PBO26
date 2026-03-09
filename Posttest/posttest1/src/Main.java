import java.util.ArrayList;
import java.util.Scanner;

class Software {
    public String nama;
    public String tipe;
    public int harga;
    public String deskripsi;

    public Software(String nama, String tipe, int harga, String deskripsi) {
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }
} 

public class Main {
    private String _pilihan = "";
    private String _curMenu = "menu_utama";
    private String _temp = "";
    private int _tempInt = 0;
    private boolean _isExit = false;
    private Scanner input = new Scanner(System.in);

    public ArrayList<Software> dataSoftware = new ArrayList<>();
    public ArrayList<String> riwayatHalaman = new ArrayList<>();


    void main() {
        do {
            switch (_pilihan) {
                case "B", "b" -> {}
                default -> TambahHalaman();
            }
                
            _pilihan = "";
            
            switch (_curMenu) {
                case "menu_utama" -> MenuUtama();
                case "kelola_proyek" -> MenuKelolaSoftware();
                default -> { _curMenu = "menu_utama";
                    System.out.println("Halaman tidak ditemukan...");
                    input.nextLine();
                }
            }

            System.out.println("\n");
        } while (!_isExit);
    }

    private void MenuUtama()
    {
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

            case "M1", "m1" -> _curMenu = "menu_utama";
            case "1" -> UploadSoftware();
            case "2" -> _curMenu = "kelola_proyek";
            case "B", "b" -> Kembali();
            case "Q", "q" -> _isExit = true;
            default -> {
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
        }
    }

    private void UploadSoftware()
    {
        String _namaProyek = "";
        String _tipeProyek = "";
        int _hargaProyek = 0;
        String _deskripsiProyek = "";

        System.out.println("———————————————————————————————————————————");
        System.out.println("Upload Proyek");
        System.out.println();

        System.out.print("Nama Proyek: ");
        _namaProyek = input.nextLine();
        
        System.out.println();
        System.out.println("Daftar Tipe:");
        System.out.println("1. Games");
        System.out.println("2. Tools");
        System.out.println("3. Lainnya");
        do { 
            System.out.print("Masukkan pilihan tipe: ");
            _temp = input.nextLine();
            switch (_temp) {
                case "1" -> _tipeProyek = "Game";
                case "2" -> _tipeProyek = "Tools";
                case "3" -> _tipeProyek = "Lainnya";
                default -> { 
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        } while (_tipeProyek == "");
        
        System.out.println();
        do { 
            System.out.print("Harga: Rp");
            _tempInt = input.nextInt();
            input.nextLine();
            if (_tempInt < 0) System.out.println("Harga tidak boleh kurang dari 0");
        } while (_tempInt < 0);
        _hargaProyek = _tempInt;
        
        System.out.println();
        System.out.print("Deskripsi Proyek: ");
        _deskripsiProyek = input.nextLine();

        Software _proyekBaru = new Software(_namaProyek, _tipeProyek, _hargaProyek, _deskripsiProyek);
        dataSoftware.add(_proyekBaru);

        System.out.print("Berhasil mempublikasikan proyek!");
        input.nextLine();
    }

    private void MenuKelolaSoftware()
    {
        System.out.println("===========================================");
        System.out.println("M1 > Menu Utama");
        System.out.println("———————————————————————————————————————————");
        System.out.println("Kelola Proyek");
        System.out.println();
        if (dataSoftware.isEmpty())
        {
            System.out.println("Belum ada proyek yang di-upload.");
        }
        else
        {
            for (int i = 0; i < dataSoftware.size(); i++) {
                System.out.println(i+1 + ". " + dataSoftware.get(i).nama);
            }
            System.out.println("(Masukkan nama software untuk menu aksi.)");
        }
        System.out.println("———————————————————————————————————————————");
        System.out.println("B > Kembali");
        System.out.println("Q > Keluar");
        System.out.println("===========================================");

        System.out.print("Masukkan pilihan: ");
        _pilihan = input.nextLine();
        int indexDipilih = GetSoftwareIndex(_pilihan);

        if (indexDipilih >= 0 && indexDipilih < dataSoftware.size())
        { 
            System.out.println();
            System.out.println("Pilih tindakan untuk \"" + dataSoftware.get(indexDipilih).nama + "\": ");
            System.out.println("1. Edit");
            System.out.println("2. Hapus");
            System.out.print("Masukkan pilihan: ");
             
            _temp = input.nextLine();
            switch (_temp) {
                case "1":
                    EditSoftware(indexDipilih);
                    break;
                case "2":
                    HapusSoftware(indexDipilih);
                    break;
                default:
                {
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }  
            } 
        }
        else
        {
            switch (_pilihan) {
                case "M1", "m1" -> _curMenu = "menu_utama";
                case "B", "b" -> Kembali();
                case "Q", "q" -> _isExit = true;
                default -> 
                {
                    System.out.println("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        }
    }

    private int GetSoftwareIndex(String nama)
    {
        for (int i = 0; i < dataSoftware.size(); i++) {
            if (nama.equals(dataSoftware.get(i).nama)) {
                return i;
            }
        }
        return -1;
    }

    private void EditSoftware(int id)
    {
        String _namaProyek = "";
        String _tipeProyek = "";
        int _hargaProyek = 0;
        String _deskripsiProyek = "";

        System.out.println("———————————————————————————————————————————");
        System.out.println("Edit Proyek \"" + dataSoftware.get(id).nama + "\"");
        System.out.println();

        System.out.print("Nama Proyek (\"" + dataSoftware.get(id).nama + "\"): ");
        _temp = input.nextLine();
        _namaProyek = _temp.isBlank() ? dataSoftware.get(id).nama : _temp;
        
        System.out.println();
        System.out.println("Daftar Tipe:");
        System.out.println("1. Games");
        System.out.println("2. Tools");
        System.out.println("3. Lainnya");
        do { 
            System.out.print("Masukkan pilihan tipe (\"" + dataSoftware.get(id).tipe + "\"): ");
            _temp = input.nextLine();
            if (_temp.isBlank())
            {
                _tipeProyek = dataSoftware.get(id).tipe;
                break;
            }

            switch (_temp) {
                case "1" -> _tipeProyek = "Game";
                case "2" -> _tipeProyek = "Tools";
                case "3" -> _tipeProyek = "Lainnya";
                default -> { 
                    System.out.print("Pilihan tidak valid!");
                    input.nextLine();
                }
            }
        } while (_tipeProyek == "");
        
        System.out.println();
        do { 
            System.out.print("Harga (Rp" + dataSoftware.get(id).harga + "): Rp");
            _tempInt = input.nextInt();
            input.nextLine();
            if (_tempInt < 0) System.out.println("Harga tidak boleh kurang dari 0");
        } while (_tempInt < 0);
        _hargaProyek = _tempInt;
        
        System.out.println();
        System.out.println("(Deskripsi lama: \"" + dataSoftware.get(id).deskripsi + ")\"");
        System.out.print("Deskripsi Proyek: ");
        _temp = input.nextLine();
        _deskripsiProyek = _temp.isBlank() ? dataSoftware.get(id).deskripsi : _temp;

        dataSoftware.get(id).nama = _namaProyek;
        dataSoftware.get(id).tipe = _tipeProyek;
        dataSoftware.get(id).harga = _hargaProyek;
        dataSoftware.get(id).deskripsi = _deskripsiProyek;

        System.out.print("Berhasil memperbarui data proyek!");
        input.nextLine();
    }

    private void HapusSoftware(int id)
    {
        System.out.print("Apakah Anda yakin ingin menghapus \"" + dataSoftware.get(id).nama + "\"? (y/n): ");
        do { 
            _temp = input.nextLine();
            switch (_temp) {
                case "Y", "y":
                    System.out.print("Berhasil menghapus \"" + dataSoftware.get(id).nama + "\"!");
                    input.nextLine();
                    dataSoftware.remove(id);
                    return;
                case "N", "n":
                    System.out.print("Membatatalkan penghapusan!");
                    input.nextLine();
                    return;
                default:
                    System.out.print("Input tidak valid!");
                    input.nextLine();
            }
        } while (true);
    }

    private void TambahHalaman()
    {
        // System.out.println(_curMenu);
        if (riwayatHalaman.isEmpty() || riwayatHalaman.get(riwayatHalaman.size() - 1) != _curMenu) riwayatHalaman.add(_curMenu);
    }

    private void Kembali()
    {
        // System.out.println(riwayatHalaman.size());
        if (riwayatHalaman.size() > 1)
        {
            _curMenu = riwayatHalaman.get(riwayatHalaman.size() - 2);
            riwayatHalaman.removeLast();
        }
    }
}