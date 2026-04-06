package Projects.PRAKTIKUM6;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal,
            int jumlahAnak, String nama, boolean jeniskelamin, String nik, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, jeniskelamin, nik, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return this.departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGajiPokok() * 0.10);
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                        "Departemen    : %s",
                super.toString(),
                departemen);
    }
}
