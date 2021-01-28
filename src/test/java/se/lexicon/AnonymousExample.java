package se.lexicon;

import se.lexicon.Interfaces.DoStringStuff;
import se.lexicon.Interfaces.DoubleOperator;

public class AnonymousExample {

    static DoStringStuff getBiggestString = new DoStringStuff() {
        @Override
        public String operator(String s1, String s2) {
            return s1.length() >= s2.length() ? s1:s2;
        }
    };

    static DoStringStuff concat = new DoStringStuff() {
        @Override
        public String operator(String s1, String s2) {
            return s1.concat(" ").concat(s2);
        }
    };
    static DoubleOperator addition = new DoubleOperator() {
        @Override
        public Double apply(Double a, Double b) {
            return a + b;
        }
    };
    static DoubleOperator subtraction = new DoubleOperator() {
        @Override
        public Double apply(Double a, Double b) {
            return a - b;
        }
    };
    public static String DoStringStuff(String s1,String s2,DoStringStuff operator){
    return operator.operator(s1,s2);

}

public static Double calcOperator(Double a, Double b, DoubleOperator operator){
        return operator.apply(a,b);
}

    public static void main(String[] args) {
        System.out.println(getBiggestString.operator("agh","kjj"));
        System.out.println(concat.operator("AMAN","Adam"));
        System.out.println(addition.apply(12d,32d));
        System.out.println(subtraction.apply(23d,12d));

        String result = DoStringStuff("Aman", "Adam", new DoStringStuff() {
            @Override
            public String operator(String s1, String s2) {
                return s1.concat(" ").concat(s2);
            }
        });
        System.out.println("result = " + result);
        
        double additionRes = calcOperator(200d,23d,addition );
        System.out.println("additionRes = " + additionRes);
        
        double subtractionRes = calcOperator(12d,10d, subtraction);
        System.out.println("subtractionRes = " + subtractionRes);
        
        
    }

}
