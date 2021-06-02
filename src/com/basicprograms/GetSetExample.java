package com.basicprograms;

import java.util.Scanner;

public class GetSetExample {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String strName) {
        this.name = strName;
    }

    public static void main(String[] args) {
        GetSetExample obj = new GetSetExample();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Entered Name");
        obj.setName(str1);
        System.out.println(obj.getName());

    }
}
