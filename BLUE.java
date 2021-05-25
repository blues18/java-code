package com.example.simplejavalabs_blue;

public class BLUE {
    public static void main(String[] args){
        int a =10;
        int b = 20;

        System.out.println("a == b " + (a==b));
        System.out.println("a != b " + (a!=b));
        System.out.println("a > b "+(a > b));
        System.out.println("a < b " + (a < b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a <= b " + (a <= b));
        System.out.println((a++)+ " a++");
        System.out.println("A++ " + (++a));

        boolean C = true;
        boolean D  = false;

        System.out.println("a && b " + (C && D));
        System.out.println("a || b " + (C || D));
        System.out.println("!a && b " + !(C& D));

        double E = 0; //assignment operators
        E = a + b;
        System.out.println("E = a + b " + E);
        E += a;
        System.out.println("E += a " + E);
        E /= a;
        System.out.println("E /= a " + E);
        E%=a;
        System.out.println("E%= a " + E);
        E*=a;
        System.out.println("E *= a " + E);

    }

}

