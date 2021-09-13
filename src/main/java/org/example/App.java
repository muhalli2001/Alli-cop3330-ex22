package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int largestnum;
        //a
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = scan.nextInt();
        //b
        Scanner can = new Scanner(System.in);
        System.out.println("Enter number 2");
        int b = can.nextInt();
        //c
        Scanner an = new Scanner(System.in);
        System.out.println("Enter number 3 ");
        int c = an.nextInt();
        //if a=b o b=c o a=c return
        if(a==b || a==c || b==c){System.out.println("Numbers cannot be equal");return;}

        //my little algorithm
        if(a>b&&a>c){largestnum = a;}
        else if(b>c){largestnum = b;}
        else largestnum = c;

        System.out.println("The largest number is: "+largestnum);

    }
}