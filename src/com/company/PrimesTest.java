package com.company;

import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class PrimesTest {

    @org.junit.Test
    public void isPrime() {
        assertTrue(Primes.isPrime(3));
        assertTrue(Primes.isPrime(18041));
        assertTrue(Primes.isPrime(26141));
    }

    @org.junit.Test
    public void factorize64(){
        List<Integer> factors64 = Primes.factorize(64);
        assertThat(factors64, containsInAnyOrder(2,2,2,2,2,2));
    }

    @org.junit.Test
    public void factorize798(){
        List<Integer> factors = Primes.factorize(798);
        assertThat(factors, containsInAnyOrder(2,3,7,19));
    }
}