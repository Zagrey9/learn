package com.company;

class Main {
    public static void func (){

        double x = 10;
        double a = Math.toRadians(x);
        double sin=  Math.sin(a);
        double cos = Math.cos(a);
        System.out.println(Math.cos(a)+Math.sin(a));
    }


        public static void main (String[]args){


            for ( int i=1; i<10; i++)
                System.out.println(Math.cos(i)+Math.sin(i));



        }
    }
