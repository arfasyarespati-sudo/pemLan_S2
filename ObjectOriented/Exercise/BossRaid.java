package ObjectOriented.Exercise;

public class BossRaid {
    public static void main(String[] args) {
        Enemy Thanos = new Enemy("Thanos", 100);
        Knight Arthur = new Knight("Arthur", 50);
        Mage Merlin = new Mage("Merlin", 20);

        Merlin.serang(Thanos);
        Merlin.serang(Thanos);
        Arthur.serang(Thanos);

    }
}

class Hero {
    String name;
    int baseDamage;

    Hero(String name, int baseDamage) {
        this.name = name;
        this.baseDamage = baseDamage;
    }

    void serang(Enemy musuh) { // kayak bikin objek Enemy musuh = new Enemy();
        musuh.terimaSerangan(this.baseDamage);
        System.out.println(this.name + " memukul " + musuh.getName() + " dengan serangan biasa.");
    }
}

class Knight extends Hero {
    Knight(String name, int baseDamage) {
        super(name, baseDamage);
    }

    @Override
    void serang(Enemy musuh) {
        System.out.println(this.name + " menebas " + musuh.getName() + " dengan pedang suci!");
        musuh.terimaSerangan(this.baseDamage + 10);
    }
}

class Mage extends Hero {
    Mage(String name, int baseDamage) {
        super(name, baseDamage);
    }

    @Override
    void serang(Enemy musuh) {
        System.out.println(this.name + " membakar " + musuh.getName() + " dengan bola api!");
        musuh.terimaSerangan(this.baseDamage * 2);
    }
}

class Enemy {
    private String name;
    private int HP;

    Enemy(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    String getName() {
        return name;
    }

    int getHP() {
        return HP;
    }

    void terimaSerangan(int damage) {
        this.HP = this.HP - damage;
        if (this.HP < 0) {
            this.HP = 0;
        }
        System.out.println("Health " + this.name + " berkurang " + damage + "! " + "Sisa HP: " + this.HP);
        if (HP <= 0) {
            System.out.println(this.name + " Meninggal.");
        }
    }
}