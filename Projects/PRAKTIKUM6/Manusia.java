package Projects.PRAKTIKUM6;

public class Manusia {
    private String nama;
    private boolean jeniskelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jeniskelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJenis(boolean jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public boolean getJenis() {
        return this.jeniskelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return this.nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean getMenikah() {
        return this.menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;

        if (this.menikah == true && this.jeniskelamin == true) {
            tunjangan = 25;
        } else if (this.menikah == true && this.jeniskelamin == false) {
            tunjangan = 20;
        } else if (this.menikah == false) {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format(
                "Nama          : %s\n" +
                        "NIK           : %s\n" +
                        "Jenis Kelamin : %s\n" +
                        "Menikah       : %s\n" +
                        "Pendapatan    : $%.2f",
                nama, nik,
                jeniskelamin ? "Laki-laki" : "Perempuan",
                menikah ? "Ya" : "Tidak",
                getPendapatan());
    }
}
