package org.revature.evenNumber;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,11);
        System.out.println("The Number List : ");
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream().filter( n -> n % 2 == 0).toList();
        System.out.println("The Even Numbers Are :");
        System.out.println(evenNumbers);
    }
}
