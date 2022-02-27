package com.codewithmosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // byte data type is used when integer's may take up more memory than what is needed
        byte byteAge = 30;          // byte values range from -128 - +127, appropriate for most age values
        short shortAge = 30;        // 2 bytes, range [-32K, 32K]
        int age = 30;               // int range: about [-2B, 2B]

        // you can use underscore in place of a comma for larger values
        long viewsCount = 123456789;
        long viewsCount2 = 123_456_789;
        /*
         java interprets both values above as integer data types even though they were declared as "long" data type
         it's because they are still within the valid range of being a value represented by int data type
        */
        long viewsCount3 = 3_123_456_789L;
        // modifier IS REQUIRED once you assign a value that exceeds the value range for integer variables

        float price = 10.99F;
        // interpreted as a double without the format modifier and would give compilation error otherwise

        char letter = 'A';

        boolean isEligible = false;

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        /*while loops are good when we don't know ahead of time how many process repitions are required*/
//        Scanner repeatScanner = new Scanner(System.in);
//        String input = "";
//        while(true/*!input.equals("quit")*/){
//            System.out.print("Input: ");
//            input = repeatScanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue; /*move control to beginning of loop*/
//            if (input.equals("quit"))
//                break; /*jumps you out of the loop*/
//            /*every infinite loop must have a break statement/termination statement*/
//            System.out.println(input);
//        }

        // This will be executed at least once, then condition is checked
//        do{
//            System.out.print("Input(do-while): ");
//            input = repeatScanner.next().toLowerCase();
//            System.out.println(input);
//        } while(!input.equals("quit"));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        String[] fruits = {"Apples", "Mango", "Oranges"};

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }

        /*Enhanced for loops (For-Each Loops) only iterate in a forward direction*/
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Date now = new Date();
        System.out.print("Passing a Date object's .getTime() method result (return value) to the print statement: ");
        System.out.println(now.getTime());
        System.out.println("^^ It certainly has a strange output.");

        System.out.print("Passing a Date object to the print statement: ");
        System.out.println(now + "... ahhh, much better.");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

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

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        String message = new String("Hello world." + "!@!"); // valid, but redundant
        String shortMessage = "Hello world.";
        String untrimmedMessage = "    Hello world   !!   ";

        System.out.println("Does \"Hello world.!@!\" end with \"!\" ?: " + message.endsWith("!"));
        System.out.print("The number of characters in \"Hello world.\" is: ");
        System.out.println(shortMessage.length());
        System.out.print("The letter 'H' in \"Hello world.\" is found at character array index value: ");
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
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i = 1; i <= 5; i++)
            System.out.println("Hello World " + i);

        for(int i = 5; i > 0; i--)
            System.out.println("Hello World " + i);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

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
        System.out.print("length of {2, 3, 5, 1, 4} is: ");
        System.out.println(numbers2.length);

        Arrays.sort(numbers2); // will sort, but you still need to display it to confirm
        System.out.print("sorting the array {2, 3, 5, 1, 4} results in: ");
        System.out.println(Arrays.toString(numbers2));

        int[][][] numbers3 = new int[0][0][0];
        System.out.print("3-D array, all dimensions equal zero, int[0][0][0], results in: ");
        System.out.println(Arrays.deepToString(numbers3));
        /* returns the string representation of the deep contents of the specified Object array. Unlike Arrays.toSt
        ring(), if the array contains other arrays as elements, the string representation includes their contents, and
        so on.
        Source: Geeks To Geeks
        URL: https://www.geeksforgeeks.org/difference-between-arrays-tostring-and-arrays-deeptostring-in-java/
        */

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

        NumberFormat percent = NumberFormat.getPercentInstance(); // abstract class instantiated with a method/member
        String result = percent.format(0.1);
        System.out.println(result);

        // or we can method chain to condense the code above
        String secondResult = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(secondResult);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

//        Scanner ageScanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte ageByte = ageScanner.nextByte();
//        System.out.println("You are " + ageByte);

        /*trim will delete white space before and after the main String*/
//        Scanner nameScanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = nameScanner.nextLine().trim();
//        System.out.println("You are " + name);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        /*This is the mortgage calculator*/
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;
        /*Calculate mortgage payments*/
        double principleAmount_P = 100000.00;
        double rateAnnual_R = 3.92;
        byte years_N = 30;
        /*Not sure of the consequences of initializing the variable above*/
//      Second level
        double convertedRate_r = rateAnnual_R / PERCENT/ MONTHS_IN_A_YEAR;
        double oPR_1_plus_r = (1 + convertedRate_r);
        int numberOfPayments_n = years_N * MONTHS_IN_A_YEAR;
//      Got rid of many magic numbers
        double mortgage = principleAmount_P * ((convertedRate_r*Math.pow(oPR_1_plus_r, numberOfPayments_n))/(Math.pow(oPR_1_plus_r, numberOfPayments_n)-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("You will pay " + mortgageFormatted + " for the mortgage loan.");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

//        Scanner incomeScanner = new Scanner(System.in);
//        System.out.println("Enter your income rounded to nearest dollar amount: ");
//        int income = incomeScanner.nextInt();
//        String className = (income > 100_000) ? "First" : "Economy";
//        System.out.println("You are in " + className + " class. Thank you for flying Mohegan Airlines.");

        System.out.println("\n\n\n\n");



        /*A popular interview question*/
//        Scanner valueScanner = new Scanner(System.in);
//        System.out.print("Enter an integer value :");
//        int valueEntered = valueScanner.nextInt();
//
//        if(((valueEntered % 5) == 0) && ((valueEntered % 3) == 0))
//            System.out.println("FizzBuzz");
//        else if((valueEntered % 5) == 0)
//            System.out.println("Fizz");
//        else if((valueEntered % 3) == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(valueEntered);

        /*Don't Repeat Yourself (D.R.Y.), only when you have to.*/


        /* Part 1 */
        User user = new User("Luis", 31);
        user.name = "Luis";
        System.out.println(user.name);

        /* Part 2 Programming to an interface */
        TaxCalculator calculator = getCalculator(); //getCalc creates our loose coupling
        /* The interface only has one simple method */
        calculator.calculateTax();

        /* Part 3 Encapsulation */
        var account = new Account();
        //account.balance = -1;
        //direct access to state of objects is bad bad bad

        //we want indirect access only, we need to be explicit when we change states
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        System.out.println("\n\n"); //three new lines total

        /* Part 4 Abstraction */
        var mailService = new MailService();
        // send email is method that calls other methods encapsulated in that class

        mailService.sendEmail(); // but as long as this method signature doesn't change


        /* Part 5 Inheritance */
        // TextBox, Button, CheckBox, etc... must inherit the following common behaviors
        // enable(), focus(), setPosition()

        var textBox = new TextBox();
        textBox.enable();
    }
    /* Part 2.1 */
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
