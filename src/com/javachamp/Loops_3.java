package com.javachamp;
import java.util.Scanner;
public class Loops_3 {
    public static void main(String[] args) {
        // m natural number in reverse order
       System.out.println("Please write your number from which you want to start reverse order:");
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        System.out.println("first " + m + " natural numbers in reverse order:");
        for(int i = m; i != 0; i--) {
            System.out.println(i);
        }
    }
}
