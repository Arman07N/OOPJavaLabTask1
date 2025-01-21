package LabTask1;
import java.util.Scanner;
public class Trigonometry {
    public static void main(String[] arg){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a degree: ");
        double a;
        a= cin.nextDouble();
        System.out.println("The sine value of a is: "+Math.sin(a) );
        System.out.println("The cosine value of a is: "+Math.cos(a) );
        System.out.println("The tangent value of a is: "+Math.tan(a) );
        System.out.println("The radians value of a is: "+Math.toRadians(a) );

    }
}
