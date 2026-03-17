package es.uah.matcomp.mp.e1.ejerciciosclases;

// Clase que representa una fecha (día, mes y año)
public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor que inicializa todos los atributos
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters: devuelven cada parte de la fecha
    public int getDay(){ return day; }
    public int getMonth(){ return month; }
    public int getYear(){ return year; }

    // Setter del día (solo permite valores > 0)
    public void setDay(int day){
        if(day>0){
            this.day = day;
        }
        else{
            System.out.println("Error el dia debe ser mayor que 0");
        }
    }

    // Setter del mes (solo permite valores > 0)
    public void setMonth(int month){
        if(month>0){
            this.month = month;
        }
        else{
            System.out.println("Error el mes debe ser mayor que 0");
        }
    }

    // Setter del año (solo permite valores > 0)
    public void setYear(int year){
        if(year>0){
            this.year = year;
        }
        else{
            System.out.println("Error el año debe ser mayor que 0");
        }
    }

    // Permite cambiar la fecha completa sin comprobaciones
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Devuelve la fecha en formato dd/mm/yyyy (añadiendo 0 si hace falta)
    public String toString() {
        String d;
        String m;

        if (day < 10) {
            d = "0" + day;   // añade 0 delante si es menor que 10
        } else {
            d = "" + day;
        }

        if (month < 10) {
            m = "0" + month; // añade 0 delante si es menor que 10
        } else {
            m = "" + month;
        }

        return d + "/" + m + "/" + year;
    }
}
