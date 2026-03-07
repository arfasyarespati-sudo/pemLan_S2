package Projects;

import java.util.Scanner;

public class ada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String tipe = in.next();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int aa = 0;
        int ab = 0;
        String as1 = "";
        String as2 = "";
        String as3 = "";
        String raor = "";

        if (tipe == "FILE") {
            raor = "-";
        } else if (tipe == "DIREKTORI") {
            raor = "d";
        } else {
            System.out.print("Tidak ditemukan");
        }

        if (a1 == 7) {
            as1 = "rwx";
        } else if (a1 == 6) {
            as1 = "rw-";

        } else if (a1 == 5) {

            as1 = "rx-";

        } else if (a1 == 3) {

            as1 = "wx-";

        }

        if (a2 == 7) {

            as2 = "rwx";

        } else if (a1 == 6) {

            as2 = "rw-";

        } else if (a1 == 5) {

            as2 = "rx-";

        } else if (a1 == 3) {

            as2 = "wx-";

        }

        if (a3 == 7) {

            as3 = "rwx";

        } else if (a1 == 6) {

            as3 = "rw-";

        } else if (a1 == 5) {
            as3 = "rx-";
        } else if (a1 == 3) {
            as3 = "wx-";
        }

        // r + w + x = 7
        // r + w = 6
        // r + x = 5
        // w + x = 3

        System.out.println(raor);

    }
}
