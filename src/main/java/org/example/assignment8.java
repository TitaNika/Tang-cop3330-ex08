/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment8 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = scan.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = scan.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = scan.nextInt();

        int total = pizzas * slices;
        System.out.println(people +" people with "+pizzas+" pizzas ("+total+ " slices)");

        int quotient=total/people;
        System.out.println("Each person gets "+quotient+" pieces of pizza.");

        int remainder=total%people;
        System.out.println("There are "+remainder+" leftover pieces.");
    }
}