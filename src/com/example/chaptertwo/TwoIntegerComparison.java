package com.example.chaptertwo;
import javax.swing.JOptionPane;

public class TwoIntegerComparison {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Please enter two integer values for comparison.");
        String firstValue = JOptionPane.showInputDialog("Enter the first integer: ");
        Integer value1 = Integer.parseInt(firstValue);
        String secondValue = JOptionPane.showInputDialog("Enter the second integer: ");
        Integer value2 = Integer.parseInt(secondValue);

        JOptionPane.showMessageDialog(null,
                "Their sum is: " + (value1 + value2));
        JOptionPane.showMessageDialog(null,
                "Their difference is: " + (value1 - value2));
        JOptionPane.showMessageDialog(null,
                "Their product is: " + (value1 * value2));
        JOptionPane.showMessageDialog(null,
                "Their average is: " + ((value1 + value2)/2.0));
        JOptionPane.showMessageDialog(null,
                "Their distance is: " + (Math.abs((value1 - value2))));

        JOptionPane.showMessageDialog(null,
                "The larger value is: " + (Math.max(value1, value2)));
        JOptionPane.showMessageDialog(null,
                "The smaller value is: " + (Math.min(value1, value2)));

        System.out.printf("Sum: ");
        System.out.printf(" ");
        System.out.printf(" ");
        System.out.printf(" ");
        System.out.printf(" ");
        System.out.printf(" ");
        System.out.printf(" ");

        /**
         * Sum: 45
         * Difference: -5
         * Product: 500
         * Average: 22.50
         * Distance: 5
         * Maximum: 25
         * Minimum: 20
         */
    }
}
