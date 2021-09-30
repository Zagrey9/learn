package com.company;

public class Main {


    public static boolean isSquare(int x) {
        int n = (int) Math.sqrt(x);
        int r = n * n;
        return r == x;

    }

    public static void main(String[] args) {
        int x = 17;
        if (isSquare(x)) System.out.println("Полный квардрат");

        else System.out.println("Неполный квардрат");


    }
}
