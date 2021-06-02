package com.interviewprograms;

public class ConvertStringToChar {
    public void allCharacterExample(String str1)
    {
        int stringLength = str1.length();
        for (int i = 0; i<stringLength; i++)
        {
            char ch1 = str1.charAt(i);
            System.out.print(ch1);

        }
    }
    public static void main(String[] args) {
        ConvertStringToChar chr = new ConvertStringToChar();
        chr.allCharacterExample("David Smith");
        String str = "Robin";
        char ch = str.charAt(0);
        System.out.println( "\n"+"Character at 1st place "+ch);
    }
}
