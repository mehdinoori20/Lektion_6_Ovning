package com.Mehdi.demo;

import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Försökte dividera med 0. Det är inte tillåtet!");
        }
    }

    public static void divideByZero() {
        int numerator = 10;
        int denominator = 0;

        int result = numerator / denominator;

        System.out.println("Resultatet av divisionen är: " + result);

              /*  // Krascha programmet med en oändlig for-loop
                for (;;) {
                    System.out.println("Detta är en oändlig loop!");
                }

                // Krascha programmet med en if-sats
                if (true) {
                    while (true) {
                        System.out.println("Detta är en oändlig loop!");
                    }
                }

                // Krascha programmet med extra måsvingar och parenteser
                if (true) {{
                    System.out.println("Detta är en konstig kod med extra måsvingar och parenteser!");
                }}

               */

        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Försökte dividera med 0. Det är inte tillåtet!");
        }

        // Krascha programmet med en oändlig for-loop (omskriven med try-catch)
        try {
            for (; ; ) {
                System.out.println("Detta är en oändlig loop!");
            }
        } catch (Exception e) {
            System.out.println("Fångade ett undantag i oändlig for-loop.");
        }

        // Krascha programmet med en if-sats (omskriven med try-catch)
        try {
            if (true) {
                while (true) {
                    System.out.println("Detta är en oändlig loop!");
                }
            }
        } catch (Exception e) {
            System.out.println("Fångade ett undantag i oändlig if-sats.");
        }

        // Krascha programmet med extra måsvingar och parenteser (omskriven med try-catch)
        try {
            if (true) {
                {
                    System.out.println("Detta är en konstig kod med extra måsvingar och parenteser!");
                }
            }
        } catch (Exception e) {
            System.out.println("Fångade ett undantag i koden med extra måsvingar och parenteser.");
        }


            for (int i = 0; i < 10; i++) {
                System.out.println("Värde: " + i);
            }
        }
    }



