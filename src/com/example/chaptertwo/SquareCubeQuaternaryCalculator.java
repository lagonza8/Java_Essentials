package com.example.chaptertwo;
import javax.swing.JOptionPane;
import java.math.BigDecimal;


public class SquareCubeQuaternaryCalculator {

    public static void main(String[] args) {

        String in = JOptionPane.showInputDialog("Please enter a value: ");
        Double value = Double.parseDouble(in);
        BigDecimal valueSquared = BigDecimal.valueOf(Math.pow(value, 2.0));
        BigDecimal valueCubed = BigDecimal.valueOf(Math.pow(value, 3.0));
        BigDecimal valueFourth = BigDecimal.valueOf(Math.pow(value, 4.0));

        JOptionPane.showMessageDialog(null, "Value squared: " + valueSquared);
        JOptionPane.showMessageDialog(null, "Value cubed: " + valueCubed);
        JOptionPane.showMessageDialog(null, "Value to the fourth: " + valueFourth);

    }
}
