package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){ return day; }
    public int getMonth(){ return month; }
    public int getYear(){ return year; }

    public void setDay(int day){
        if(day>0){this.day = day;}
        else{System.out.println("Error el dia debe ser mayor que 0");}
    }

    public void setMonth(int month){
        if(month>0){this.month = month;}
        else{System.out.println("Error el mes debe ser mayor que 0");}
    }

    public void setYear(int year){
        if(year>0){this.year = year;}
        else{System.out.println("Error el año debe ser mayor que 0");}
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String d;
        String m;

        if (day < 10) {
            d = "0" + day;
        } else {
            d = "" + day;
        }

        if (month < 10) {
            m = "0" + month;
        } else {
            m = "" + month;
        }

        return d + "/" + m + "/" + year;
    }
}
