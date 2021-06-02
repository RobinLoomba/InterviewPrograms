package com.basicprograms;

import java.util.Scanner;

public class GetSetIntValues {
    private int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number1) {
        if (number1 < 0 || number1 > 10) {
            throw new IllegalArgumentException();
        }
        this.number = number1;
    }

    public static void main(String[] args) {
        GetSetIntValues gs = new GetSetIntValues();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        gs.setNumber(num);
        System.out.println(gs.getNumber());
    }
}
