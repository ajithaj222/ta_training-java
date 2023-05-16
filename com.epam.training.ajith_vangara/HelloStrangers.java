package com.epam.training.ajith_vangara;
import java.io.IOException;
import java.util.Scanner;
public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0)
        {
            System.out.println("Oh, it looks like there is no one here");
        }
        if(n<0)
        {
            System.out.println("Seriously? Why so negative?");
        }
        String a[]=new String[n+1];
                       for(int i=0;i<=n;i++)
                       {
                            a[i]=s.nextLine();
                       }
                       for(int j=1;j<=n;j++)
                       {
                           System.out.println("Hello, "+a[j]);
                       }
    
                      
        
    }
}
