//package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] n) {
        n=new Scanner(System.in).next().split("\\+");
        Arrays.sort(n);
        System.out.print(String.join("+",n));




    }
}
