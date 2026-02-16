package ObjectOriented.Exercise;

public class HealthPoints {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("Alucard");
        hero1.setHP(100);

        System.out.println("Hero: " + hero1.getName() + " Siap Bertarung");
        System.out.println("HP Awal: " + hero1.getHP());

        hero1.terimaDamage(120);

        System.out.println("Sisa HP " + hero1.getName() + ": " + hero1.getHP());

    }
}

class Hero {
    private String name;
    private int healthPoint;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getHP() {
        return this.healthPoint;
    }

    void terimaDamage(int damage) {
        if (damage < healthPoint) {
            System.out.println("Diserang musuh sebesar " + damage + "!");
            healthPoint = healthPoint - damage;
        } else if (healthPoint <= damage) {
            System.out.println("Diserang musuh sebesar " + damage + "!");
            System.out.println("Hero mati!");
            healthPoint = 0;
        }
    }

    void setHP(int healthPoint) {
        if (healthPoint < 0) {
            this.healthPoint = 0;
        } else {
            this.healthPoint = healthPoint;
        }
    }
}
