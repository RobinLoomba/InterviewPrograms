package com.interviewprograms;

public class TraverseArray
{
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 20;
        array[1] = 30;
        array[2] = 10;
        array[3] = 25;
        for(int i = 0 ; i< array.length; i++)
        {
            System.out.println("Array elements are "+array[i]);
        }
    }
}
