package Projects.PRAKTIKUM8.PraktikumCase8;

public class Main {
    public static void main(String[] args) {

        Invoice i1 = new Invoice("Kopi Kapal Api", 5, 20000);
        Invoice i2 = new Invoice("Indomie Goreng", 10, 3000);
        Invoice i3 = new Invoice("Roti Aoka", 4, 2500);

        Invoice[] belanjaan = new Invoice[] { i1, i2, i3 };

        Employee e = new Employee(998877, "Udin Petot", 4000000, belanjaan);

        System.out.println("Data Karyawan NV Meneer");
        System.out.println("ID: " + 998877);
        System.out.println("Nama: Udin Petot");
        System.out.println("Gaji Awal: " + 4000000);
        System.out.println("");
        System.out.println("Daftar Hutang:");

        // ngitung hutang
        int hutang = 0;
        for (int x = 0; x < belanjaan.length; x++) {
            System.out.println("- " + belanjaan[x].getProductName() + " harga " + belanjaan[x].getPayableAmount());
            hutang = hutang + belanjaan[x].getPayableAmount();
        }

        System.out.println("");
        System.out.println("Total Hutang: " + hutang);

        System.out.println("Sisa Gaji: " + e.getPayableAmount());
    }
}
