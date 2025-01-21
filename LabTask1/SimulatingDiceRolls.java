package LabTask1;
import java.util.Random;
public class SimulatingDiceRolls {
    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(6, 100);

        System.out.println("The number rolled is " + num);

    }
}
