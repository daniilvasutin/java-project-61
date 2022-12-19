package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int getRandomNumberTo(int range) {

        Random r = new Random();
        return r.nextInt(range);
    }
}
