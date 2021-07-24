package com.javachamp;
import java.util.Scanner;
public class IfElseConditionals {
    public static void main(String[] args) {
        System.out.println("Enter your income: ");
        Scanner scn = new Scanner(System.in);
        double income = scn.nextDouble();
        if( income<250000) {
            System.out.println("You don't need to pay tax");
        }
        else if(income >=250000 && income <=500000){
            double posttax = income - (income * (5/100.0));
            System.out.println(posttax);
        }
        else if(income >500000 && income <=1000000) {
            double posttax = income - (income * (10/100.0));
            System.out.println(posttax);
        }
        else
        {
            double posttax = income - (income * (20/100.0));
            System.out.println(posttax);
        }

    }


}
