package LabTask1;
import java.util.Scanner;
import java.math.*;
public class Find_max_min{
        public static void main(String[] args) {
            System.out.println("Give Two integers");
            int a;
            int b;
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter 1st Number : ");
            a= cin.nextInt();
            System.out.println("Enter 2nd Number : ");
            b = cin.nextInt();
            System.out.println("Maximum of the two numbers is: " + Math.max(a, b));
            System.out.println("Minimum of the two numbers is: " + Math.min(a, b));
        }
    }

