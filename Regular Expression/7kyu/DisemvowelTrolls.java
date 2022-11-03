// https://www.codewars.com/kata/52fba66badcd10859f00097e
//remove all vowel from a string
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
       return str.replaceAll("u|U|e|E|o|O|a|A|i|I","");
    }
}
