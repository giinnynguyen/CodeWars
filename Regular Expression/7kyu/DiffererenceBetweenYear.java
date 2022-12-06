// https://www.codewars.com/kata/588f5a38ec641b411200005b
// Take the years from stringDate format "YYYY/MM/DD" and calculate the difference between them.
public class DiffererenceBetweenYear {
    public static int howManyYears(String date1, String date2){
        int year1 = Integer.parseInt(date1.substring(0, 4));
        int year2 = Integer.parseInt(date2.substring(0, 4));
        return Math.abs(year1 - year2);
    }
}
