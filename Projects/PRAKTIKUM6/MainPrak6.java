package Projects.PRAKTIKUM6;

public class MainPrak6 {
    public static void main(String[] args) {
        Manusia a = new Manusia("Brian", true, "255150700111041", false);
        MahasiswaFILKOM b = new MahasiswaFILKOM("165150400111001", 2.8, "L", true, "2220001", false);
        Pekerja c = new Pekerja(1000, 2024, 1, 1, 2, "Jason", true, "3330001", true);
        Manager d = new Manager("HRD", 7500, 2011, 4, 1, 2, "Habibie", true, "4440001", true);

        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(c);
        System.out.println();
        System.out.println(d);

    }
}
