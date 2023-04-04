import java.time.Month;

public class MyDate{

    private int month;
    private int day;
    private int year;

    MyDate(int day, int month, int year){
        if(day > 0 && day <= 31){
            this.day = day;
        } else {
            throw new IllegalArgumentException ("Bad day, [ 1 - 31 ]");
        }

        if(month > 0 && month <= 12){
            this.month = month;
        } else {
            throw new IllegalArgumentException ("Bad month, [ 1 - 12 ]");
        }

        if(year >= 1990 && year <= 2050){
            this.year = year;
        } else {
            throw new IllegalArgumentException ("Bad year, [ 1990 - 2050 ]");
        }

    }

    public void setDay(int day){
        if(day > 0 && day <= 31){
            this.day = day;
        } else {
            throw new IllegalArgumentException ("Bad day, [ 1 - 31 ]");
        }
    }

    public void setMonth(int month){
        if(month > 0 && month <= 12){
            this.month = month;
        } else {
            throw new IllegalArgumentException ("Bad month, [ 1 - 12 ]");
        }
    }

    public void setYear(int year){
        if(year >= 1990 && year <= 2050){
            this.year = year;
        } else {
            throw new IllegalArgumentException ("Bad year, [ 1990 - 2050 ]");
        }
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void displayDate(){
        System.out.printf("%02d/%02d/%04d", day, month, year);
    }


}