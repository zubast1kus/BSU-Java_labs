package by.bsu.tasks.entityOperation;

import by.bsu.tasks.entity.Fraction;
import by.bsu.tasks.entity.Polinom;
import by.bsu.tasks.exception.NullDenominatorException;

import java.util.Map;
import java.util.TreeMap;

public class PolinomOperation {
    public static Polinom sum(Polinom p1, Polinom p2) throws NullDenominatorException {
        TreeMap<Integer, Fraction> sum = new TreeMap<Integer, Fraction>(p1.getPoly());
        for (Map.Entry<Integer, Fraction> item : p2.getPoly().entrySet()) {

            Integer key = item.getKey();
            if (sum.containsKey(key)) {
                sum.put(key, FractionalOperations.sum(p1.getPoly().get(key), p2.getPoly().get(key)));
            } else {
                sum.put(key, item.getValue());
            }
        }
        return new Polinom(sum);
    }

}
