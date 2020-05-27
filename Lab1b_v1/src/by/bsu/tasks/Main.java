package by.bsu.tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Введите размер массива: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.print("Ошибка! Размер массива должен быть положительным\n");
                continue;
            }
            break;
        } while (true);
        int[] arr = new int[n];
        System.out.print("Введите массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Нечетные числа:");
        for (int i = 0; i < n; ++i) {
            if ((arr[i] % 2) == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Четные числа:");
        for (int i = 0; i < n; ++i) {
            if ((arr[i] % 2) == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
