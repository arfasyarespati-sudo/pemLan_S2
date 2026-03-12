package ObjectOriented.Exercise;

class Buku {
    String judul;
    String penulis;
    String sinopsis;

    Buku(String judul, String penulis, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    int hitungKataSinopsis() {
        if (sinopsis == null || sinopsis.trim().isEmpty()) {
            return 0;
        }
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }

    double cekKesamaan(Buku bukuLain) {
        if (bukuLain == null)
            return 0.0;

        int totalAtribut = 3;
        int atributSama = 0;

        if (this.judul.equalsIgnoreCase(bukuLain.judul))
            atributSama++;
        if (this.penulis.equalsIgnoreCase(bukuLain.penulis))
            atributSama++;
        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis))
            atributSama++;

        return ((double) atributSama / totalAtribut) * 100.0;
    }

    Buku copy() {
        return new Buku(this.judul, this.penulis, this.sinopsis);
    }

    double hitungRoyalti(double hargaBuku) {
        return hargaBuku * 0.10;
    }

    double hitungRoyalti(double hargaBuku, double persen) {
        return hargaBuku * (persen / 100.0);
    }

    void tampilBaris() {
        System.out.printf("| %-38s | %-28s | %-12d |\n", judul, penulis, hitungKataSinopsis());
    }
}

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
        System.out.println("+----------------------------------------+------------------------------+--------------+");
        System.out.printf("| %-38s | %-28s | %-12s |\n", "Judul Buku", "Penulis", "Jml Kata Sin");
        System.out.println("+----------------------------------------+------------------------------+--------------+");

        b1.tampilBaris();
        b2.tampilBaris();
        b3.tampilBaris();
        b4.tampilBaris();
        b5.tampilBaris();

        System.out
                .println("+----------------------------------------+------------------------------+--------------+\n");
    }
}

public class MainBuku {
    public static void main(String[] args) {
        String sinopsisStandar = "Buku ini sangat direkomendasikan untuk dibaca karena membahas topik secara mendalam, komprehensif, dan mudah dipahami.";

        Kategori teknologi = new Kategori("Teknologi",
                new Buku("Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra",
                        "Buku dasar yang membahas pengantar teknik informatika dan fondasi ilmu komputer secara sangat komprehensif dan rinci."),
                new Buku("Pengantar Teknologi Informasi", "Buhori Muslim", sinopsisStandar),
                new Buku("Penelitian Teknik Informatika", "Ade Johar Maturidi", sinopsisStandar),
                new Buku("Clean Code", "Robert Cecil Martin", sinopsisStandar),
                new Buku("Aplikasi Komputer", "Dwi Krisbiantoro", sinopsisStandar));

        Kategori filsafat = new Kategori("Filsafat",
                new Buku("Filsafat Ilmu", "Welhendri Azwar dan Muliono", sinopsisStandar),
                new Buku("Meditations", "Marcus Aurelius", sinopsisStandar),
                new Buku("Filsafat Agama", "Amsal Bakhtiar", sinopsisStandar),
                new Buku("Being", "Martin Heidegger", sinopsisStandar),
                new Buku("Filsafat Sejarah", "Ahmad Sahidin", sinopsisStandar));

        Kategori sejarah = new Kategori("Sejarah",
                new Buku("Berlin", "Sinclair McKay", sinopsisStandar),
                new Buku("The History of the Ancient World", "Susan Wise Bauer", sinopsisStandar),
                new Buku("The Second World War", "Antony Beevor", sinopsisStandar),
                new Buku("1776", "David McCullough", sinopsisStandar),
                new Buku("The Diary of a Young Girl", "Anne Frank", sinopsisStandar));

        Kategori agama = new Kategori("Agama",
                new Buku("Sejarah Tuhan", "Karen Armstrong", sinopsisStandar),
                new Buku("Tafsir Al-Misbah", "M. Quraish Shihab", sinopsisStandar),
                new Buku("Ihya Ulumuddin", "Imam Al-Ghazali", sinopsisStandar),
                new Buku("Reclaim Your Heart", "Yasmin Mogahed", sinopsisStandar),
                new Buku("Fiqih Islam", "Sulaiman Rasjid", sinopsisStandar));

        Kategori psikologi = new Kategori("Psikologi",
                new Buku("Atomic Habits", "James Clear", sinopsisStandar),
                new Buku("Man's Search for Meaning", "Viktor Frankl", sinopsisStandar),
                new Buku("Thinking, Fast and Slow", "Daniel Kahneman", sinopsisStandar),
                new Buku("The Selfish Gene", "Richard Dawkins", sinopsisStandar),
                new Buku("Filosofi Teras", "Henry Manampiring", sinopsisStandar));

        teknologi.cetakTabel();
        filsafat.cetakTabel();
        sejarah.cetakTabel();
        agama.cetakTabel();
        psikologi.cetakTabel();

        System.out.println("=== UJI COBA METHOD BARU ===");

        Buku buku1 = teknologi.b1;

        Buku bukuCopy = buku1.copy();
        System.out.println("1. Method Copy berhasil. Judul buku hasil copy: " + bukuCopy.judul);

        System.out.println("2. Jumlah kata sinopsis '" + buku1.judul + "': " + buku1.hitungKataSinopsis() + " kata.");

        System.out.printf("3. Tingkat kesamaan buku asli dengan buku copy: %.2f%%\n", buku1.cekKesamaan(bukuCopy));

        System.out.printf("4. Tingkat kesamaan buku1 dengan buku2 di Kategori Teknologi: %.2f%%\n",
                buku1.cekKesamaan(teknologi.b2));

        System.out.println("5. Royalti 1 buku (default 10%) dari harga Rp 100.000: Rp " + buku1.hitungRoyalti(100000));

        System.out
                .println("6. Royalti 1 buku (custom 15%) dari harga Rp 100.000: Rp " + buku1.hitungRoyalti(100000, 15));
    }
}