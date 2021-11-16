package com.example.chaptertwo;
import java.util.Scanner;

public class InputCollector {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter the number of bottles: ");
        Integer bottles = keyboardInput.nextInt();
        System.out.print("Please enter the price per bottle: ");
        Double price = keyboardInput.nextDouble();
    }
}
