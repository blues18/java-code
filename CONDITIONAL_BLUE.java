package com.example.simplejavalabs_blue;
import java.util.Scanner;
import java.lang.String;

public class CONDITIONAL_BLUE {
    public static void main(String[] arge) {
        double marks;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score ");
        marks =input.nextDouble();

        //int marks = Integer.parseInt(input);

        if (marks < 49){
            System.out.println(" You have failed");
        }
        else if (marks >= 50 && marks <= 59) {
            System.out.println("your Scored is D");
        }
        else if (marks >= 60 && marks <= 69) {
            System.out.println("your scored is C");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.println("your scored is B");
        }
        else {
            System.out.println("Your Score is A");
        }
    }
}

