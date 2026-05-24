package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num;
        int num3 = num + 1;

        int sum = num1 + num2 + num3;
        int square = sum * sum;

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);
        System.out.println("Третье число: " + num3);
        System.out.println("Четвертое число: " + square);

        in.close();
    }
}
