package by.bsu.tasks.entityOperation;

import by.bsu.tasks.entity.Polinom;
import by.bsu.tasks.exception.NullDenominatorException;

public class ArrayPolinomOperation {
    public static Polinom sumArray(Polinom[] array) throws NullDenominatorException {
        Polinom sum = null;
        Polinom temp = null;
        if (array.length > 0) {
            sum = new Polinom(array[0].getPoly());
            for (int i = 1; i < array.length; i++) {
                sum = PolinomOperation.sum(sum, array[i]);
            }
        }
        return sum;
    }

    public static String toString(Polinom[] pArr) throws NullDenominatorException {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < pArr.length; i++) {
            res.append(pArr[i]);
            res.append("\n");
        }
        return res.toString();
    }
}
