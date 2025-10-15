package interfacee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatterUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

@FunctionalInterface
interface DateFormatter {
    void format(LocalDate date);
}


public class DateFormatUtility {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("=== OOP Style Date Formatting ===");

        String pattern1 = "dd/MM/yyyy";
        String pattern2 = "MMMM dd, yyyy";
        String pattern3 = "yyyy-MM-dd";

        System.out.println("Default Date: " + today);
        System.out.println("Format 1: " + DateFormatterUtils.formatDate(today, pattern1));
        System.out.println("Format 2: " + DateFormatterUtils.formatDate(today, pattern2));
        System.out.println("Format 3: " + DateFormatterUtils.formatDate(today, pattern3));

        System.out.println("\n=== Functional Style Date Formatting (Lambda) ===");

        DateFormatter format1 = (date) ->
                System.out.println("dd/MM/yyyy → " + DateFormatterUtils.formatDate(date, "dd/MM/yyyy"));

        DateFormatter format2 = (date) ->
                System.out.println("MMMM dd, yyyy → " + DateFormatterUtils.formatDate(date, "MMMM dd, yyyy"));

        DateFormatter format3 = (date) ->
                System.out.println("yyyy-MM-dd → " + DateFormatterUtils.formatDate(date, "yyyy-MM-dd"));

        format1.format(today);
        format2.format(today);
        format3.format(today);
    }
}

