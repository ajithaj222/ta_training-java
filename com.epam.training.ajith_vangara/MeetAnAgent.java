package com.epam.training.ajith_vangara;
import java.util.*;
public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==PASSWORD)
        {
            System.out.println("Hello, Agent");
        }
        else
        {
            System.out.println("Access denied");
        }
        
    }
}
