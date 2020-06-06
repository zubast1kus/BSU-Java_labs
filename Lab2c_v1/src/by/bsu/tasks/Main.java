package by.bsu.tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = InputMatrix.setDimension();
        int[][] matrix = InputMatrix.getMatrix2x(n);
        int k = numberColumn(matrix);
        printMatrix(sortLines(matrix, k));
    }

    private static Integer numberColumn(int[][] matrix) {
        System.out.println("Введите номер столбца, по которому будет производится сортировка.");
        Scanner in = new Scanner(System.in);
        while (true) {
            int k = in.nextInt();
            if (k >= 0 && k < matrix.length) {
                return k;
            } else System.out.println("Неверное значение, попробуйте еще раз.");
        }
    }

    private static int[][] sortLines(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length - 1; ++i) {
            boolean flag = true;
            for (int j = 0; j < matrix.length - 1 - i; ++j) {
                if (matrix[j][k] > matrix[j + 1][k]) {
                    flag = false;
                    for (int l = 0; l < matrix.length; ++l) {
                        int tmp = matrix[j][l];
                        matrix[j][l] = matrix[j + 1][l];
                        matrix[j + 1][l] = tmp;
                    }
                }
            }
            if (flag) {
                break;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Итоговая матрица.");
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(aMatrix[j] + "  ");
            }
            System.out.println("");
        }
    }
}
