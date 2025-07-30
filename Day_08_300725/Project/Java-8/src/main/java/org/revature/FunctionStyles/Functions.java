package org.revature.FunctionStyles;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Functions {

    List<String> names;

    public Functions(List<String> names){
        this.names = names;
    }

    // Find Name start with vowels
    public void getnameStartsWithVowel(){
        System.out.println("Name Start with vowel using Filter :");
        List<String> nameStartsWithVowel = names
                .stream()
                .filter(e -> {
                    List<Character> ch = Arrays.asList('a', 'e', 'i', 'o', 'u');
                    return ch.contains(Character.toLowerCase(e.charAt(0)));
                }).toList();
        System.out.println(nameStartsWithVowel);
        System.out.println();

    }


    //Convert the Name into uppercase
    public void getnameUppercase(){
        System.out.println("The Name Converted to Uppercase using Map :");
        List<String> nameUppercase = names
                .stream()
                .map( name -> name.toUpperCase())
                .toList();
        System.out.println(nameUppercase);
        System.out.println();

    }


    //ForEach Method to print the value
    public void printUsingForeach(){
        System.out.println("The Employee name list are printed using ForEach :");
        names.stream().forEach(name -> System.out.print(name + " - "));
        System.out.println();
        System.out.println();

    }


    //Return the Max Length Word
    public void getMaxLenWord(){
        System.out.println("Return the Max length word using Reduce");
        Optional<String> word = names.stream()
                .reduce((word1, word2) ->
                        word1.length() > word2.length() ? word1 : word2);
        System.out.println("The Max Length word is " +word.get());
        System.out.println();

    }

}
