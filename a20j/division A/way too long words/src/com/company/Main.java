//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            String word = sc.next();
            String a = "";

            if (word.length()<=10){
                System.out.println(word);
            }else{
                String len = Integer.toString(word.length()-2);
                a = word.substring(0,1)+len+word.substring(word.length()-1);
//
                System.out.println(a);
            }
        }

    }


}
