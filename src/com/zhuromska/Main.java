package com.zhuromska;

import java.util.Scanner;

/**
 * Class for generating custom fibonacci sequence based on constructor
 *
 * @author Solomiia Zhuromska
 * @see <a href = "https://drive.google.com/file/d/1zjaumRvz5AN2LzjvY-_bXmX3FgenXAJP/view"/><font color="#008080">Laba 1</font>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of range(inclusively):  ");
        int startRange = sc.nextInt();
        System.out.print("Enter the end of range(inclusively):  ");
        int endRange = sc.nextInt();
        System.out.print("Enter the length:  ");
        int length = sc.nextInt();
        Numbers example = new Numbers(startRange, endRange, length);
        example.printOddAndEvenNumbers();
        example.fibonacci();
        example.printSumOfEven();
        example.printSumOfOdd();
        example.percentEven();
        example.percentOdd();
    }
}
