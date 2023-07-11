package basics;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        flipNHeads(2);
        flipNHeads(3);
    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int flips = 0;
        int headsInARow = 0;

        while (headsInARow < n) {
            flips++;
            float coinFlip = random.nextFloat();

            if (coinFlip > 0.5) {
                System.out.println("heads");
                headsInARow++;
            } else {
                System.out.println("tails");
                headsInARow = 0;
            }

        }
        System.out.println("It took " + flips + " flips to flip " + headsInARow + " head(s) in a row.");
    }
}