package org.revature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the A value :");
        int a = in.nextInt();
        System.out.println("Enter the B value :");
        int b = in.nextInt();
        in.nextLine();
        System.out.println("Choose any one operation add, mul, sub, div :");
        String op = in.nextLine();

        FunctionalInterface func = (i, j, ope) -> {
            System.out.println("The Result of the operation " +ope+ ":");
            switch (ope.toLowerCase()) {
                case "add" -> System.out.println(i + j);
                case "sub" -> System.out.println(i - j);
                case "mul" -> System.out.println(i * j);
                case "div" -> System.out.println(i / j);
            }
        };

        func.operation(a,b,op);

    }
}