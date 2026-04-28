package Projects.PRAKTIKUM9.GUILanjut;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormDaftarUlang extends JFrame {
    JLabel lblNama = new JLabel("Nama Lengkap");
    JTextField txNama = new JTextField();

    JLabel lblTglLahir = new JLabel("Tanggal Lahir");
    JTextField txTglLahir = new JTextField();

    JLabel lblNoDaftar = new JLabel("Nomor Pendaftaran");
    JTextField txNoDaftar = new JTextField();

    JLabel lblTelp = new JLabel("No. Telp");
    JTextField txTelp = new JTextField();

    JLabel lblAlamat = new JLabel("Alamat");
    JTextArea txAlamat = new JTextArea();

    JLabel lblEmail = new JLabel("E-mail");
    JTextField txEmail = new JTextField();

    JButton btnSubmit = new JButton("submit");

    public FormDaftarUlang() {
        setTitle("Form Online Daftar Ulang");
        setSize(400, 400);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void KomponenVisual() {
        getContentPane().setLayout(null);

        getContentPane().add(lblNama);
        lblNama.setBounds(20, 20, 130, 20);
        getContentPane().add(txNama);
        txNama.setBounds(160, 20, 200, 20);

        getContentPane().add(lblTglLahir);
        lblTglLahir.setBounds(20, 50, 130, 20);
        getContentPane().add(txTglLahir);
        txTglLahir.setBounds(160, 50, 200, 20);

        getContentPane().add(lblNoDaftar);
        lblNoDaftar.setBounds(20, 80, 130, 20);
        getContentPane().add(txNoDaftar);
        txNoDaftar.setBounds(160, 80, 200, 20);

        getContentPane().add(lblTelp);
        lblTelp.setBounds(20, 110, 130, 20);
        getContentPane().add(txTelp);
        txTelp.setBounds(160, 110, 200, 20);

        getContentPane().add(lblAlamat);
        lblAlamat.setBounds(20, 140, 130, 20);
        getContentPane().add(txAlamat);
        txAlamat.setBounds(160, 140, 200, 50);

        getContentPane().add(lblEmail);
        lblEmail.setBounds(20, 200, 130, 20);
        getContentPane().add(txEmail);
        txEmail.setBounds(160, 200, 200, 20);

        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(260, 240, 100, 30);

        setVisible(true);
    }

    void AksiReaksi() {
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                if (txNama.getText().trim().isEmpty() ||
                        txTglLahir.getText().trim().isEmpty() ||
                        txNoDaftar.getText().trim().isEmpty() ||
                        txTelp.getText().trim().isEmpty() ||
                        txAlamat.getText().trim().isEmpty() ||
                        txEmail.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Semua kolom harus terisi!", "Peringatan",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                    int pilihan = JOptionPane.showConfirmDialog(null,
                            "Apakah anda yakin data yang Anda isi sudah benar?",
                            "Konfirmasi",
                            JOptionPane.OK_CANCEL_OPTION);

                    if (pilihan == JOptionPane.OK_OPTION) {
                        tampilJendelaBaru();
                    }

                }
            }
        });
    }

    void tampilJendelaBaru() {
        JFrame frameHasil = new JFrame("Data Mahasiswa");
        frameHasil.setSize(350, 300);
        frameHasil.setLocation(350, 150);
        frameHasil.setLayout(new BorderLayout());

        JTextArea areaHasil = new JTextArea();
        areaHasil.setEditable(false);
        areaHasil.setMargin(new Insets(10, 10, 10, 10));

        String teks = "Data Mahasiswa\n\n" +
                "Nama\t: " + txNama.getText() + "\n" +
                "Tanggal Lahir\t: " + txTglLahir.getText() + "\n" +
                "No.Pendaftaran\t: " + txNoDaftar.getText() + "\n" +
                "No.Telp\t: " + txTelp.getText() + "\n" +
                "Alamat\t: " + txAlamat.getText() + "\n" +
                "E-mail\t: " + txEmail.getText();

        areaHasil.setText(teks);

        JPanel panelTengah = new JPanel(new BorderLayout());
        panelTengah.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        areaHasil.setBorder(BorderFactory.createLineBorder(new Color(100, 150, 200), 2));

        panelTengah.add(areaHasil, BorderLayout.CENTER);
        frameHasil.add(panelTengah, BorderLayout.CENTER);

        frameHasil.setVisible(true);
    }

    public static void main(String args[]) {
        FormDaftarUlang form = new FormDaftarUlang();
        form.KomponenVisual();
        form.AksiReaksi();
    }
}
