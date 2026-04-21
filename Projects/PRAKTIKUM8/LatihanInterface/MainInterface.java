package Projects.PRAKTIKUM8.LatihanInterface;

import java.util.Scanner;

public class MainInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA HEWAN ===");
        System.out.print("Masukkan Nama Hewan: ");
        String namaH = input.nextLine();
        System.out.print("Masukkan Umur Hewan: ");
        int umurH = input.nextInt();

        Hewan peliharaan = new Hewan(namaH, umurH);

        System.out.println("\n=== HASIL OUTPUT HEWAN ===");
        peliharaan.tampilkanNama();
        peliharaan.tampilkanUmur();
        peliharaan.makan();
        peliharaan.berjalan();
        peliharaan.bersuara();

        input.close();
    }
}
