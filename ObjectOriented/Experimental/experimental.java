package ObjectOriented.Experimental;

import java.util.Scanner;

public class experimental {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String msg = in.next();

        int hitungan = 1;

        for (int i = 0; i < msg.length() - 1; i++) {
            if (msg.charAt(i) == msg.charAt(i + 1)) {
                hitungan++;
            } else {
                System.out.println(msg.charAt(i));
                if (hitungan > 1) {
                    System.out.println(hitungan);
                }
                hitungan = 1;
            }
        }
        int lastindex = msg.length() - 1;
    }
}
