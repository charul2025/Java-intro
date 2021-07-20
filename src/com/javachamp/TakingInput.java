package com.javachamp;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        System.out.println("what is your name.");
        String name = scn.nextLine();
        System.out.println("you want table of: ");
        int n = Integer.parseInt( scn.nextLine());
        System.out.println( "Dear "+ name + ". Here is table of "+n+": ");
        for(int i=0;i<10;i++)
            System.out.println(n+(i)*n);
}
}
