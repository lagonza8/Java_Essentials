package com.example.chaptertwo;

public class MathematicalMethods {
    public static void main(String[] args) {
        Integer x = 0;
        Double squareRt = Math.sqrt(x);
        Double pow = Math.pow(2, 15);

        Double trigAddition = Math.sin(Math.PI/2.0) + Math.cos(x) + Math.tan(Math.PI/4.0);
        System.out.println(trigAddition);

        Double trigConversions = Math.toDegrees(Math.PI*2);
        // Math.toDegrees(Math.PI*2)
        System.out.println(trigConversions);

        Double eToTheX = Math.exp(x);
        System.out.println(eToTheX);

        Double logNatural = Math.log(1);
        System.out.println(logNatural);

        // log base 10
        // round to closest integer
        // absolute value
        // compare values, find min or find max
    }
}
