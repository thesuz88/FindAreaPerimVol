package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double lengthOfRoom = 0;
        double widthOfRoom = 0;
        double heightOfRoom = 0;

            System.out.println("Welcome to Grand Circus' Room Detail Generator!");
            System.out.println(" ");

        while(true) {
        do {
            //User entered length of room
            System.out.print("Enter length of room: ");
            while (!scnr.hasNextDouble()) { //iterates when input is not a valid number
                String input = scnr.next();
                System.out.println(input + " is not a valid number.");
                System.out.print("Enter length of room: ");
            }
            lengthOfRoom = scnr.nextDouble();
            } while (lengthOfRoom < 0); //exits loop when user enters valid positive number

        do {
            //User entered width of room
            System.out.print("Enter width of room: ");
            while (!scnr.hasNextDouble()) {
                String input2 = scnr.next();
                System.out.println(input2 + " is not a valid number.");
                System.out.print("Enter width of room: ");
            }
            widthOfRoom = scnr.nextDouble();
        } while (widthOfRoom < 0);

        do {
            //User entered height of room
            System.out.print("Enter height of room: ");
            while (!scnr.hasNextDouble()) {
                String input3 = scnr.next();
                System.out.println(input3 + "is not a valid number.");
                System.out.print("Enter height of room: ");
            }
            heightOfRoom = scnr.nextDouble();
        } while (heightOfRoom < 0);

                //Takes user input and calculates area and perimeter of room
                double areaOfRoom = lengthOfRoom * widthOfRoom;
                double perimOfRoom = 2 * lengthOfRoom + 2 * widthOfRoom;
                double volOfRoom = lengthOfRoom * widthOfRoom * heightOfRoom;

                //Prints out calculated area, perimeter, and volume and asks user if they would like to continue
                System.out.println("Area: " + areaOfRoom);
                System.out.println("Perimeter: " + perimOfRoom);
                System.out.println("Volume: " + volOfRoom);
                System.out.println(" ");
                System.out.println("Continue? (y/n): ");

                //If user enters "n" loop breaks
                if (scnr.next().equals("n")) {
                    break;
                }
            }

        }



    }

