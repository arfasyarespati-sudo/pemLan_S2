package praktikum;

import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Waktu dalam Jam ");
        int jam = in.nextInt();
        m1.setWaktu(jam);

        System.out.println("Masukkan Kecepatan");
        int kecepatan = in.nextInt();
        m1.setKecepatan(kecepatan);
        in.nextLine();

        System.out.println("Masukkan Merk ");
        String merk = in.nextLine();
        m1.setManufaktur(merk);

        System.out.println("Masukkan Plat ");
        String plat = in.nextLine();
        m1.setNoPlat(plat);

        System.out.println("Masukkan Warna");
        String warna = in.nextLine();
        m1.setWarna(warna);

        m1.displayMessage();

        System.out.println("================");

        Mobil m2 = new Mobil();

        System.out.println("Masukkan Waktu dalam Jam ");
        int jam1 = in.nextInt();
        m2.setWaktu(jam1);

        System.out.println("Masukkan Kecepatan");
        int kecepatan1 = in.nextInt();
        m2.setKecepatan(kecepatan1);
        in.nextLine();

        System.out.println("Masukkan Merk");
        String merk1 = in.nextLine();
        m2.setManufaktur(merk1);

        System.out.println("Masukkan Plat");
        String plat1 = in.nextLine();
        m2.setNoPlat(plat1);

        System.out.println("Masukkan Warna");
        String warna1 = in.nextLine();
        m2.setWarna(warna1);

        m2.displayMessage();

        System.out.println("================");

        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        m1.displayMessage();
    }
}