//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String low = c.toLowerCase();
        String lower = "";
        for (int i = 0;i<c.length();i++){
            if (low.charAt(i)!='a' && low.charAt(i)!='e' && low.charAt(i)!='i' && low.charAt(i) != 'y' && low.charAt(i)!='o' && low.charAt(i)!='u'){
                lower = lower + "."+ low.charAt(i);
            }
        }

        System.out.println(lower);

    }
}
