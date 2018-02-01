package net.ed.mylibrary;

public class Series {

    /**
     * nSum(int n) method returns the sum of all numbers from 0 to n
     * @param n
     * @return
     */
    public static long nSum(int n) {
        return (n * (n + 1)) /2;
    }


    /**
     * factorial(int n) returns the product of all numbers from 1 to n
     * @param n
     * @return
     */
    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        long fact = 1;
        for (int i=1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

}
