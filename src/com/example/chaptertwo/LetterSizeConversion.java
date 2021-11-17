package com.example.chaptertwo;


import static javax.swing.JOptionPane.*;


public class LetterSizeConversion {
    public static void main(String[] args) {

        // standard letter size is 8.5 x 11 inches
        // There are 25.4 mm per inch
        final Double mmPerInch = 25.4;
        Double widthPaperInches = 8.5;
        Double lengthPaperInches = 11.0;

        showMessageDialog(null,
                "Dimensions in mm: " + widthPaperInches*mmPerInch + "mm by " + lengthPaperInches*mmPerInch + " mm.");

        showMessageDialog(null,
                "Perimeter in mm: " + ((2*widthPaperInches*lengthPaperInches) + (2*lengthPaperInches*mmPerInch)));

        // Find the diagonal length
        // diagonal length is basically Pythagorean theorem
        Double mmWidth = widthPaperInches * mmPerInch;
        Double mmLength = lengthPaperInches * mmPerInch;

        Double widthSquared = Math.pow(mmWidth, 2.0);
        Double lengthSquared = Math.pow(mmLength, 2.0);

        Double additionOfSquares = widthSquared + lengthSquared;

        Double diagonal = Math.sqrt(additionOfSquares);

        showMessageDialog(null,
                "Diagonal length: " + diagonal);

        System.out.println("End of code.");
    }
}
