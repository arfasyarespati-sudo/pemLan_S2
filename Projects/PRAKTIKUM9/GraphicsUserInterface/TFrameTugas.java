package Projects.PRAKTIKUM9.GraphicsUserInterface;

import java.awt.*;
import java.awt.event.*;

class MataKuliah {
    double nilaiAkhir;

    public void hitungNilai(double t, double k, double uts, double uas) {
    }
}

class ASD extends MataKuliah {
    public void hitungNilai(double t, double k, double uts, double uas) {
        nilaiAkhir = (t * 0.2) + (k * 0.2) + (uts * 0.3) + (uas * 0.3);
    }
}

class Pemlan extends MataKuliah {
    public void hitungNilai(double t, double k, double uts, double uas) {
        nilaiAkhir = (t * 0.3) + (k * 0.1) + (uts * 0.3) + (uas * 0.3);
    }
}

class Matkomlan extends MataKuliah {
    public void hitungNilai(double t, double k, double uts, double uas) {
        nilaiAkhir = (t * 0.1) + (k * 0.2) + (uts * 0.3) + (uas * 0.4);
    }
}

class Probstat extends MataKuliah {
    public void hitungNilai(double t, double k, double uts, double uas) {
        nilaiAkhir = (t + k + uts + uas) / 4.0;
    }
}

public class TFrameTugas extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHitung, btnTampil;
    TextArea txtAreaHasil;

    ASD asd = new ASD();
    Pemlan pemlan = new Pemlan();
    Matkomlan matkomlan = new Matkomlan();
    Probstat probstat = new Probstat();

    public TFrameTugas() {
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(130, 40, 150, 20);

        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, true);
        cbPemlan = new Checkbox("Pemlan", cbg, false);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        cbProbstat = new Checkbox("Probstat", cbg, false);

        add(cbASD);
        cbASD.setBounds(30, 70, 50, 20);
        add(cbPemlan);
        cbPemlan.setBounds(90, 70, 70, 20);
        add(cbMatkomlan);
        cbMatkomlan.setBounds(170, 70, 90, 20);
        add(cbProbstat);
        cbProbstat.setBounds(270, 70, 80, 20);

        cbASD.addItemListener(new RadioAction());
        cbPemlan.addItemListener(new RadioAction());
        cbMatkomlan.addItemListener(new RadioAction());
        cbProbstat.addItemListener(new RadioAction());

        lbTugas = new Label("Tugas :");
        add(lbTugas);
        lbTugas.setBounds(80, 110, 60, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(150, 110, 100, 20);

        lbKuis = new Label("Kuis :");
        add(lbKuis);
        lbKuis.setBounds(80, 140, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(150, 140, 100, 20);

        lbUTS = new Label("UTS :");
        add(lbUTS);
        lbUTS.setBounds(80, 170, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(150, 170, 100, 20);

        lbUAS = new Label("UAS :");
        add(lbUAS);
        lbUAS.setBounds(80, 200, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(150, 200, 100, 20);

        lbHasil = new Label("Hasil :");
        add(lbHasil);
        lbHasil.setBounds(80, 230, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(150, 230, 100, 20);
        txtHasil.setEditable(false);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(150, 270, 80, 25);
        btnHitung.addActionListener(new HitungAction());

        txtAreaHasil = new TextArea();
        add(txtAreaHasil);
        txtAreaHasil.setBounds(40, 310, 300, 100);

        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(100, 430, 200, 25);
        btnTampil.addActionListener(new TampilAction());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class RadioAction implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            txtHasil.setText("");
        }
    }

    class HitungAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double t = Double.parseDouble(txtTugas.getText().trim());
            double k = Double.parseDouble(txtKuis.getText().trim());
            double uts = Double.parseDouble(txtUTS.getText().trim());
            double uas = Double.parseDouble(txtUAS.getText().trim());

            if (cbASD.getState()) {
                asd.hitungNilai(t, k, uts, uas);
                txtHasil.setText(String.valueOf(asd.nilaiAkhir));
            } else if (cbPemlan.getState()) {
                pemlan.hitungNilai(t, k, uts, uas);
                txtHasil.setText(String.valueOf(pemlan.nilaiAkhir));
            } else if (cbMatkomlan.getState()) {
                matkomlan.hitungNilai(t, k, uts, uas);
                txtHasil.setText(String.valueOf(matkomlan.nilaiAkhir));
            } else if (cbProbstat.getState()) {
                probstat.hitungNilai(t, k, uts, uas);
                txtHasil.setText(String.valueOf(probstat.nilaiAkhir));
            }
        }
    }

    class TampilAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String rekap = "HASIL NILAI SEMUA MATA KULIAH\n\n";
            rekap += "Pemlan\t: " + pemlan.nilaiAkhir + "\n";
            rekap += "ASD\t: " + asd.nilaiAkhir + "\n";
            rekap += "Matkomlan\t: " + matkomlan.nilaiAkhir + "\n";
            rekap += "Probstat\t: " + probstat.nilaiAkhir + "\n";
            txtAreaHasil.setText(rekap);
        }
    }
}
