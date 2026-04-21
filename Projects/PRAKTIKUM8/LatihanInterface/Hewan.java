package Projects.PRAKTIKUM8.LatihanInterface;

public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama Hewan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur Hewan: " + this.umur);
    }
}
