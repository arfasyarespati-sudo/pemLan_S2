package ObjectOriented.Exercise;

import java.util.Scanner;

public class Perbankan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bank a = new Bank();
        a.setNama("Arfa");
        a.setNorek(255);
        a.setPass(6767);
        a.setSaldo(67000150);

        a.tampil();
        int insertPass = in.nextInt();

        a.transaksi(67000000);

    }
}

class Bank {
    private double saldo;
    private String nama;
    private int norek;
    private int pass;

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        if (nama.length() > 4) {
            this.nama = nama;
        } else if (nama.length() <= 4) {
            System.out.println("Nama tidak valid..");
        }

    }

    int getNorek() {
        return norek;
    }

    void setNorek(int norek) {
        if (Math.abs(norek) > 8) {
            this.norek = norek;
        } else if (Math.abs(norek) <= 8) {
            System.out.println("Nomor rekening tidak valid..");
        }

    }

    int getPass() {
        return pass;
    }

    void setPass(int pass) {
        this.pass = pass;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double getSaldo() {
        return saldo;
    }

    void transaksi(double beli) {
        double selisih;
        if (insertPass == this.pass) {
            System.out.println("Password anda salah!");
        }
        if (beli > saldo) {
            selisih = 0;
        } else {
            selisih = saldo - beli;
        }
        System.out.println("Anda membeli sesuatu, Saldo ada sekarang: " + (selisih));
    }

    void tampil() {
        System.out.println("Nama           : " + nama);
        System.out.println("Nomor Rekening : " + norek);
        System.out.println("Password       : " + pass);
        System.out.println("Saldo          : " + saldo);
    }
}
