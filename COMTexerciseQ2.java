package com.example.simplejavalabs_blue;
import java.util.Scanner;
//Derrick lim (7) Q2
public class COMTexerciseQ2 {
    public static void main(String[] args){

        int Minimum,Maximum;

        System.out.println("Enter the Lower limit :) ");
        Scanner Input1 = new Scanner(System.in);
        Minimum = Input1.nextInt();

        System.out.println("Enter the Upper limit ;) ");
        Scanner Input2 = new Scanner(System.in);
        Maximum = Input2.nextInt();

        for (Minimum = Minimum; Minimum <= Maximum;Minimum ++){
            System.out.println("Count " + Minimum);
        }
    }
}
