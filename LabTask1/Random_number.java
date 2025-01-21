package LabTask1;
import java.util.Random;
import java.util.Scanner;
public class Random_number {
 public static void main(String[] arg){
     System.out.println("Here we find the random value of a number in range: ");
     System.out.println("Enter first number: ");
     Scanner cin = new Scanner(System.in);
     int num, num2;
     num = (int) cin.nextDouble();
     System.out.println("Enter second number: ");
     num2 = (int) cin.nextDouble();

     System.out.println("The random value of between num1 and num2 is: " + Math.random()*((num2-num)+num));
     Random unknown= new Random();
     System.out.println(unknown.nextInt(num2-num)+ num);
 }
}
