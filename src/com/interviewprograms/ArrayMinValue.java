package com.interviewprograms;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] array = {10,5,18,40};
        int arrayLength = array.length;
        int minValue = array[0];
        for(int i = 1;i<arrayLength;i++)
        {
            if(minValue>array[i])
            {
                minValue = array[i];
            }
        }
        System.out.println("Minimum value is "+minValue);



    }
}
