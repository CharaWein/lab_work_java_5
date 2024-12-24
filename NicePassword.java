package XFifthPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NicePassword {
    public static void main(String[] args) {
        System.out.println(isNicePassword("12345678Aas"));
        System.out.println(isNicePassword("AasA"));
        System.out.println(isNicePassword("156Aa1"));
        System.out.println(isNicePassword("1234AasA1@"));
    }

    public static boolean isNicePassword(String password) {
        Pattern pattern = Pattern.compile("\\b(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,16}\\b");
        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()){
            System.out.println("Пароль неверен:");
            Pattern pattern_0 = Pattern.compile("\\b(?=.*[A-Z])\\b");
            Matcher matcher_0 = pattern_0.matcher(password);
            if(!matcher_0.lookingAt()){
                System.out.println("Нет заглавных букв\n");
            }
            Pattern pattern_1 = Pattern.compile("\\b(?=.*[0-9])\\b");
            Matcher matcher_1 = pattern_1.matcher(password);
            if(!matcher_1.lookingAt()){
                System.out.println("Нет цифр\n");
            }
            Pattern pattern_2 = Pattern.compile("[a-zA-Z0-9]{8,16}");
            Matcher matcher_2 = pattern_2.matcher(password);
            if(!matcher_2.lookingAt()){
                System.out.println("Пароль должен быть от 8 до 16 символов\n");
            }
            Pattern pattern_3 = Pattern.compile("\\b![a-zA-Z0-9]{8,16}\\b");
            Matcher matcher_3 = pattern_3.matcher(password);
            if(!matcher_3.lookingAt()){
                System.out.println("Использованы не цифры и не буквы\n");
            }
        }
        return matcher.matches();
    }
}
