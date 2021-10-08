package com.company;

import java.util.Scanner;

public class Maxof3strings {
        public static void main(String[] args) {
            int max = 0;
            String compareTo;
            String a = "Apple";
            String b = "Peach";
            String c =  "Banana";


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


