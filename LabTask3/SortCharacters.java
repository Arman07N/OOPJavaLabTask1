package LabTask3;
import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        Arrays.sort(characters);

        String sortedString = new String(characters);
        System.out.println("Sorted String: " + sortedString);
    }
}

