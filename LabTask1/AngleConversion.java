package LabTask1;

public class AngleConversion {
    public static void main(String[] args) {
        System.out.println("Enter a number to convert an angle from degrees to radians: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("The angle in radians is: " + radians);
        System.out.println("Enter a number to convert an radians from to convert degrees: ");
        double radians2 = scanner.nextDouble();
        double degrees2 =Math.toDegrees(radians2);
        System.out.println("The angle in degrees is: " + degrees2);
    }
}
