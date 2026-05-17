package Projects.PRAKTIKUM11;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Soal2 {
    public static void main(String[] args) {
        Integer[] tinggiA_arr = { 168, 170, 165, 168, 172, 170, 169, 165, 171, 166 };
        Integer[] beratA_arr = { 50, 60, 56, 55, 60, 70, 66, 56, 72, 56 };
        List<Integer> tinggiA = new ArrayList<Integer>(Arrays.asList(tinggiA_arr));
        List<Integer> beratA = new ArrayList<Integer>(Arrays.asList(beratA_arr));

        Integer[] tinggiB_arr = { 170, 167, 165, 166, 168, 175, 172, 171, 168, 169 };
        Integer[] beratB_arr = { 66, 60, 59, 58, 58, 71, 68, 68, 65, 60 };
        List<Integer> tinggiB = new ArrayList<Integer>(Arrays.asList(tinggiB_arr));
        List<Integer> beratB = new ArrayList<Integer>(Arrays.asList(beratB_arr));

        Collections.sort(tinggiB);
        Collections.sort(beratA);

        System.out.println("2B. Pencarian di Tim B");
        System.out.printf("Data Tinggi B setelah diurutkan: %s\n", tinggiB);
        cariJumlahPemain(tinggiB, 168);
        cariJumlahPemain(tinggiB, 160);

        System.out.println();

        System.out.println("2C. Pencarian di Tim A");
        System.out.printf("Data Berat A setelah diurutkan: %s\n", beratA);
        cariJumlahPemain(beratA, 56);
        cariJumlahPemain(beratA, 53);

        System.out.println();

        System.out.println("2D. Cek Kesamaan Pemain");
        Collections.sort(tinggiA);
        Collections.sort(beratB);

        boolean adaYangSama = false;

        for (Integer t : tinggiA) {
            if (Collections.binarySearch(tinggiB, t) >= 0) {
                System.out.printf("Pemain Tim A dengan tinggi %d cm ADA yang sama dengan pemain Tim B.\n", t);
                adaYangSama = true;
                break;
            }
        }

        for (Integer b : beratA) {
            if (Collections.binarySearch(beratB, b) >= 0) {
                System.out.printf("Pemain Tim A dengan berat %d kg ADA yang sama dengan pemain Tim B.\n", b);
                adaYangSama = true;
                break;
            }
        }
        if (!adaYangSama) {
            System.out.println("Tidak ada pemain yang memiliki tinggi atau berat yang sama antar tim.");
        }
    }

    private static void cariJumlahPemain(List<Integer> list, Integer key) {
        System.out.printf("Mencari angka: %d -> ", key);
        int result = Collections.binarySearch(list, key);

        if (result >= 0) {
            int jumlah = Collections.frequency(list, key);
            System.out.printf("Ditemukan sebanyak %d pemain\n", jumlah);
        } else {
            System.out.printf("Tidak Ditemukan (%d)\n", result);
        }
    }
}