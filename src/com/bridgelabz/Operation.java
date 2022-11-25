package com.bridgelabz;

import java.util.Scanner;

public class Operation {

    Stack.Node top = null;

    void push(Scanner sc) {

        System.out.print("Enter data: ");
        int data = sc.nextInt();
        Stack.Node newNode = new Stack.Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    void display() {
        Stack.Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}