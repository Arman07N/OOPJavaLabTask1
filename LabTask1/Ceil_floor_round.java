package LabTask1;
import java.util.Scanner;
import java.math.*;
public class Ceil_floor_round {
    public static void main(String[] arg){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a numeber: ");
        double a;
        a = cin.nextDouble();
        System.out.println("The Ceil of"+ a +" is: " + Math.ceil(a));
        System.out.println("The Round of"+ a +" is: " + Math.round(a));
        System.out.println("The Floor of"+ a +" is: " + Math.floor(a));

    }
}
