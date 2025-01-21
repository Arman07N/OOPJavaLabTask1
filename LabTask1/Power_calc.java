package LabTask1;
import java.util.Scanner;
import java.math.*;
public class Power_calc {
    public static void main(String[] arg){

        Scanner cin = new Scanner(System.in);
        double a, b;
        System.out.println("Enter a numebr: ");
        a = cin.nextDouble();
        System.out.println("Enter a power of this numebr: ");
        b = cin.nextDouble();
        System.out.println("The absolute power of " +  a +" is: " + Math.pow(a, b));
    }
}
