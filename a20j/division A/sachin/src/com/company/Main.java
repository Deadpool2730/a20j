package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String a = "";
        int i = 0;
        for( i = 0;i<name.length()-1;i+=2){
            if (i<name.length()){
                a = a+name.substring(i,i+2)+".";
            }
        }

        if(i<a.length()){
            a =a + name.charAt(i);
        }

        System.out.println(i);
        System.out.println(a);
    }
}
