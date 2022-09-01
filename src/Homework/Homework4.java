package Homework;

import java.util.Scanner;

public class Homework4 {

    //Вычислить сумму 1+1/2+1/3+...+1/n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        sc.close();

        if (n > 0) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0/i; //sum = sum + 1/i
            }

            System.out.println("Сумма равна " + sum);
        }
        else {
            System.out.println("n должно быть больше 0");
        }

    }
}
