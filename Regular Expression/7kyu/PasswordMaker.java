// https://www.codewars.com/kata/5637b03c6be7e01d99000046
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* Regex \b\w: extract first character from a word */
public class PasswordMaker {
   public static String makePassword(String phrase){
      String password = "";
        Pattern pattern = Pattern.compile("\\b\\w");
        Matcher m = pattern.matcher(phrase);
        while(m.find()) {
            String firstChar = m.group();
            firstChar = firstChar.replaceAll("o|O", "0").replaceAll("i|I", "1").replaceAll("s|S", "5");
            password += firstChar;
        }

        return password;
   }
}
