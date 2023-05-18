package com.epam.training.ajith_vangara;
import java.util.*;
public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if((b*i)%a==0)
            {
                c=i;
                break;
            }
        }
        System.out.println(c);
    }
}
