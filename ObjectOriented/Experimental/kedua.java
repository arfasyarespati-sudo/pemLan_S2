package ObjectOriented.Experimental;

class Mahasiswa {
    String nama;
    String NIM;
    double IPK;

    Mahasiswa(String nama, String NIM, double IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.IPK = IPK;
    }

    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
        System.out.println("IPK: " + this.IPK);
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNIM(String NIM) {
        this.NIM = NIM;
    }

    void setIPK(double IPK) {
        this.IPK = IPK;
    }

    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    double getIPK() {
        return this.IPK;
    }

}