package com.example.chaptertwo;

public class VerifyString {

    public static void main(String[] args) {
        String name = "Adrian";
        Character start = name.charAt(0); // returns a char, not a string
        Character last = name.charAt((name.length()) - 1);
        if(start == 'A' && last == 'n'){
            System.out.println("Success!");
        }
        String sub = name.substring(0, 5);
        sub = name.substring(1, 4);
        System.out.println(sub); // it is obvious that .substring() returns a string, not a char
        System.out.println(name.substring(0));
        System.out.println(name.substring(2));

        name = "Luis " + name + " Gonzalez";
        System.out.println(name.substring(0, 1)); // returns String containing one char
        System.out.println(name.substring(name.length() - 1));
        // returns a string, the string is made up of just one char, the last char of the name

        System.out.println("Hello".substring(2,4));
    }

}
