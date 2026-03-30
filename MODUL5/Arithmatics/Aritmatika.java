package Arithmatics;

public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil, String nil2) { // ADDED
        double nilai = Double.parseDouble(nil) / Double.parseDouble(nil2); // ADDED
        System.out.println("nilai pembagian adalah : " + nilai); // ADDED
        return nilai; // ADDED
    } // ADDED
}
