package com.company;

public class Main {


    ppublic static void isSquare(int[] array) {
        for (int i : array) {
            System.out.println(isSquare(i) ? i + " Полный квадрат" : i + " Неполный квадрат");
        }
    }

    public static boolean isSquare(int x) {
        if (Math.sqrt(x) % 1 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 9, 16, 18, 26, 36, 40, 100};
        isSquare(array);
    }
}
