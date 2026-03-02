package praktikum;

public class Mobil {
    String noPlat;
    String warna;
    String manufaktur;
    double kecepatan;
    double waktu;

    double rubahSekon(double jam) {
        return jam * 3600;
    }

    double rubahKecepatan(double kmh) {
        return (kmh * 1000) / 3600;
    }

    public void setWaktu(int a) {
        waktu = rubahSekon((double) a);
    }

    public void setKecepatan(int i) {
        kecepatan = rubahKecepatan((double) i);
    }

    public double hitungJarak() {
        double jarakMeter = kecepatan * waktu;
        return jarakMeter / 1000;
    }

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan (m/s) " + kecepatan);
        System.out.println("Dengan Waktu (sekon) " + waktu);
        System.out.println("Jarak yang dapat ditempuh (km) " + hitungJarak());
    }
}