package JavaHackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class JavaDateandTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	//below is to do with Java 7 or before:
    	
//    	String[] dayofWeek= {"INVALID","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
//    	Calendar cal = new GregorianCalendar(year, month-1,day);
//    	int d=cal.get(Calendar.DAY_OF_WEEK);
//    	System.out.println(d);
//    	return dayofWeek[d];
    	
    	//for java versions 8 , java.time.LocalDate can be used -
    	return LocalDate.of(year, month, day).getDayOfWeek().name();
    	
    }
    public static void main(String[] args) {
		System.out.println(findDay(8,12,1989));

	}
    

}