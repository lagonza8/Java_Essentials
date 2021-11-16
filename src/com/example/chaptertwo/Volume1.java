package com.example.chaptertwo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Volume1 {

    public static void main(String[] args) {
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355;    // lITERS IN A 12-ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;

        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");

        final double BOTTLE_VOLUME = 2; // Two-liter bottle

        totalVolume = totalVolume + BOTTLE_VOLUME;

        System.out.print("A six-pack and a two-liter bottle contain ");
        System.out.print(totalVolume);
        System.out.println(" liters.");

        int bottlesPerCase = 8;

        double unitPricePerBottle = 4.35;
        double bottlesPurchased = 100;

        double totalPurchasePrice = unitPricePerBottle * bottlesPurchased;
        System.out.println(totalPurchasePrice); // prints 434.99999999999994
        /*
        * Be careful with rounding errors
        * We can avoid this by using a special class from the math package library
        * */

        BigDecimal price = new BigDecimal("4.35");
        BigDecimal quantity = new BigDecimal("100");
        System.out.println(price.multiply(quantity));

        BigInteger oneHundred = new BigInteger("100");
        BigInteger fiftyMillion = new BigInteger("50000000");
        System.out.println(oneHundred.multiply(fiftyMillion)); // prints 5 Billion

        System.out.println("Max Integer value is capped at a signed 4 bytes: " + Integer.MAX_VALUE);
    }
}
