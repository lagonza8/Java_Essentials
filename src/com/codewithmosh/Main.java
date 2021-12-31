package com.codewithmosh;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // byte data type is used when integer's may take up more memory when its not needed
        int age = 30;               // int range: about [-2B, 2B]
        short shortAge = 30;        // 2 bytes, range [-32K, 32K]
        byte byteAge = 30;          // byte values range from -128 - +127, appropriate for most age values

        // you can use underscore in place of a comma for larger values
        long viewsCount = 123456789;
        long viewsCount2 = 123_456_789;
        /*
         java interprets both values above as integer data types even though they were declared as "long" data type
         it's because they are still within the valid range of being a value represented by int data type
        */
        long viewsCount3 = 3_123_456_789L; // valid, used to exceed int value ranges

        float price = 10.99F;
        // interpreted as a double without the format specifier and would give compilation error

        char letter = 'A';

        boolean isEligible = false;

        Date now = new Date();
        System.out.print("Passing a Date object's .getTime() method to the print statement: ");
        System.out.println(now.getTime());

        System.out.print("Passing a Date object to the print statement: ");
        System.out.println(now);


        byte x = 1;
        byte y = x; // both variables store the value 1 at this point, each in separate memory locations

        x = 2; // you would think this would update both variables, but it doesn't
        System.out.println(y); // displays the value 1

        /*
         the assignment x = 2; only updates one memory location, the address that contains variable x
         variable y was declared/assigned already, the other change does not affect it.
        */

        Point point1 = new Point(1, 1);
        Point point2 = point1; // instance variables store the reference in memory to the Object it represents.

        point1.x = 2;
        System.out.println(point2);
        /*
         reference types are copied by their reference
         primitive types are referenced by their value
        */


        String message = new String("Hello world." + "!@!"); // valid, but redundant
        String shortMessage = "Hello world.";
        String untrimmedMessage = "    Hello world   !!   ";

        System.out.println(message.endsWith("!"));
        System.out.println(shortMessage.length());
        System.out.println(message.indexOf("H"));

        // Strings are immutable objects in Java, when you modify a string, a new string is created and returned
        System.out.println(shortMessage.replace(".", "!"));

        // And we can check that modification of original did not happen by reprinting our original message string
        System.out.println(shortMessage);

        System.out.println("Message trim member/method: ");
        System.out.println(untrimmedMessage.trim());

        System.out.print("Hello \"Mosh\", what are you doing here?\n");
        /*
         This is an example of the escape sequence.
         tab, new line, double/single quote, double backslash to represent backslash in string
        */

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); //prints a string representation of the array's memory space
        System.out.println(Arrays.toString(numbers)); // method overloading
        /*
         displays [1, 2, 0, 0, 0]
         any empty values get set to zero in an integer array, to false in a boolean array, and
         in a string array, all uninitialized indices get set to the empty string.
        The Java programming language distinguishes between null and empty strings. An empty string is a string
        instance of zero length, whereas a null string has no value at all. An empty string is represented as "" .
        It is a character sequence of zero characters.
        */

        int[] numbers2 = {2, 3, 5, 1, 4};
        System.out.println(numbers2.length);

        Arrays.sort(numbers2); // will sort, but you still need to display it to confirm
        System.out.println(Arrays.toString(numbers2));

        int[][][] numbers3 = new int[0][0][0];
        System.out.println(Arrays.deepToString(numbers3));

        int[][] twoByTwo = new int[2][2];

        for(int a = 0; a < twoByTwo.length; a++){
            for (int b = 0; b < twoByTwo[a].length; b++) {
                twoByTwo[a][b] = 0;
            }
        }
        System.out.println(Arrays.deepToString(twoByTwo));

        int[][] blank2x2= new int[2][2];
        System.out.println(Arrays.deepToString(blank2x2));
        // uninitialized will be set to all zeros

        int[][][] twoByTwox2 = new int[2][2][2];
        System.out.println(Arrays.deepToString(twoByTwox2));
        System.out.print("arr.length = ");
        System.out.println(twoByTwox2.length);
        System.out.print("arr[i].length = ");
        System.out.println(twoByTwox2[0].length);
        System.out.print("arr[i][j].length = ");
        System.out.println(twoByTwox2[0][0].length);


        int moduloInteger = 1776;
        System.out.print("1776 % 10 returns the last digit in the value... ");
        System.out.println(moduloInteger % 10);


        System.out.print("1776 / 10 will truncate the last digit in the value... ");
        System.out.println(moduloInteger / 10);


        // Augmented or compound assign operators.
        int xyz = 0;
        xyz += 10; // xyz = 10
        xyz *= 10; // xyz = 100
        xyz -= 10; // xyz = 90
        xyz /= 10; // xyz = 9

        System.out.println(xyz);

    }
}
