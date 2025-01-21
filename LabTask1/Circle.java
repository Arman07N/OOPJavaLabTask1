package LabTask1;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radios of the circle: ");
        Scanner cin = new Scanner(System.in);
        double radius  =cin.nextDouble();
        double pi = Math.PI;
        double area  = pi*radius*radius;
        System.out.println("The area of the circle is " + area + ".");
    }
}
