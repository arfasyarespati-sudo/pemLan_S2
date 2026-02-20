package DSC;

import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Membaca jumlah pedagang
        int n = in.nextInt(); // 3

        // Membaca hari kedatangan pedagang pertama sebagai nilai awal KPK
        long kpk = in.nextLong(); // 2

        // Looping untuk pedagang kedua hingga terakhir
        for (int i = 1; i < n; i++) {
            long angkaBerikutnya = in.nextLong(); // 4, 5

            // 1. Logika mencari FPB (menggantikan method terpisah)
            long a = kpk; // 2
            long b = angkaBerikutnya; // 4

            while (b != 0) {
                long sisaBagi = a % b; // 2 % 4 = 2 || 2 % 2 = 0
                a = b; // 2 = 4. a = 4 ||
                b = sisaBagi; // 2
            }
            long fpb = a; // Nilai 'a' terakhir adalah FPB-nya

            // 2. Menghitung KPK baru berdasarkan FPB yang didapat
            kpk = (kpk / fpb) * angkaBerikutnya;
        }

        // Mencetak hasil akhir KPK
        System.out.println(kpk);

        in.close();

    }
}
