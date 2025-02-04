package LabTask3;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str1).contains(str2);
    }
}

