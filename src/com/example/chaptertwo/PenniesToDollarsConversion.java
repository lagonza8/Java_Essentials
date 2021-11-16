package com.example.chaptertwo;

public class PenniesToDollarsConversion {
    public static void main(String[] args){
        final int penniesSaved = 1729;
        int dollars = penniesSaved / 100;
        int cents = penniesSaved % 100;
        System.out.println("You saved " + penniesSaved + " pennies, which equivalent to $" + dollars + "." + cents + ", great job saving!");

        System.out.println("To get the last digit of n, use n % 10: " + penniesSaved%10);
        System.out.println("To remove the last digit, use n/10 : " + penniesSaved/10);
        System.out.println("To remove the last two digits of n, use n/100 : " + penniesSaved/100);
        System.out.println("To remove the last three digits of n, use n/1000 : " + penniesSaved/1000);
        System.out.println("To get the fractional part, divide by a float value, like n/10.0 : " + penniesSaved/10.0);
        System.out.println("To check for even-ness/odd-ness, use %2, as in n%2 = 0 when n is even, 1 when n is odd. For example " + penniesSaved + " % 2 = " + penniesSaved%2);
        System.out.println("Negative remainders exist as well, as in -1729 % 10 = " + -(penniesSaved)%10);
    }
}
