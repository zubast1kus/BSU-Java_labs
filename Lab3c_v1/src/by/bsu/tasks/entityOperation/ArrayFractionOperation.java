package by.bsu.tasks.entityOperation;

import by.bsu.tasks.entity.Fraction;
import by.bsu.tasks.exception.NullDenominatorException;

public class ArrayFractionOperation {
    public static void changeEvenElement(Fraction[] array) throws NullDenominatorException {
        int i = 0;
        while ((i + 1) < array.length) {
            array[i] = FractionalOperations.sum(array[i], array[i + 1]);
            i = i + 2;
        }
    }
}
