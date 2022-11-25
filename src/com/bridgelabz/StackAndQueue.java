package com.bridgelabz;

import java.util.Scanner;

public class StackAndQueue {

    public static void main(String[] args) {

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        while (choice != 4) {
            System.out.println("Chose one from the below options ");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.push(sc);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exit the program");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please Enter valid choice ");
            }
        }
    }
}