package com.example.chapterthree;

import java.util.Scanner;

public class ElevatorSimulation {
    public static void main(String[] args) {

        /*Remeber that floor 13 will not be an option to elevator users*/
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        Integer floor = in.nextInt();

        Integer actualFloor;

        if (floor < 13) {
            actualFloor = floor;
        } else
            actualFloor = floor - 1;

        System.out.println("The elevator travels to actual floor " + actualFloor);

        System.out.print("Floor: ");
        floor = in.nextInt();
        System.out.println("The elevator travels to actual floor " + (floor > 13 ? (floor - 1) : floor));

//        Scanner repeatScanner = new Scanner(System.in);
//        String input = "";
//        Integer floorLoop;
//        while (true) {
//            System.out.print("Floor: ");
//            floorLoop = repeatScanner.nextInt();
//            if (floor < 13)
//                actualFloor = floorLoop;
//            else
//                actualFloor = floorLoop - 1;
//            System.out.println("The elevator travels to actual floor " + actualFloor);
//        }


    }
}
