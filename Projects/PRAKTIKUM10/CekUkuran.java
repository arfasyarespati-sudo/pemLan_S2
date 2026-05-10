package Projects.PRAKTIKUM10;

import java.io.File;

public class CekUkuran {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double satuMegaByte = 1024 * 1024.0;

            System.out.println("Nama File: " + file.getName());

            if (bytes < satuMegaByte) {
                double kb = bytes / 1024.0;
                System.out.printf("Ukuran file: %.2f KB\n", kb);
            } else {
                double mb = bytes / satuMegaByte;
                System.out.printf("Ukuran file: %.2f MB\n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
