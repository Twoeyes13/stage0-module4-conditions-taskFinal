package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeapYear;
        isLeapYear = year % 4 == 0;
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0) ? true : false;

        boolean validYear = true;
        if (year < 0) validYear = false;

        if (month == 2 && isLeapYear == true && validYear == true) System.out.println("29");
        if (month == 2 && isLeapYear == false && validYear == true) System.out.println("28");

        if (month == 4 || month == 6 || month == 9 || month == 11) System.out.println("30");
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("31");
        if (month < 1 || month > 12) System.out.println("invalid date");
    }
}
