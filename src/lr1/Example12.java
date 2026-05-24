package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Year.now().getValue();

        System.out.println("Введите возраст:");
        int age = in.nextInt();

        int birthYear = currentYear - age;

        System.out.println("Год рождения: " + birthYear);

        in.close();
    }
}