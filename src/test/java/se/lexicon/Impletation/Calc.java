package se.lexicon.Impletation;

import se.lexicon.Interfaces.DoubleOperator;

public class Calc implements DoubleOperator {

    @Override
    public Double apply(Double a, Double b) {
        return a+b;
    }
}
