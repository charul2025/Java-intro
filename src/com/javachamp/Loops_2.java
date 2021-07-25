package com.javachamp;
import java.util.Scanner;
public class Loops_2 {
    public static void main(String[] args) {
        // first n odd numbers:
        System.out.println("How many 1st odd numbers you want");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("First " + n + " odd numbers are ");
        for(int i = 0; i<n; i++){
        System.out.println((i*2+1));
        }
    }
}
