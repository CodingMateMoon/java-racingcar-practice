package racingcar;

public class ValidationUtil {

    public static final int MIN = 0;
    public static final int MAX = 9;

    public static boolean checkValidation(int input) {
        return MIN <= input && input <= MAX;
    }

    public static boolean checkCarNameLimitOk(String input) {
        return input.length() <= 5;
    }
}
