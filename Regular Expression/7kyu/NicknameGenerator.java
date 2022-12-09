//https://www.codewars.com/kata/593b1909e68ff627c9000186
class NicknameGenerator {
      public static String nickname (String name) {
        if (name.length() <= 3) return "Error: Name too short";
        String thirdChar = name.charAt(2) + "";
        if (thirdChar.matches("^[ueoaiUEAOI]$")) {
            return name.substring(0, 4);
        } else {
            return name.substring(0, 3);
        }
    }
}
