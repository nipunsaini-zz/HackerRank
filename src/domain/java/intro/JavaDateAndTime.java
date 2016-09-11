package domain.java.intro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        try {
            Date date = new SimpleDateFormat("yyyy MM dd").parse(String.format("%s %s %s", year, month, day));
            System.out.println(new SimpleDateFormat("EEEE").format(date).toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
