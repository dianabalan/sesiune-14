package collections.exercises.words;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

    public static void main(String[] args) {
        Set<String> uniqueWords = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String word;

        do{
            word = scanner.nextLine();
            uniqueWords.add(word);
        }
        while (!word.equals("exit"));

        System.out.println(uniqueWords);
    }
}
