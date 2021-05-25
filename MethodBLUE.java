package com.example.simplejavalabs_blue;
import java.util.Scanner;

public class MethodBLUE {
    public static double calulateArea(double A, double B) {
        double Area = A * B;
        return Area;
    }
    public static double calulateperimeter(double A, double B, double C){
        double perimeter = A + B + C;
        return perimeter;
    }
    public static boolean equilateral(double A, double B , double C){
        boolean Same = (A==B)&&(B==C)&&(C==A);
        return Same;
    }
    public static void main(String arge[]){
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the length A");
        double lengths = A.nextDouble();

        Scanner B = new Scanner(System.in);
        System.out.println("Enter the breaths B");
        double breaths = B.nextDouble();

        Scanner C = new Scanner(System.in);
        System.out.println("Enter C");
        double line_C = C.nextDouble();

        System.out.println("the Area is " +calulateArea(lengths , breaths) + "Cm Sqaured " );
        System.out.println("The perimeter of the triangle is " + calulateperimeter(lengths, breaths , line_C) + "Cm");
        System.out.println("The equilateral of the triangle is " + equilateral(lengths,breaths, line_C ));
        }
    }


