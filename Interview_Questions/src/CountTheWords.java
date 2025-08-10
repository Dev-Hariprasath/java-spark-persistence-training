import java.util.Arrays;

public class CountTheWords {
    public static void countWords(String sentence){
        Long count = Arrays.stream(
                sentence.trim().
                        split(" "))
                .count();

        System.out.println("The count of words in a sentence is " +count);
    }

    public static void main(String[] args) {
        countWords("Hi My Name is Hariprasath from cuddalore");
    }
}
