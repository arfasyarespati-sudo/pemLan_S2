package Projects.PRAKTIKUM10;

import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        // Ganti dengan nama direktori yang ingin dihapus
        File direktori = new File("DarDerDor");

        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();

            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }

            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
