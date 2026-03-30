package JaketPraktikum;

class Transaksi {
    private final int HARGA_A = 100000;
    private final int HARGA_B = 125000;
    private final int HARGA_C = 175000;
    private int jumlahA;
    private int jumlahB;
    private int jumlahC;

    public Transaksi(int jumlahA, int jumlahB, int jumlahC) {
        this.jumlahA = jumlahA;
        this.jumlahB = jumlahB;
        this.jumlahC = jumlahC;
    }

    public long totalA() {
        if (jumlahA > 100)
            return 95000L * jumlahA;
        return (long) HARGA_A * jumlahA;
    }

    public long totalB() {
        if (jumlahB > 100)
            return 120000L * jumlahB;
        return (long) HARGA_B * jumlahB;
    }

    public long totalC() {
        if (jumlahC > 100)
            return 160000L * jumlahC;
        return (long) HARGA_C * jumlahC;
    }

    public void totalHarga() {
        System.out.println();
        System.out.println("== Total Harga ==");
        System.out.println("Total Jaket A: Rp " + totalA());
        System.out.println("Total Jaket B: Rp " + totalB());
        System.out.println("Total Jaket C: Rp " + totalC());
        System.out.println("-----------------------------------");
        System.out.println("Total Bayar: Rp " + (totalA() + totalB() + totalC()));
    }
}
