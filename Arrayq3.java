package com.example.simplejavalabs_blue;

public class Arrayq3 {
    public static void main(String args[]){
        int input[] =new int[5];

        input[0]=22;
        input[1]=13;
        input[2]=38;
        input[3]=44;
        input[4]=33;

        for (int count=0;count<input.length;count++){
            if (input[count]>34){
                System.out.println(input[count]);
            }
        }
    }
}
