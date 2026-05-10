package Projects.PRAKTIKUM10;

import java.io.File;

public class FileLister {
    public static void main(String[] args) {
        File direktori = new File(".");

        if (direktori.exists() && direktori.isDirectory()) {

            File[] daftarFile = direktori.listFiles();

            System.out.println("Daftar file di direktori: " + direktori.getAbsolutePath());

            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.isFile()) {
                        System.out.println("- " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
