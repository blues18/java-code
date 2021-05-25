package com.example.simplejavalabs_blue;
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class COMTq1 {
    public static void main(String args[]){
        double first_input, second_input;
        System.out.println("Enter the first input");
        Scanner Interger1 = new Scanner(System.in);
        first_input = Interger1.nextDouble();

        System.out.println("Enter the Second input");
        Scanner Interger2 = new Scanner(System.in);
        second_input = Interger2.nextDouble();

        if (first_input > second_input){
            System.out.println("The first input is bigger thatn second input " + first_input);
        }else
            System.out.println(" The second input is bigger than first input " + second_input);
    }
}
