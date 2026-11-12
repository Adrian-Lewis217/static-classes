package com.pluralsight;

import java.util.Scanner;

public class NameFormattingFactory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String prefix;
        String firstName;
        String middleName;
        String lastName;
        String suffix;
        boolean run = true;

        while(true) {
            System.out.print("What is your first name: ");
            firstName = input.nextLine();

            System.out.print("What is your last name: ");
            lastName = input.nextLine();

            if (!firstName.isEmpty() && !lastName.isEmpty()) {
                continue;
            } else {
                System.out.println("Please enter your full name");
                String fullName = input.nextLine();

                // call format method
            }

            System.out.print("What is your middle name: ");
            middleName = input.nextLine();

            System.out.print("What is your prefix: ");
            prefix = input.nextLine();

            System.out.print("What is your suffix: ");
            suffix = input.nextLine();

            run = false;
            input.close();
        }
    }
}
