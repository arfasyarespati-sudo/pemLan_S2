package JaketPraktikum;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Jaket A: ");
        int jmlA = input.nextInt();

        System.out.print("Masukkan jumlah Jaket B: ");
        int jmlB = input.nextInt();

        System.out.print("Masukkan jumlah Jaket C: ");
        int jmlC = input.nextInt();

        Transaksi pesanan = new Transaksi(jmlA, jmlB, jmlC);

        pesanan.totalHarga();

        input.close();
    }
}
