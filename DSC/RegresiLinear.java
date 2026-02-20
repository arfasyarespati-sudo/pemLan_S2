package DSC;

import java.util.Scanner;
import java.util.Locale;

public class RegresiLinear {
    public static void main(String[] args) {
        // Menggunakan Locale.US agar format desimal menggunakan titik (.) bukan koma
        // (,)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Membaca N (Total data)
        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        // Membaca elemen-elemen array X
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }

        // Membaca elemen-elemen array Y
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextDouble();
        }

        // Membaca nilai P (Titik X yang dicari)
        double p = scanner.nextDouble();

        // Variabel untuk menyimpan hasil sigma (jumlah)
        double sumX = 0;
        double sumY = 0;
        double sumX2 = 0;
        double sumXY = 0;

        // Menghitung sigma
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumX2 += (x[i] * x[i]);
            sumXY += (x[i] * y[i]);
        }

        // Menghitung penyebut (denominator) dari rumus yang sama untuk a dan b
        double denominator = (n * sumX2) - (sumX * sumX);

        // Menghitung b (slope) dan a (intercept) menggunakan Rumus 1
        double b = ((n * sumXY) - (sumX * sumY)) / denominator;
        double a = ((sumY * sumX2) - (sumX * sumXY)) / denominator;

        // Menghitung Q (hasil persamaan untuk P)
        double q = a + (b * p);

        // Mencetak hasil format "B A Q" dengan 1 angka di belakang koma (sesuai sample
        // output)
        System.out.printf(Locale.US, "%.1f %.1f %.1f\n", b, a, q);

        scanner.close();
    }
}
