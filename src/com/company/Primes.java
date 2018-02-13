package com.company;

import java.util.ArrayList;
import java.util.List;

public class Primes {


    public static boolean isPrime(int n) {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) / 2; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int modulo = n % i;
            if (isPrime(i) && (modulo == 0)) {
                factors.add(i);
                n /= i;
                i = 1;
            }
        }
        return factors;
    }
}
