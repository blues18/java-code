package com.example.simplejavalabs_blue;

//Derrick lim  ARRAY Part2 Q3
public class Array {
    public static void main(String[] args) {

        int Input[] = new int[8];

        Input[0] = 55;
        Input[1] = 24;
        Input[2] = 65;
        Input[3] = 41;
        Input[4] = 13;
        Input[5] = 22;
        Input[6] = 76;
        Input[7] = 90;

        for (int Count = 0; Count<Input.length; Count++){
            if (Input[Count] >= 55){
                System.out.println(Input[Count]);
            }
        }
    }
}
