package com.training.ajith_vangara;
import java.util.*;
public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // feet climbed during the day
        int b = scanner.nextInt(); // feet slid down during the night
        if(a<0)
        {
            System.out.println("Bill total amount cannot be negative");
        }
        else if(b<=0)
        {
            System.out.println("Number of friends cannot be negative or zero");
        }
        else
        {
            int p=((a/100)*10);
            int c=((p+a)/b);
            System.out.println(c);
        }
    }
}

