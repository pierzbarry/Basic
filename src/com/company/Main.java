package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter integer:");

        double add = key.nextInt() + 5;
        double multiply = add * 2;
        double integer = multiply - 7;

        System.out.println(integer);
    }
}
