package LabTask1;
import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
            System.out.println("Enter a number: ");
            Scanner cin = new Scanner(System.in);
            int num = cin.nextInt();
            System.out.println( "The exponential growth of " + num + " is " + Math.exp(num));
        }
}
