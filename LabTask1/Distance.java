package LabTask1;
import java.util.Scanner;
public class Distance {public static void main(String[] arg){
    System.out.println("Here are two cordinates, A(x, y) and B(a, b)");
    Scanner cin = new Scanner(System.in);
        System.out.println("Enter A(x, y) and B(a, b): ");
    int x = cin.nextInt();
    int y = cin.nextInt();
    int a = cin.nextInt();
    int b = cin.nextInt();
    double distance = Math.sqrt(Math.abs(Math.pow(x, 2) - Math.pow(a, 2 ))) + Math.abs((Math.pow(y, 2) - Math.pow(b, 2)));
        System.out.println("The distance between A and B is " + distance);
}
}
