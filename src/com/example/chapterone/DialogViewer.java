package com.example.chapterone;
import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, LUis!");
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");

    }
}
