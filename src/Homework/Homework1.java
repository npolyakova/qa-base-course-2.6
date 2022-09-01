package Homework;

import java.util.Scanner;

public class Homework1 {

    //Составить программу вывода любого числа любое заданное число раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println("Введите количество повторов");
        int count = sc.nextInt();
        sc.close();

        for (int i = 0; i < count; i++) {
            System.out.println(number);
        }
    }
}
