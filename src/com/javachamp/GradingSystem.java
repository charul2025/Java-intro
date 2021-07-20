package com.javachamp;
// "static void main" must be defined in a public class.
public class GradingSystem {
    public static void main(String[] args) {
        int marks = 45;

        if (marks > 90)
        {
            System.out.println("Excellent");
        }
        else if (marks > 80 && marks <=90 )
        {
            System.out.println(" Good ");
        }
        else if( marks > 70 && marks <= 80 )
        {
            System.out.println(" Fair ");
        }
        else if( marks > 60  && marks <= 70 )
        {
            System.out.println(" Meets expectation ");
        }
        else
        {
            System.out.println(" Below average ");
        }
    }
}