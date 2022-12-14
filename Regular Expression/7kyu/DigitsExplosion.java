// https://www.codewars.com/kata/585b1fafe08bae9988000314
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsExplosion {
  public static String explode(String digits) {
    Pattern p = Pattern.compile("\\d");
    Matcher m = p.matcher(digits);
    String result = "";
    while(m.find()) {
        int count = Integer.parseInt(m.group());
        for (int i = 0; i < count; i++) {
            result += count;
        }
    }
    return result;
  }
}
