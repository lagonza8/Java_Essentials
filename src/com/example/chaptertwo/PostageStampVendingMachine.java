package com.example.chaptertwo;
import javax.swing.JOptionPane;

public class PostageStampVendingMachine {
    public static void main(String[] args) {
        // Ask the user for current price of 1st class stamps in pennies, parse the answer
        String firstClass = JOptionPane.showInputDialog("Enter the price of 1st class postage stamps (in pennies): ");
        Integer pricePerStamp = Integer.parseInt(firstClass);
        JOptionPane.showMessageDialog(null, "Price: " + pricePerStamp);

        // we can use integer division and modulus to get the number of stamps purchased and change in penny stamps
        Integer dollars, firstClassStamps, change;

        String unitProvided = JOptionPane.showInputDialog("Enter payment denomination (bill/note value): ");
        dollars = Integer.parseInt(unitProvided);
        Integer payment = dollars * 100;

        firstClassStamps = payment / pricePerStamp;
        change = (payment - (firstClassStamps * pricePerStamp));

        System.out.printf("First class stamps: %6d%n", firstClassStamps);
        System.out.printf("Penny stamps:       %6d%n", change);

        JOptionPane.showMessageDialog(null, "First class stamps: " + firstClassStamps);
        JOptionPane.showMessageDialog(null, "Penny stamps: " + change);
    }
}
