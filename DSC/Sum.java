package DSC;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt(); // 12345

        int sum = 0; // deklarasi sum

        while (input > 0) {
            int last = input % 10; // last = 12345 % 10 = 5 || Last = 1234 % 10 = 4
            sum += last; // sum = 5 || sum = 5+4 = 9
            input = input / 10; // input = 12345 / 10 = 1234 || input = 1234 / 10 = 123

        }
        System.out.println(sum);

    }
}
