package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Date {
    private int day;

    private int month;
    private int year;

    public Date(){
        day=18;
        month=3;
        year=1999;
    }
    public Date(int d, int m, int y){
        day=d;
        month = m;
        year = y;

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
    public void setDay(int newDay){
        //int newDay;

        day = newDay;
    }
    public void setMonth(int newMonth){
        month = newMonth;
    }
    public void setYear(int newYear){
        year = newYear;
    }
    public void setDate(int a, int o, int e){
        day = a;
        month = o;
        year = e;
    }
    public String toString (){
        return "[" + day +'/'+month+"/"+year + "]";
    }
}
/////