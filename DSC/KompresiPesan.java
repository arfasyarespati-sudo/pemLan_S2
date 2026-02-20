package DSC;

import java.util.Scanner;

public class KompresiPesan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (input.hasNext()) {
            String msg = input.next();

            // Variabel untuk menghitung jumlah huruf kembar
            int hitungan = 1;

            // Looping dari huruf PERTAMA sampai huruf SEBELUM TERAKHIR
            for (int i = 0; i < msg.length() - 1; i++) {

                // Membandingkan huruf saat ini dengan huruf di sebelah kanannya
                if (msg.charAt(i) == msg.charAt(i + 1)) {
                    // Jika sama, hitungan bertambah
                    hitungan++;
                } else {
                    // Jika berbeda, cetak huruf tersebut
                    System.out.print(msg.charAt(i));

                    // Cetak angkanya HANYA jika lebih dari 1
                    if (hitungan > 1) {
                        System.out.print(hitungan);
                    }

                    // Reset hitungan menjadi 1 untuk huruf baru berikutnya
                    hitungan = 1;
                }
            }

            // PENANGANAN KHUSUS UNTUK HURUF PALING TERAKHIR
            // Karena loop di atas berhenti sebelum mencapai ujung,
            // kita harus mencetak kelompok huruf yang terakhir secara manual di sini.
            int indeksTerakhir = msg.length() - 1;
            System.out.print(msg.charAt(indeksTerakhir));
            if (hitungan > 1) {
                System.out.print(hitungan);
            }

            System.out.println(); // Pindah baris di akhir output
        }

        input.close();
    }
}
