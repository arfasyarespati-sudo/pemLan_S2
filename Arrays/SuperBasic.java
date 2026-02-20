package Arrays;

import java.util.Scanner;

public class SuperBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        int jumlah = in.nextInt();
        in.nextLine();

        String[] nama = new String[jumlah];
        double[] nilai = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan nama: ");
            nama[i] = in.next();
            System.out.println("Masukkan Nilai: ");
            nilai[i] = in.nextDouble();
            in.nextLine();
        }

        double total = 0;

        System.out.println("=== Daftar Nilai ===");

        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i + ". " + nama[i] + " : " + nilai[i]);

            in.nextLine();

            total += nilai[i];

            System.out.println("Rata-rata nilai Kelas: " + total / jumlah);
            System.out.println("Nilai tertinggi di kelas: ");
        }
    }
}
