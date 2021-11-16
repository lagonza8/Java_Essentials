package com.example.chaptertwo;

public class MathematicalMethods {
    public static void main(String[] args) {

        double total = 9.99, tax = 0.90;

        double balance = total + tax;
        int dollars = (int) balance;
        int dollars2 = (int) (total + tax);
        long dollarsRounded = Math.round(balance); // long data type needed in case the argument is a float
        // cast it back to an int if you want
        int rounded = (int) Math.round(dollarsRounded);
        System.out.println("Casting a float to an int, you'll lose the fractional part. $9.99 + $0.90 = " + dollars);
        System.out.println("Casting an expression version of the previous = " + dollars2);

        Integer x = 0;
        Double squareRt = Math.sqrt(x);

        Double y = 5.902, z = 12409.790;
        Double pow = Math.pow(y, z);

        Double trigAddition = Math.sin(Math.PI/2.0) + Math.cos(x) + Math.tan(Math.PI/4.0);
        System.out.println("sin pi/2 + cos(0) + tan pi/4 = " + trigAddition);

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

        /*
         * Use the way you score fights to keep track of parenthesis balancing
         * Start at value 1 with the first opening bracket, subtract 1 when you encounter a closing bracket
         * If the count drops below zero, or the count does not equal zero at the end you have unbalance
         */
    }
}



