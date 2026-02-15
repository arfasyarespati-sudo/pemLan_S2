package ObjectOriented.Experimental;

public class pertama {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad", "255250700", 4.00);
        Mahasiswa mahasiswa2 = new Mahasiswa("Hendra", "255250702", 3.76);

        mahasiswa1.show();
        mahasiswa2.show();

        mahasiswa1.setNama("Badrul");
        mahasiswa2.setIPK(2.50);
        System.out.println();
        mahasiswa1.show();
        mahasiswa2.show();
    }
}
