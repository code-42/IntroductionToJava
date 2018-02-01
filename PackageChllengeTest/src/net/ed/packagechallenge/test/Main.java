package net.ed.packagechallenge.test;

import net.ed.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        for(int i=0; i <=10; i++) {
            System.out.println("nSum(" + i + ") == " + Series.nSum(i));
        }
        
        System.out.println("\n*****************************\n");

        for(int i=0; i<=10; i++) {
            System.out.println("factorial(" + i + ") == " + Series.factorial(i));
        }

        System.out.println("\n*****************************\n");

        for(int i=0; i<=10; i++) {
            System.out.println("fibonacci(" + i + ") == " + Series.fibonacci(i));
        }

    }
}
