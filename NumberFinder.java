package XFifthPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "This 1is a text with numbers 12@34 and 56.78 asa 1232121";
        findNumber(text);
    }

    public static void findNumber(String text) {
        Pattern pattern = Pattern.compile("\\d\\d*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
