package com.epam.training.ajith_vangara;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h=seconds/3600;
        int mm=(seconds%3600)/60;
        int ss=seconds%60;
        if(h>23)
        {
            h=0;
        }
        System.out.printf("%d:%02d:%02d",h,mm,ss);
    }
}

