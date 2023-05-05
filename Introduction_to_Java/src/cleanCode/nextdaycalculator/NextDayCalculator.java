package cleanCode.nextdaycalculator;

public class NextDayCalculator {
    public static String getNextDay(int day , int month, int year){
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        boolean isLeapYear = isLeapYear(year);

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return "Invalid date";
        }

        if (month == 2) {
            if (isLeapYear && day == 29) {
                nextDay = 1;
                nextMonth = 3;
            } else if (!isLeapYear && day == 28) {
                nextDay = 1;
                nextMonth = 3;
            } else {
                nextDay++;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                nextDay = 1;
                nextMonth++;
            } else {
                nextDay++;
            }
        } else {
            if (day == 31) {
                nextDay = 1;
                nextMonth = 1;
                nextYear++;
            } else {
                nextDay++;
            }
        }

        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
