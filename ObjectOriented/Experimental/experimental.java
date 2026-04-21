package ObjectOriented.Experimental;

abstract class Animal {

    public abstract void sound();

    void sleep() {
        System.out.println("zzz");
    }

}

class Wolf extends Animal {

    public void sound() {
        System.out.println("Woof");
    }

}

public class experimental {
    public static void main(String[] args) {
        Animal a = new Wolf();
        a.sound();
        a.sleep();
    }
}
