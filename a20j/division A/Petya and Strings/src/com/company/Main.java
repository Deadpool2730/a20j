//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String aL = a.toLowerCase();
        String bL = b.toLowerCase();
        if(aL.compareTo(bL)>0){
            System.out.println("1");
        }else if (aL.compareTo(bL)<0){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }

    }
}
