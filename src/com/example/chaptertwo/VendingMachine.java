package com.example.chaptertwo;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final Integer PENNIES_PER_DOLLAR = 100;
        final Integer PENNIES_PER_QUARTER = 25;

        System.out.print("Enter bill value: ");
        Integer billValue = in.nextInt();
        System.out.print("Enter item price in pennies: ");
        Integer itemPrice = in.nextInt();

        // compute the change due using integer division and modulus operator
        Integer changeDue = (billValue * PENNIES_PER_DOLLAR) - itemPrice;
        Integer dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        Integer quarters = changeDue / PENNIES_PER_QUARTER;

        //print change due
        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters:     %6d", quarters);
        System.out.println();
    }
}
