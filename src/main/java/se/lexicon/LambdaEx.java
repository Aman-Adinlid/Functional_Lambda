package se.lexicon;

import se.lexicon.Interfaces.*;

import java.util.Random;

public class LambdaEx {

    public static String DoStringStuff(String s1, String s2, DoStringStuff operator) {
        return operator.operator(s1, s2);

    }

    public static Double calcOperator(Double a, Double b, DoubleOperator operator) {
        return operator.apply(a, b);
    }

    public static void main(String[] args) {
        DoStringStuff GetBiggestString = (str1, str2) ->str1.length() >= str2.length() ? str1:str2;

        System.out.println(GetBiggestString.operator("ABS","LDSJDD"));

        DoStringStuff concatenate = (s1,s2) -> s1.concat(" ").concat(s2);
        System.out.println(concatenate.operator("Aman","Adam"));

        System.out.println(DoStringStuff("Hi","Lambda",concatenate));
        System.out.println(DoStringStuff("Hi","Lambda", GetBiggestString));

        DoubleOperator Addition =(a, b) -> a+b;
        DoubleOperator Subtraction = (a, b) -> a-b;
        DoubleOperator Division = (a, b) -> a/b;

        System.out.println(Addition.apply(12d,23d));
        System.out.println(Subtraction.apply(23d,12d));
        System.out.println(Division.apply(12D,78D));

        Printer printer = (String message) -> System.out.println(message);
        printer.print("Hi Lambda");

        Conditional positiveNum = n -> n > 0;
        System.out.println(positiveNum.testInt(12));
        System.out.println(positiveNum.testInt(-56));

        IntRandom rng = () ->  new Random().nextInt();
        System.out.println(rng.generate());


    }
}
