package se.lexicon;

import se.lexicon.Impletation.Calc;
import se.lexicon.Impletation.StringOperator;
import se.lexicon.Interfaces.DoStringStuff;
import se.lexicon.Interfaces.DoubleOperator;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        StringOperator concatter = new StringOperator();
        String FirstName = "Aman";
        String LastName = "Adam";
        String FullName = concatter.operator(FirstName,LastName);
        System.out.println("FullName =" + FullName);

        System.out.println("________________________________");
        Calc calc = new Calc();
        double result = calc.apply(30d,10d);
        System.out.println("addition: " +  result);

        System.out.println("__________________________________");
        DoStringStuff getBiggestString = new DoStringStuff() {
            @Override
            public String operator(String s1, String s2) {
                return s1.length() >= s2.length() ? s1:s2;
            }
        };

        DoStringStuff concat = new DoStringStuff() {
            @Override
            public String operator(String s1, String s2) {
                return s1.concat(" ").concat(s2);

            }
        };
        System.out.println("GetBiggestString: " + getBiggestString.operator("Adcv","Anmb"));
        System.out.println("fullName: "+ concat.operator("Aman","Svensson"));
        DoubleOperator addition = new DoubleOperator() {
            @Override
            public Double apply(Double a, Double b) {
                return a  +b;
            }
        };
        DoubleOperator subtraction = new DoubleOperator() {
            @Override
            public Double apply(Double a, Double b) {
                return a - b;
            }
        };
        System.out.println("Addition: " + addition.apply(3d,6d));
        System.out.println("Subtraction: " + subtraction.apply(200d,5d));

    }
}
