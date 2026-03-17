package Tes;

public class Hewan {
    private String jenis;
    private int usia;

    // public Hewan(String jenis, int usia)
    // {
    //     this.jenis = jenis;
    //     this.usia = usia;
    // }

    public String GetJenis()
    {
        return this.jenis;
    }

    public void SetJenis(String jenis)
    {
        this.jenis = jenis;
    }

    public int GetUsia()
    {
        return this.usia;
    }

    public void SetUsia(int usia)
    {
        this.usia = usia;
    }
}
