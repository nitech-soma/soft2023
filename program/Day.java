package program;

import java.util.Calendar;

public class Day {
    private int year;
    private int month;
    private int date;

    public Day() {
        Calendar calendar = Calendar.getInstance();

        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.date = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public Day(int year) {
        this.year = year;
    }

    public Day(int year, int month) {
        this(year);
        this.month = month;
    }

    public Day(int year, int month, int date) {
        this(year, month);
        this.date = date;
    }

    public Day(Day d) {
        this(d.year, d.month, d.date);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }
}