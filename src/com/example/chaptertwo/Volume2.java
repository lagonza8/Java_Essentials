package com.example.chaptertwo;
import java.util.Scanner;

public class Volume2 {
    public static void main(String[] args) {

        // Read price per pack
        Scanner inpt = new Scanner(System.in);

        System.out.print("Please enter the price for a six-pack: ");
        Double packPrice = inpt.nextDouble();

        // Read can volume
        System.out.print("Please enter the volume for each can (in ounces): ");
        Double canVolume = inpt.nextDouble();

        // Compute pack volume
        final Double CANS_PER_PACK = 6.0;
        Double packVolume = canVolume * CANS_PER_PACK;

        // Compute and print price per ounce
        Double pricePerOunce = packPrice / packVolume;

        System.out.printf("Price per ounce: %8.2f", pricePerOunce);
        System.out.println();

    }
}
