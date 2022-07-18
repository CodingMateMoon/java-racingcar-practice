import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (text == null || "".equals(text)) {
            return 0;
        }

        Integer customDelimeterResult = processCustomDelimeter(text);
        if (customDelimeterResult != null) return customDelimeterResult;
        
        String[] tokens = text.split(",|:");
        if(tokens.length == 1)
            return 1;

        int result = 0;
        result = calculateInput(tokens);
        return result;
    }

    private static int calculateInput(String[] tokens) throws IllegalArgumentException {
        int result = 0;
        for (String number : tokens) {
            int input= Integer.parseInt(number);
            if (input < 0)
                throw new IllegalArgumentException();
            result += input;
        }
        return result;
    }

    private static Integer processCustomDelimeter(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDellimiter = m.group(1);
            String[] tokens = m.group(2).split((customDellimiter));
            return  calculateInput(tokens);
        }
        return null;
    }
}
