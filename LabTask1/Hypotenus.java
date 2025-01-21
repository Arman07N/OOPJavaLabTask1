package LabTask1;
import java.util.Scanner;

public class Hypotenus {


        public static void main(String[] args) {
            System.out.println("Now we find the hypotenuse of a right triangle: ");
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter the length of the first side: ");
            double side1 = cin.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double side2 = cin.nextDouble();

            System.out.println("The hypotenuse is " + Math.hypot(side1, side2));

        }
}
