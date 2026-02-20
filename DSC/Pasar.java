package DSC;

import java.util.Scanner;

public class Pasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah pedagang
        int n = scanner.nextInt();

        // Membaca hari kedatangan pedagang pertama sebagai nilai awal KPK
        long kpk = scanner.nextLong();

        // Looping untuk pedagang kedua hingga terakhir
        for (int i = 1; i < n; i++) {
            long angkaBerikutnya = scanner.nextLong();

            // 1. Logika mencari FPB (menggantikan method terpisah)
            long a = kpk;
            long b = angkaBerikutnya;

            while (b != 0) {
                long sisaBagi = a % b;
                a = b;
                b = sisaBagi;
            }
            long fpb = a; // Nilai 'a' terakhir adalah FPB-nya

            // 2. Menghitung KPK baru berdasarkan FPB yang didapat
            kpk = (kpk / fpb) * angkaBerikutnya;
        }

        // Mencetak hasil akhir KPK
        System.out.println(kpk);

        scanner.close();
    }
}
