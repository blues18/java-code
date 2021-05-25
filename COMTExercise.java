package com.example.simplejavalabs_blue;
import java.util.Scanner;
//Derrick lim (7) Q1
public class COMTExercise {
    public static void main(String[] args){

        int First_number,Second_number,Third_number,Com , Smallest;//Com is to check the whcih of the first two input is the smallest
        Scanner Input1 = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        Scanner Input3 = new Scanner(System.in);


        System.out.println("Enter the first digits ");
        First_number = Input1.nextInt();
        System.out.println("First number input " + First_number);

        System.out.println("Enter the Second digits ");
        Second_number = Input2.nextInt();
        System.out.println("The Second number is " + Second_number);

        System.out.println("Enter the Third digits ");
        Third_number = Input3.nextInt();
        System.out.println("The third number input is " + Third_number);
        //Comparing First and Second

       if (First_number < Second_number){
           System.out.println("The smallest number   " + First_number);
       }
       else if (Second_number < Third_number){
           System.out.println("The smallest number   " + Second_number);
       }
       else if (Third_number < First_number){
           System.out.println("The Smallest number  "+ Third_number);
       }
    }
}
