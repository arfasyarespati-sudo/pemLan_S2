package Projects.PRAKTIKUM6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, boolean jeniskelamin, String nik, boolean menikah) {
        super(nama, jeniskelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return this.ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char kodeProdi = nim.charAt(6);
        String prodi;
        switch (kodeProdi) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Tidak Diketahui";
                break;
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5 && ipk <= 4.0)
            return 75.0;
        if (ipk >= 3.0 && ipk < 3.5)
            return 50.0;
        return 0.0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                        "NIM           : %s\n" +
                        "IPK           : %.2f\n" +
                        "Status        : %s",
                super.toString(),
                nim, ipk, getStatus());
    }
}
