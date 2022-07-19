package racingcar;

import java.util.Random;

public class NumberGenerator {
    public static int generateRandomNumber() {
        return new Random().nextInt(10);
    }
}
