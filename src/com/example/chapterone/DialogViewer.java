package com.example.chapterone;
import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, LUis!");
        // the second argument can be an expression as long as we have one string in the concatenation expr.

        // show the user the input dialog requirement pane, save their answer, do something useful with it
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");

        // parse the value provided after its requested appropriately
        String priceInput = JOptionPane.showInputDialog("Enter your price: " );
        Double price = Double.parseDouble(priceInput); // static method call, no object/instance needed
        // display the output in a dialog box
        JOptionPane.showMessageDialog(null, "Price entered: " + price);

        JOptionPane.showMessageDialog(null, "Hey there: ");

    }
}
