// https://www.codewars.com/kata/5668e3800636a6cd6a000018
public class Ghostbusters {
  
 public static String ghostBusters(String building) {
   /* 
   . : 	Any character except line break
   * : 	The * (zero or more) is "greedy"
   \s: white space character
   */
    return building.matches(".*\\s.*") ? building.replaceAll(" ", "") : "You just wanted my autograph didn't you?";
 }
  
}
