package by.bsu.tasks;

import by.bsu.tasks.entity.Fraction;
import by.bsu.tasks.entity.Polinom;
import by.bsu.tasks.entityOperation.ArrayPolinomOperation;
import by.bsu.tasks.exception.NullDenominatorException;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        try {
            Polinom[] pArr = new Polinom[4];

            TreeMap<Integer, Fraction> poly1 = new TreeMap<Integer, Fraction>((Integer i1, Integer i2) -> i2 - i1);
            poly1.put(3, new Fraction(1, 9));
            poly1.put(2, new Fraction(4, 9));
            poly1.put(0, new Fraction(-7, 9));
            // перебор элементов

            pArr[0] = new Polinom(poly1);
            pArr[1] = new Polinom(3, -7, 9, 2, -4, 9, 1, 2, 9, 0, -7, 9);
            pArr[2] = new Polinom(7, -5, 9);
            pArr[3] = new Polinom(3, -1, 9, 0, -5, 9);

            System.out.println("pArr");
            System.out.println(ArrayPolinomOperation.toString(pArr));

            System.out.println("sum");
            System.out.println(ArrayPolinomOperation.sumArray(pArr));
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
