package ObjectOriented.Exercise;

public class Weapons {
    public static void main(String[] args) {
        Weapon Sword = new Weapon("Sword", 50);
        Weapon Bow = new Weapon("Bow", 25);
        Character ilham = new Character("Ilham", 100, Sword);
        Character musuh = new Character("Musuh", 100, Bow);
        ilham.Attack(musuh);
        musuh.Attack(ilham);

    }

    static class Weapon {
        String name;
        int dmg;

        Weapon(String name, int dmg) {
            this.name = name;
            this.dmg = dmg;
        }
    }

    static class Character {
        String name;
        int hp;
        Weapon weapon;

        Character(String name, int hp, Weapon weapon) {
            this.name = name;
            this.hp = hp;
            this.weapon = weapon;

        }

        void Attack(Character musuh) {
            if (weapon == null) {
                System.out.println(this.name + " tidak memiliki senjata untuk menyerang");
            } else {
                System.out.println(
                        this.name + " Menyerang " + musuh.name + " Dengan " + weapon.name + " Sebesar " + weapon.dmg);
                musuh.hp = musuh.hp - weapon.dmg;
                System.out.println("Hp " + musuh.name + " Sekarang: " + musuh.hp);
            }
        }
    }
}
