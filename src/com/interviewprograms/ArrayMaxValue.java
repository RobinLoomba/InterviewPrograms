package com.interviewprograms;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] array = {10,15,45,5,40,89};
        int arrayLength = array.length;
        System.out.println("Array length is "+arrayLength);
        int maxValue = array[0];
        for(int i=1;i<arrayLength;i++)
        {
            if (maxValue<array[i])
            {
                maxValue = array[i];

            }
        }
        System.out.println("Largest value is "+maxValue);
    }
}