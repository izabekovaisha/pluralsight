package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate1 = today.format(fmt1);
        System.out.println(formattedDate1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate2 = today.format(fmt2);
        System.out.println(formattedDate2);

        Date date = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm 'in GMT'");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = requiredFormat.format(date);
        System.out.println(gmtTime);

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("h:mm a 'n' dd-MMM-yyyy 'in local time zone'");
        String formattedDate4 = today.format(fmt4);
        System.out.println(formattedDate4);





    }
}
