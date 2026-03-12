package ObjectOriented.Perbankan;

public class MainBank {
    public static void main(String[] args) {
        Account akun = new Account("Arfa", "Habibi2", "Arfa123", 200);
        akun.tambahSaldo(200, "Arfa123");
        akun.setUsername("Habibi");
        akun.setPassword("Yayayo_213");
        akun.tampilMenu();

    }
}
