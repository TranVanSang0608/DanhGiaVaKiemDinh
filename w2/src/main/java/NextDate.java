public class NextDate {
    public static int[] nextDate(int day, int month, int year) {
        int[] nextDate = new int[3];

        // Check if the current day is the last day of the month
        boolean isLastDayOfMonth = isLastDayOfMonth(day, month, year);

        if (!isLastDayOfMonth) {
            nextDate[0] = day + 1;
            nextDate[1] = month;
            nextDate[2] = year;
        } else {
            // If it is the last day of the month, move to the next month
            nextDate[0] = 1;
            nextDate[1] = incrementMonth(month);
            if(month==12){
                nextDate[2] = year+1;
            } else {
                nextDate[2] = year;
            }

        }

        return nextDate;
    }

    // Helper method to check if the year is a leap year
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Helper method to check if the given day is the last day of the month
    private static boolean isLastDayOfMonth(int day, int month, int year) {
        return day == getDaysInMonth(month, year);
    }

    // Helper method to increment the month
    private static int incrementMonth(int month) {
        return month == 12 ? 1 : month + 1;
    }

    // Helper method to get the number of days in a given month
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }

    public static void main(String[] args) {
        int[] nextDateResult = nextDate(29, 2, 2020);
        System.out.println("Next date is: " + nextDateResult[0] + "/" + nextDateResult[1] + "/" + nextDateResult[2]);
    }
}