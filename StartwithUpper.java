package XFifthPack;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartwithUpper {
    public static void main(String[] args) {
        String text = "this is a text with upper words";
        String[] result = startWithSymb(text, 't');
        for (String word : result) {
            System.out.println(word);
        }
    }

    public static String[] startWithSymb(String text, char symbol) {
        ArrayList<String> result = new ArrayList<String>();
        Pattern pattern = Pattern.compile("\\b" + symbol + "\\w*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result.toArray(new String[result.size()]);
    }
}
