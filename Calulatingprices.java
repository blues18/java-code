package com.example.simplejavalabs_blue;
import java.util.Scanner;

//Derrick Lim(7) Q4
public class Calulatingprices {
    public static int IPad_calulation(int input1){
        int Total = input1*1000;
        return Total;

    }public static void main(String[] Args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the number of ipads you wish to purchased");
        int IPad = input1.nextInt();

        System.out.println("the Total cost of the ipads is $"+IPad_calulation(IPad));

    }
}
