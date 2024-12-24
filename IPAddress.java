package XFifthPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        System.out.println(isIPAddress("011.168.11.113"));
        System.out.println(isIPAddress("152.121.111.111"));
        System.out.println(isIPAddress("1"));
    }

    public static boolean isIPAddress(String text) {
        Pattern pattern = Pattern.compile("(?:1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]).(?:1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])." +
                "(?:1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]).(?:1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
