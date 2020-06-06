package by.bsu.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class InputMatrix {
    public static Integer setDimension() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы.");
        while (true) {
            try {
                String s = in.readLine();
                int n = Integer.parseInt(s);
                if (n > 0) {
                    return n;
                }
                System.out.println("Введите положительное число.");
            } catch (IOException e) {
                System.out.println("Введите положительное число.");
            }
        }
    }

    public static int[][] getMatrix2x(int n) {
        int[][] matrix = new int[n][n];
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -n + rnd.nextInt(n + n + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        return matrix;
    }
}
