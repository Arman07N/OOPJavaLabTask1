package LabTask1;
import java.util.Scanner;
import java.math.*;
public class Calc_absulate {
     public static void main(String[] arg){
          System.out.println("Give an integer");

          Scanner cin = new Scanner(System.in);
          int a;
          a = cin.nextInt();
          System.out.println("Absulate value of the int is: "+ Math.abs(a));
     }

}
