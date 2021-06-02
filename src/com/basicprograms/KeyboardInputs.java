package com.basicprograms;

import java.util.Scanner;

public class KeyboardInputs
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your NAME");
        String name = input.nextLine();
        System.out.println("Entered name is "+name);
        System.out.println("Enter Digits for Addition");
        int a = input.nextInt();
        int b = input.nextInt();
        int c= a+b;
        System.out.println("Addition of two numbers are"+c);
        input.close();

    }


}
