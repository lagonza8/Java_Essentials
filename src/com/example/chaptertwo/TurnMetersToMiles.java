package com.example.chaptertwo;
import javax.swing.JOptionPane;
public class TurnMetersToMiles {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a value in meters: ");
        Double value = Double.parseDouble(input);
        // conversions used
        final Double TO_INCHES = (1.0/0.0254);
        Double inchesInitial = (value * TO_INCHES);

        System.out.println(value + " meters = " + inchesInitial + " inches in length.");




    }
}
