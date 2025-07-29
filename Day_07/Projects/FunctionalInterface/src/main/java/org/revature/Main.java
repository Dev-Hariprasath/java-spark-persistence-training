package org.revature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the A value :");
        int a = in.nextInt();
        System.out.println("Enter the B value :");
        int b = in.nextInt();
        System.out.println("Choose one operation :");
        String op = in.nextLine();


        FunctionalInterface func = (i, j, ope) ->{
          if(ope.equals("+")){
              System.out.println(a + b);
          }
        };

    }
}