package LabTask3;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Splitting the sentence into words
        String[] words = sentence.split(" "); // Splitting by spaces
        System.out.println("Number of words: " + words.length);
    }
}
