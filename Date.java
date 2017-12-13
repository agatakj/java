/**
 *
 * @author Agata Jelen CSD 141 Fall 2017
 */
package datedemo;

public class Date {

    private String month;//to hold month
    private int day;//to hold day
    private int year; //a four digit number.

    /**
     * constructor
     * set the default values  
     */
    public Date() {
        month = "January";
        day = 1;
        year = 1000;
    }

    /**
     * constructor
     *
     * @param monthInt the number of the month of the Date
     * @param day the day of the Date
     * @param year the year of the Date
     */
    public Date(int monthInt, int day, int year) {
        setDate(monthInt, day, year);
    }

    /**
     * constructor
     *
     * @param monthString the month of the Date
     * @param day the day of the Date
     * @param year the year of the Date
     */
    public Date(String monthString, int day, int year) {
        setDate(monthString, day, year);
    }

    /**
     * constructor
     *
     * @param year the year of the Date
     */
    public Date(int year) {
        setDate(1, 1, year);
    }

    /**
     * The setDate method stores a value in the
      month, day, year fields.
     * @param monthInt The value to store in this.month
     * @param day The value to store in this.day
     * @param year The value to store in this.year
     */

    public void setDate(int monthInt, int day, int year) {
        if (dateOK(monthInt, day, year)) {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Incorrect Date");
        }
    }

    /**
     *The setDate method stores a value in the month, day, year fields.
     * @param monthString The value to store in this.month
     * @param day The value to store in this.day
     * @param year The value to store in this.year
     */
    public void setDate(String monthString, int day, int year) {
        if (dateOK(monthString, day, year)) {
            this.month = monthString;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Incorrect Date");
        }
    }

    /**
     * The setDate method stores a value in the month, day, year fields.
     * @param year The value to store in year.
     */
    public void setDate(int year) {
        setDate(1, 1, year);
    }

    /**
     * The setYear method verifyed if the variable year is within the range 1000 through 9999
     * @param year The value to store in this.year if year is within the range 1000 through 9999
     * else throw the Exception 
     */
    public void setYear(int year) {
        if ((year < 1000) || (year > 9999)) {
            throw new IllegalArgumentException("Incorrect Year " + year);
        } else {
            this.year = year;
        }
    }

    /**
     * The setMonth method verifyed if the variable monthNumber is within the range 1 through 12
     * @param monthNumber The value to store in month if month is within the range 1 through 12
     * else throw the Exception 
     */
    public void setMonth(int monthNumber) {
        if ((monthNumber <= 0) || (monthNumber > 12)) {
            throw new IllegalArgumentException("Incorrect Month Number " + year);
        }
        month = monthString(monthNumber);
    }

    /**
     * The setDay method verifyed if the variable day is within the range 1 through 31
     * @param day day The value to store in this.day if day is within the range 1 through 31
     * else throw the Exception
     */

    public void setDay(int day) {
        if ((day <= 0) || (day > 31)) {
            throw new IllegalArgumentException("Incorrect Day " + day);
        }
        this.day = day;
    }

    /**
     * The getMonth method returns a Date object's month.
     * @return The value in the month field
     */
    public int getMonth() {
        if (month.equalsIgnoreCase("January")) {
            return 1;
        } else if (month.equalsIgnoreCase("February")) {
            return 2;
        } else if (month.equalsIgnoreCase("March")) {
            return 3;
        } else if (month.equalsIgnoreCase("April")) {
            return 4;
        } else if (month.equalsIgnoreCase("May")) {
            return 5;
        } else if (month.equalsIgnoreCase("June")) {
            return 6;
        } else if (month.equalsIgnoreCase("July")) {
            return 7;
        } else if (month.equalsIgnoreCase("August")) {
            return 8;
        } else if (month.equalsIgnoreCase("September")) {
            return 9;
        } else if (month.equalsIgnoreCase("October")) {
            return 10;
        } else if (month.equalsIgnoreCase("November")) {
            return 11;
        } else if (month.equalsIgnoreCase("December")) {
            return 12;
        }
        throw new IllegalArgumentException("Incorrect Month " + month);
    }

    /**
     * The getDay method returns a Date object's day.
     * @return The value in the day field.
     */
    public int getDay() {
        return day;
    }

    /**
     * The getYear method returns a Date object's year.
     * @return The value in the year field.
     */
    public int getYear() {
        return year;
    }

    /**
     * The dateOK method verified that monthInt, dayInt, yearInt within the correct range. 
     * @param monthInt
     * @param dayInt
     * @param yearInt
     * @return the boolean true or false 
     */
    private boolean dateOK(int monthInt, int dayInt, int yearInt) {
        return ((monthInt >= 1) && (monthInt <= 12)
                && (dayInt >= 1) && (dayInt <= 31)
                && (yearInt >= 1000) && (yearInt <= 9999));
    }

    /**
     * The dateOK method verified that monthInt, dayInt, yearInt within the correct range. 
     * @param monthString
     * @param dayInt
     * @param yearInt
     * @return the boolean true or false 
     */
    private boolean dateOK(String monthString, int dayInt, int yearInt) {
        return (monthOK(monthString)
                && (dayInt >= 1) && (dayInt <= 31)
                && (yearInt >= 1000) && (yearInt <= 9999));
    }

    /**
     * The monthOK method verified the string month. 
     * @param month
     * @return the month 
     */
    private boolean monthOK(String month) {
        return (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
                || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
                || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June")
                || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
                || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
                || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December"));
    }

    /**
     * The monthString method return string name of month by the month number
     * @param monthNumber
     * @return the month 
     */
    
    private String monthString(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        throw new IllegalArgumentException("Incorrect Month number " + monthNumber);

    }

    /**
     * The format_1 method returns special format of date. 
     * @return the date in special format
     */
    public String format_1() {
        int m = getMonth();
        int d = getDay();
        int y = getYear();
        String new_format = Integer.toString(y);
        String new_year = new_format.substring(2);
        return (Integer.toString(m) + "/" + Integer.toString(d) + "/" + new_year);
    }

    /**
     * The format_2 method returns special format of date. 
     * @return the date in special format
     */
    public String format_2() {
        String m = month;
        int d = getDay();
        int y = getYear();
        return (month + " " + Integer.toString(d) + "," + getYear());
    }
//25 December 2016

    /**
     * The format_3 method returns special format of date. 
     * @return the date in special format
     */
    public String format_3() {
        String m = month;
        int d = getDay();
        int y = getYear();
        return (Integer.toString(d) + " " + month + " " + getYear());
    }

}