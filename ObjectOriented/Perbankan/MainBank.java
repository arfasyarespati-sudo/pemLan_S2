package ObjectOriented.Perbankan;

public class MainBank {
    public static void main(String[] args) {
        Account akun = new Account("Arfa", "Habibi2", "Arfa123", 200);
        akun.tambahSaldo(200, "Arfa123");
        // set
        akun.setUsername("Habibi");
        akun.setPassword("Yayayo_213");
        akun.setNoRek("Hayoyo3");
        akun.setSaldo(500);
        // get
        System.out.println(akun.getUsername());
        System.out.println(akun.getPassword());
        System.out.println(akun.getNoRek());
        System.out.println(akun.getSaldo());
        // func
        akun.tambahSaldo(25, "Yayayo_213");
        akun.tarikSaldo(5, "Yayayo_213");
        akun.tampilMenu();

    }
}
