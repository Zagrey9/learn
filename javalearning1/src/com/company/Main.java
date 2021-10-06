package com.company;

public class Main {

    public static boolean isSquare(int[] array) {
        for (int i : array) {
            System.out.println(isSquare(i) ? i + " Полный квадрат" : i + " Неполный квадрат");
        }
        return false;
    }

    public static boolean isSquare(int x) {
        int n = (int) Math.sqrt(x);
        int r = n*n;
        return r == x;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 9, 16, 18, 26, 36, 40, 100};
        isSquare(array);
        if (isSquare(array)) System.out.println("Неверно");

    }
}
