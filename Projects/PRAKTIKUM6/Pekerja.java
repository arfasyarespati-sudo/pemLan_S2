package Projects.PRAKTIKUM6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak,
            String nama, boolean jeniskelamin, String nik, boolean menikah) {
        super(nama, jeniskelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGajiPokok() {
        return this.gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return this.tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return this.jumlahAnak;
    }

    public int getLamaBekerja() {
        return LocalDate.now().getYear() - tahunMasuk.getYear();
    }

    public double getBonus() {
        int lama = getLamaBekerja();
        if (lama > 10)
            return gaji * 0.15;
        if (lama > 5)
            return gaji * 0.10;
        return gaji * 0.05;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20.0);
    }

    public double getGaji() {
        return gaji + getBonus() + getTunjangan();
    }

    @Override
    public double getPendapatan() {
        return getGaji();
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                        "Tahun Masuk   : %d %d %d\n" +
                        "Jumlah Anak   : %d\n" +
                        "Gaji          : $%.2f",
                super.toString(),
                tahunMasuk.getDayOfMonth(), tahunMasuk.getMonthValue(), tahunMasuk.getYear(),
                jumlahAnak,
                gaji);
    }
}
