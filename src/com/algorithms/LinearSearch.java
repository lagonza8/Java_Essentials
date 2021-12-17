/**
 * This program provides one implementation of the linear search algorithm and demonstrates it.
 *
 * @author Gonzalez
 * @version 1.0
 */
package com.algorithms;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class LinearSearch {

    public static boolean find(int target, int[] pool) {
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {4, 45, 8, 1, 3, 3, 22, 9, 13};
        int target;

        System.out.println("What is the target number?");
        //JOptionPane.showInputDialog("What is the target number?");
        target = scanner.nextInt();
        if (find(target, data)) {
            System.out.println("Found.");
        } else {
            System.out.println("Missing.");
        }

    }
}
