package com.interviewprograms;

import java.util.Scanner;

public class ReverseStringUsingChar
{
     public  void reverseStringUsingChar(String str)
    {
        int strlength = str.length();
        for (int i = strlength-1; i>-1;i--)
        {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
    public static void reverseStringUsingCharArray(String str)
    {
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
         ReverseStringUsingChar rv = new ReverseStringUsingChar();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter text that you want to reverse");
        String text = sc.nextLine();
        rv.reverseStringUsingChar(text);
        System.out.println("Enter text that you want to reverse 2");
         String text1 = sc.nextLine();
         ReverseStringUsingChar.reverseStringUsingCharArray(text1);
    }
}
