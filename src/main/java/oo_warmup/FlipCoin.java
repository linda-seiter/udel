package oo_warmup;

import java.util.ArrayList;
import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        ArrayList<String> coinFlips = new ArrayList<>();
        Random rand = new Random();
        int numHeads = 0;

        while (numHeads < 3) {
            if (rand.nextBoolean()) {
                numHeads++;
                coinFlips.add("Heads");
            }
            else {
                coinFlips.add("Tails");
            }
        }

        //print all coin flips
        System.out.println("Total number of coin flips:" + coinFlips.size());
        System.out.println(coinFlips);

    }
}

