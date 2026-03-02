package praktikumbuku;

public class Buku {
    String judul;
    String penulis;

    Buku(String j, String p) {
        this.judul = j;
        this.penulis = p;
    }

    void tampilBaris() {
        System.out.printf("| %-40s | %-30s |\n", judul, penulis);
    }
}
