package XFifthPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class UpperAfterLower {
    public static void main(String[] args) {
        System.out.println(IsUpperAfterLower("AndrewWeinmaier"));
        System.out.println(IsUpperAfterLower("CharaDreemurr"));
        System.out.println(IsUpperAfterLower("TobyFox"));
        System.out.println(IsUpperAfterLower("AlExEyIsAlIvE!"));
        System.out.println(IsUpperAfterLower("fiatiustitia,etpereatmundus"));
        System.out.println(IsUpperAfterLower("SecondWorldWar"));

    }

    public static String IsUpperAfterLower(String text) {
        Pattern pattern = Pattern.compile("([a-z][A-Z])");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, "!" + matcher.group(1) + "!");
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
