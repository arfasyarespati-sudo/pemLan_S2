package Projects.PRAKTIKUM7;

public class MainKue {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 50000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 10000, 12);
        daftarKue[2] = new KuePesanan("Cheesecake", 80000, 2.0);
        daftarKue[3] = new KueJadi("Martabak", 25000, 5);
        daftarKue[4] = new KuePesanan("Red Velvet", 60000, 1.2);
        daftarKue[5] = new KueJadi("Kue Kering", 15000, 20);
        daftarKue[6] = new KuePesanan("Tiramisu", 75000, 1.0);
        daftarKue[7] = new KueJadi("Pudding", 12000, 15);
        daftarKue[8] = new KuePesanan("Black Forest", 70000, 1.8);
        daftarKue[9] = new KueJadi("Roti Bakar", 20000, 8);
        daftarKue[10] = new KuePesanan("Puding Coklat", 45000, 2.5);
        daftarKue[11] = new KueJadi("Kue Lapis", 30000, 10);
        daftarKue[12] = new KuePesanan("Choco Lava", 55000, 1.3);
        daftarKue[13] = new KueJadi("Kue Tart", 35000, 6);
        daftarKue[14] = new KuePesanan("Oreo Cake", 65000, 1.7);
        daftarKue[15] = new KueJadi("Kue Bolu", 18000, 18);
        daftarKue[16] = new KuePesanan("Vanilla Cake", 50000, 1.4);
        daftarKue[17] = new KueJadi("Kue Nastar", 22000, 25);
        daftarKue[18] = new KuePesanan("Carrot Cake", 58000, 1.6);
        daftarKue[19] = new KueJadi("Kue Putri Salju", 16000, 30);

        System.out.println("-- Daftar Semua Kue --");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
        }

        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("-- Total Harga Semua Kue --");
        System.out.println(totalHargaSemua);
        System.out.println();

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) kue;
                totalHargaPesanan += kp.hitungHarga();
                totalBeratPesanan += kp.getBerat();
            }
        }
        System.out.println("-- Kue Pesanan --");
        System.out.println("Total Harga : Rp" + totalHargaPesanan);
        System.out.println("Total Berat : " + totalBeratPesanan + " kg");
        System.out.println();

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                KueJadi kj = (KueJadi) kue;
                totalHargaJadi += kj.hitungHarga();
                totalJumlahJadi += kj.getJumlah();
            }
        }
        System.out.println("-- Kue Jadi --");
        System.out.println("Total Harga  : Rp" + totalHargaJadi);
        System.out.println("Total Jumlah : " + totalJumlahJadi + " pcs");
        System.out.println();

        Kue kueTermahal = daftarKue[0];
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        System.out.println("-- Kue Termahal --");

        System.out.println(kueTermahal);
    }
}