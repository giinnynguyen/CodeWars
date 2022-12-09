// https://www.codewars.com/kata/5b39e91ee7a2c103300018b3
// remove all consecutive duplicate words from a string, leaving only first words entries
public class RemoveConsecutiveDuplicate {
    // (?i): modifier to turn on case-insensitive mode
    // replacement string $1 means "group 1" (the first group made by a set of brackets). 
    public static String removeConsecutiveDuplicates(String s){
        return s.replaceAll("(?i)\\b(\\w+)(?:\\W+\\1\\b)+", "$1");
    }
}
