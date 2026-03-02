package praktikumbuku;

public class MainBuku {
    public static void main(String[] args) {
        Kategori teknologi = new Kategori("Teknologi",
                new Buku("Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra"),
                new Buku("Pengantar Teknologi Informasi", "Buhori Muslim"),
                new Buku("Penelitian Teknik Informatika", "Ade Johar Maturidi"),
                new Buku("Clean Code", "Robert Cecil Martin"),
                new Buku("Aplikasi Komputer", "Dwi Krisbiantoro"));

        Kategori filsafat = new Kategori("Filsafat",
                new Buku("Filsafat Ilmu", "Welhendri Azwar dan Muliono"),
                new Buku("Meditations", "Marcus Aurelius"),
                new Buku("Filsafat Agama", "Amsal Bakhtiar"),
                new Buku("Being", "Martin Heidegger"),
                new Buku("Filsafat Sejarah", "Ahmad Sahidin"));

        Kategori sejarah = new Kategori("Sejarah",
                new Buku("Berlin", "Sinclair McKay"),
                new Buku("The History of the Ancient World", "Susan Wise Bauer"),
                new Buku("The Second World War", "Antony Beevor"),
                new Buku("1776", "David McCullough"),
                new Buku("The Diary of a Young Girl", "Anne Frank"));

        Kategori agama = new Kategori("Agama",
                new Buku("Sejarah Tuhan", "Karen Armstrong"),
                new Buku("Tafsir Al-Misbah", "M. Quraish Shihab"),
                new Buku("Ihya Ulumuddin", "Imam Al-Ghazali"),
                new Buku("Reclaim Your Heart", "Yasmin Mogahed"),
                new Buku("Fiqih Islam", "Sulaiman Rasjid"));

        Kategori psikologi = new Kategori("Psikologi",
                new Buku("Atomic Habits", "James Clear"),
                new Buku("Man's Search for Meaning", "Viktor Frankl"),
                new Buku("Thinking, Fast and Slow", "Daniel Kahneman"),
                new Buku("The Selfish Gene", "Richard Dawkins"),
                new Buku("Filosofi Teras", "Henry Manampiring"));

        teknologi.cetakTabel();
        filsafat.cetakTabel();
        sejarah.cetakTabel();
        agama.cetakTabel();
        psikologi.cetakTabel();
    }
}
