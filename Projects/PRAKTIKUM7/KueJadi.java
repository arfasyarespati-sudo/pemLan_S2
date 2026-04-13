package Projects.PRAKTIKUM7;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2; // harga x jumlah x 2
    }

    @Override
    public String toString() {
        return "[Kue Jadi] " + super.toString() + "\n" +
                " -> Jumlah: " + jumlah + " pcs" + "\n" +
                " -> Total Harga: Rp" + hitungHarga() + "\n";

    }
}
