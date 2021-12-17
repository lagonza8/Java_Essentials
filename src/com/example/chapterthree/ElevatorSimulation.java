package com.example.chapterthree;

import java.util.Scanner;

public class ElevatorSimulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        Integer floor = in.nextInt();

        Integer actualFloor;


        if(floor > 13);

        if (floor > 13) {
            actualFloor = floor - 1;
        } else {
            actualFloor = floor;
        }
        System.out.println("The elevator travels to actual floor " + actualFloor);



    }
}
