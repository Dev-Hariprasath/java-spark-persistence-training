package org.revature.FunctionStyles;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Abi", "Hari", "Pranathi", "Maran", "Dhivya", "Ram");
        Functions func = new Functions(names);


        //Function Styles
        func.getnameStartsWithVowel();
        func.printUsingForeach();
        func.getMaxLenWord();
        func.getnameUppercase();
      }

}
