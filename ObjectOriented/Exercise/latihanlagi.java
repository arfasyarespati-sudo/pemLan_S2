package ObjectOriented.Exercise;

public class latihanlagi {
    public static void main(String[] args) {
        smartPhone smartphone1 = new smartPhone("Samsung", "A17", 400000);
        smartPhone smartphone2 = new smartPhone("Iphone", "15 Pro", 900000);

        System.out.println("=== Info Smartphone ===");
        smartphone1.tampilkanInfo();
        smartphone1.cekPerforma();
        System.out.println("-------------------");
        smartphone2.tampilkanInfo();
        smartphone2.cekPerforma();
    }
}

class smartPhone {
    String merk;
    String tipe;
    int skorAntutu;

    smartPhone(String merk, String tipe, int skorAntutu) {
        this.merk = merk;
        this.tipe = tipe;
        this.skorAntutu = skorAntutu;
    }

    void cekPerforma() {
        if (this.skorAntutu > 500000) {
            System.out.println("Status: HP Gaming Berat");
        } else {
            System.out.println("Status: HP Casual");
        }

    }

    void tampilkanInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Tipe: " + this.tipe);
        System.out.println("Antutu: " + this.skorAntutu);
    }
}
