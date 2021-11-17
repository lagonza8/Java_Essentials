package com.example.chaptertwo;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class LetterSizeConversion {
    public static void main(String[] args) {

        // standard letter size is 8.5 x 11 inches
        // There are 25.4 mm per inch
        final Double mmPerInch = 25.4;
        Double widthPaperInches = 8.5;
        Double lengthPaperInches = 11.0;

        showMessageDialog(null, "Dimensions in mm: " + widthPaperInches*mmPerInch + "mm by " + lengthPaperInches*mmPerInch + " mm.");
    }
}
