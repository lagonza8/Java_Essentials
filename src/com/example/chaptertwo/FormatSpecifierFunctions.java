package com.example.chaptertwo;

public class FormatSpecifierFunctions {
    public static void main(String[] args) {
        Integer twentyFour = 24;
        Double var = 1.21997;

        System.out.printf("standard integer: %d%n", twentyFour);
        System.out.printf("right justified: %5d%n", twentyFour);
        System.out.printf("standard floating-point: %f%n", var);
        System.out.printf("2 digit precision: %.2f%n", var);
        System.out.printf("right justified, truncated floating-point: %7.2f%n", var);
        System.out.printf("standard simultaneous: a) %d    b) %f%n", twentyFour, var);

    }
}
