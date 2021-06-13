package com.interviewprograms;

import java.util.Scanner;

public class Fibonacci {
    public void calculateFibonacci(int number)
    {
        int maxNum = number;
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.println("Get fibonacci series of number "+maxNum);
        for(int i = 1 ; i<= maxNum ; ++i);
        {
            System.out.println(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }

    public static void main(String[] args) {
        Fibonacci cf = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        cf.calculateFibonacci(inputNum);
    }
}
