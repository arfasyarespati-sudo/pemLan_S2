package Projects.PRAKTIKUM11;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Soal1 {
    public static void main(String[] args) {
        // A
        Integer[] tinggiA_arr = { 168, 170, 165, 168, 172, 170, 169, 165, 171, 166 };
        Integer[] beratA_arr = { 50, 60, 56, 55, 60, 70, 66, 56, 72, 56 };
        List<Integer> tinggiA = Arrays.asList(tinggiA_arr);
        List<Integer> beratA = Arrays.asList(beratA_arr);

        // B
        Integer[] tinggiB_arr = { 170, 167, 165, 166, 168, 175, 172, 171, 168, 169 };
        Integer[] beratB_arr = { 66, 60, 59, 58, 58, 71, 68, 68, 65, 60 };
        List<Integer> tinggiB = Arrays.asList(tinggiB_arr);
        List<Integer> beratB = Arrays.asList(beratB_arr);

        // A + B
        List<Integer> semuaTinggi = new ArrayList<Integer>(tinggiA);
        semuaTinggi.addAll(tinggiB);

        List<Integer> semuaBerat = new ArrayList<Integer>(beratA);
        semuaBerat.addAll(beratB);

        System.out.println("1A. Urutkan Tinggi Badan");
        Collections.sort(semuaTinggi); // Ascending
        System.out.printf("Ascending  : %s\n", semuaTinggi);
        Collections.sort(semuaTinggi, Collections.reverseOrder()); // Descending
        System.out.printf("Descending : %s\n", semuaTinggi);

        System.out.println();

        System.out.println("1B. Urutkan Berat Badan");
        Collections.sort(semuaBerat); // Ascending
        System.out.printf("Ascending  : %s\n", semuaBerat);
        Collections.sort(semuaBerat, Collections.reverseOrder()); // Descending
        System.out.printf("Descending : %s\n", semuaBerat);

        System.out.println();

        System.out.println("1C. Nilai MAX dan MIN");
        System.out.printf("Tim A - Tinggi Max: %d, Min: %d\n", Collections.max(tinggiA), Collections.min(tinggiA));
        System.out.printf("Tim A - Berat Max: %d, Min: %d\n", Collections.max(beratA), Collections.min(beratA));
        System.out.printf("Tim B - Tinggi Max: %d, Min: %d\n", Collections.max(tinggiB), Collections.min(tinggiB));
        System.out.printf("Tim B - Berat Max: %d, Min: %d\n", Collections.max(beratB), Collections.min(beratB));

        System.out.println();

        System.out.println("1D. Copy Tim B ==> Tim C");
        Integer[] tinggiC_arr = new Integer[tinggiB.size()];
        Integer[] beratC_arr = new Integer[beratB.size()];
        List<Integer> tinggiC = Arrays.asList(tinggiC_arr);
        List<Integer> beratC = Arrays.asList(beratC_arr);

        Collections.copy(tinggiC, tinggiB); // copy
        Collections.copy(beratC, beratB); // copy
        System.out.printf("Tim C (Tinggi) berisi: %s\n", tinggiC);
        System.out.printf("Tim C (Berat)  berisi: %s\n", beratC);
    }
}