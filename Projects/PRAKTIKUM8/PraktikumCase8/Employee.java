package Projects.PRAKTIKUM8.PraktikumCase8;

public class Employee implements Payable {
    Integer reg; // no pendaftaran
    String nama;
    Integer gaji;
    Invoice[] bon; // nyimpen belanja

    public Employee(Integer reg, String nama, Integer gaji, Invoice[] bon) {
        this.reg = reg;
        this.nama = nama;
        this.gaji = gaji;
        this.bon = bon;
    }

    public int getPayableAmount() {
        int hutang = 0;
        for (int i = 0; i < bon.length; i++) {
            hutang = hutang + bon[i].getPayableAmount();
        }
        int sisaGaji = gaji - hutang;

        return sisaGaji;
    }
}
