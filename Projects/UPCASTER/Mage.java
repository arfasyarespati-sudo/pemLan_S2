package Projects.UPCASTER;

public class Mage extends Hero {

    public Mage(String nama) {
        super(nama);
    }

    @Override
    public void attack() {
        System.out.println("Sihir Api");
    }
}
