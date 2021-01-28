package se.lexicon.Impletation;

import se.lexicon.Interfaces.DoStringStuff;

public class StringOperator implements DoStringStuff {

    @Override
    public String operator(String s1, String s2) {
        return s1.concat(" ").concat(s2);
    }
}
