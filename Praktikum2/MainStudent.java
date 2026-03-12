package Praktikum2;

public class MainStudent {
    public static void main(String[] args) {

        Student anna = new Student("Anna", "Malang", 20, 90, 85, 88);
        anna.displayMessage();

        System.out.println("===================");

        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        System.out.println("===================");

        anna = new Student("Anna", "Batu", 18, 95, 92, 87);
        anna.displayMessage();

        System.out.println("===================");

        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
    }
}
