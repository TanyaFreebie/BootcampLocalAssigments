package com.company.August31th;


import java.util.Scanner;

public class FirstPartBoolean {

    private static Scanner scanner = new Scanner(System.in);

    public static void firstTask(){
        System.out.println("enter first number: \t");
        int a = scanner.nextInt();
        System.out.println("enter second number: \t");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(" Is " + a + " equal to " + b + "? " + (a==b) );
        System.out.println(" Is " + a + "  less than " + b + "? " + (a<b) );
        System.out.println(" Is " + a + " less or equal to " + b + "? " + (a<=b) );
        System.out.println(" Is " + a + "  greater than " + b + "? " + (a>b) );
        System.out.println(" Is " + a + " greater or equal to " + b + "? " + (a>=b) );
    }

    public  static void secondTask(){
        System.out.println("enter true or false: \t");
        String a = scanner.next();
        System.out.println("enter true or false: \t");
        String b = scanner.next();
        scanner.close();

        System.out.println(" Is " + a + " equal to " + b + "? " + (a.equals(b)) );
    }

    public static  void thirdTask(){
        System.out.println("enter second number: \t");
        int b = scanner.nextInt();
        scanner.close();
        boolean even = b%2 ==0;
        System.out.println("Is number even? " + even);
    }

    public static void fourthTask(){
        System.out.println("enter second number: \t");
        int b = scanner.nextInt();
        scanner.close();
        boolean odd = b%2 !=0;
        System.out.println("Is number odd? " + odd);

    }

    public static  void fifthTask(){
        System.out.println("enter true or false: \t");
        String b = scanner.next();
        scanner.close();
        String a = " ";
        if(b.equals("true")){
            a = "false";
        } else{ a= "true";}

        System.out.println(b + " is " + a );

    }

    public static void sixTask(){
    System.out.println("enter first number: \t");
        int a = scanner.nextInt();
        System.out.println("enter second number: \t");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(a+ " and " + b + " are equal? " +(a==b));
        System.out.println( a+ " is less than 0 and " +b + " is greater than 0?" +(a<0 && b>0));
        System.out.println((a> 100& b>100));

    }
}
