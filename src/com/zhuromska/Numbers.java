package com.zhuromska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Numbers {

    private final int start;
    private final int end;
    private final int length;

    List<Integer> odd = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> fib = new ArrayList<>();

    /**
     * Constructor with parameters
     *
     * @param start
     * @param end
     * @param length start  - start  of defined range (inclusively)
     *               end - end of range (inclusively)
     *               length - length of fibonacci sequence
     */
    Numbers(int start, int end, int length) {
        this.start = start;
        this.end = end;
        this.length = length;
    }

    /**
     * Fill arraylists for odd numbers in a ascending order and for even numbers in descending order
     * and prints this arraylists
     */
    public void printOddAndEvenNumbers() {
        StringBuilder evenNum = new StringBuilder("All even numbers in ascending order: ");
        StringBuilder oddNum = new StringBuilder("All odd numbers in descending order: ");
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0) {
                even.add(i);
            } else odd.add(i);
        }
        Collections.sort(odd);
        evenNum.append(even).append(",").append("\b ");
        System.out.println(evenNum);
        oddNum.append(odd).append(",").append("\b ");
        System.out.println(oddNum);
    }

    /**
     * Calculates and prints the sum of odd numbers
     */
    public void printSumOfOdd() {
        int sum = 0;
        for (Integer x : odd) {
            sum += x;
        }
        System.out.println("The sum of odd " + sum);
    }

    /**
     * Calculates and prints the sum of even numbers
     */
    public void printSumOfEven() {
        int sum = 0;
        for (Integer x : even) {
            sum += x;
        }
        System.out.println("The sum of even " + sum);
    }

    /**
     * Creates and prints fibonacci sequence starts with the biggest even and odd numbers within users length
     */
    public void fibonacci() {

        StringBuilder fibSeq = new StringBuilder("Users Fibonacci sequence: ");
        fib.add(odd.get(odd.size() - 1));
        int a = odd.get(odd.size() - 1);
        int b = even.get(0);
        for (int i = 1; i < length; i++) {
            b = b + (a);
            a = b - (a);
            fib.add(a);
        }
        fibSeq.append(fib).append(",").append("\b");
        System.out.println(fibSeq);
    }

    /**
     * Calculates and prints percent of odd numbers in users fibonacci sequence
     */
    public void percentOdd() {

        int count = 0;
        for (Integer x : fib) {
            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println("Percent of odd numbers:  " + (double) count / fib.size() * 100 + " %");
    }

    /**
     * Calculates and prints percent of even numbers in users fibonacci sequence
     */
    public void percentEven() {
        int count = 0;
        for (Integer x : fib) {
            if (x % 2 != 0) {
                count++;
            }
        }
        System.out.println("Percent of even numbers:  " + (double) count / fib.size() * 100 + " %");
    }
}
