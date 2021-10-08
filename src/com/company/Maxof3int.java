package com.company;
import java.util.Scanner;
import java.util.*;
import java.lang.Integer;
public class Maxof3int {
        public static void main(String[] args) {
            int max = 0;
            String compareTo;
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = myObj.nextInt();
            System.out.println("first number: " + a);
            System.out.println("Enter the second number");
            int b = myObj.nextInt();
            System.out.println("second number: " + b);
            System.out.println("Enter the third number");
            int c = myObj.nextInt();
            System.out.println("third number: " + c);

            if (a.compareTo(max) >b)
            max = a ;
            System.out.println("max: " + c);
            if(a.compareTo(c));
            max = a;
            System.out.println("max: " + c);
            if (b.compareTo(a));
            max = b;
            System.out.println("max: " + c);
            if (b.compareTo(c));
            max = b;
            System.out.println("max: " + c);
            if (c.compareTo(a));
            max =c;
            System.out.println("max: " + c);
            if(c.compareTo(b));
            max = c;
            System.out.println("max: " + c);
        }
}
