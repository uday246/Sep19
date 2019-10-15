package Sep6th;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String choice = "Y";
        int num, right = 0, wrong = 0, highestRandom = 0, lowestRandom = 11;
        do {
            int randomInt = 2 * (random.nextInt(5) + 1);
            System.out.print("What is half of " + randomInt + "? ");
            num = scanner.nextInt();
            System.out.println("You answered: " + num);
            if (num == (randomInt / 2)) {
                System.out.println("Correct!");
                right++;
            } else {
                System.out.println("Wrong!");
                wrong++;
            }
            if (randomInt > highestRandom) {

                highestRandom = randomInt;
            }
            if (randomInt < lowestRandom) {
                lowestRandom = randomInt;
            }
            System.out.print("Another number? ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("Y"));
        System.out.println("Game over");
        double percentage = ((double) right / (right + wrong)) * 100;
        int percentageInteger = (int) percentage;
        System.out.println("You answered " + (right + wrong) + " questions");
        System.out.println(right + " were right");
        System.out.println(wrong + " were wrong");
        System.out.println("You got " + percentageInteger + "% right");
        System.out.println("The highest random number you were given: "
                + highestRandom);
        System.out.println("The lowest random number you were given: "
                + lowestRandom);
    }

}