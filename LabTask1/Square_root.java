package LabTask1;
import java.util.Scanner;
import java.math.*;
public class Square_root {
    public static void main(String[] arg){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numebr: ");
        double a;
        a = cin.nextDouble();
        System.out.println("The square root value of the number is: " + Math.sqrt(a));
    }
}
