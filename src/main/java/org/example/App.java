package org.example;
import java.lang.Math;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main( String[] args )
    {
        double principal;
        double rateInput;
        double rate;
        double interest;
        int numYears;
        int numTimesCompounded;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        principal = sc.nextDouble();

        System.out.print("What is the rate? ");
        rateInput = sc.nextDouble();
        rate = rateInput/100;

        System.out.print("What is the number of years? ");
        numYears = sc.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        numTimesCompounded = sc.nextInt();

        interest = principal * Math.pow((1 + (rate/numTimesCompounded)), (numTimesCompounded * numYears));

        System.out.printf("$%.2f invested at %f%% for %d years compounded %d times per year is $%.2f.", principal, rateInput, numYears, numTimesCompounded, interest);

        sc.close();
    }
}
