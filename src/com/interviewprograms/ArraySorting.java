package com.interviewprograms;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {10,15,45,5,40};
        int arrayLength = array.length;
        System.out.println("Array length is "+arrayLength);
        Arrays.sort(array);
        for(int i=0; i<arrayLength;i++)
        {
            System.out.println("Sorted Array Values are"+array[i]);
        }
    }
}
