package it.develhope;

import java.util.Scanner;

public class PrintYourAgeFromInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert your age [integer]:");
        int age = input.nextInt();
        System.out.printf("Your age is %d years old.", age);

        input.close();

    }

}
