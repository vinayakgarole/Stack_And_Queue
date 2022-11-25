package com.bridgelabz;

import java.util.Scanner;

public class StackAndQueue {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();

        do {
            System.out.println("Enter the options:\n1. To push the data\n2. Display the Stack\n3. To exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    operation.push(sc);
                    break;
                case 2:
                    operation.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter invalid input");
                    break;
            }
        } while (choice != 3);
    }
}