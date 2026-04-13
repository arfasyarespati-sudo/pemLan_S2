package Projects.PRAKTIKUM7;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat; // harga x berat
    }

    @Override
    public String toString() {
        return "[Kue Pesanan] " + super.toString() + "\n" +
                " -> Berat: " + berat + " kg" + "\n" +
                " -> Total Harga: Rp" + hitungHarga() + "\n";
    }
}