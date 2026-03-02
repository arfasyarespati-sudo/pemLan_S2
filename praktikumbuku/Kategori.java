package praktikumbuku;

class Kategori {
    String nama;
    Buku b1, b2, b3, b4, b5;

    Kategori(String nama, Buku b1, Buku b2, Buku b3, Buku b4, Buku b5) {
        this.nama = nama;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
    }

    void cetakTabel() {
        System.out.println("Kategori: " + nama);
        System.out.println("+------------------------------------------+--------------------------------+");
        System.out.printf("| %-40s | %-30s |\n", "Judul Buku", "Penulis");
        System.out.println("+------------------------------------------+--------------------------------+");
        b1.tampilBaris();
        b2.tampilBaris();
        b3.tampilBaris();
        b4.tampilBaris();
        b5.tampilBaris();
        System.out.println("+------------------------------------------+--------------------------------+\n");
    }
}
