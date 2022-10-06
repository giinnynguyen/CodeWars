// https://www.codewars.com/kata/55ccdf1512938ce3ac000056 <br>
// check if string contain tree fiddy or 3.50
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Nessie {
    public static boolean isLockNessMonster(String s){
       Pattern p = Pattern.compile("tree fiddy|3.50");
       Matcher m = p.matcher(s);
       return m.find();
    }
}
