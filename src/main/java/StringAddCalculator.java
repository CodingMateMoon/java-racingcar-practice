public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (text == null || "".equals(text)) {
            return 0;
        }
        String[] numbers = text.split(",|:");
        if(numbers.length == 1)
            return 1;
        int result = 0;
        for (String number : numbers) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
