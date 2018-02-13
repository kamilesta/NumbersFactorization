package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int number = 64;
        List<Integer> factors = Primes.factorize(number);
        System.out.println("Number " + number + " has " + factors.size() + " prime factors: ");
        for (int factor : factors){
            System.out.print("\t" + factor);
        }
    }
}
