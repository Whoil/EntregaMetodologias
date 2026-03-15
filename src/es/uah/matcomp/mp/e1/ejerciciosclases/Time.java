package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour= hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour){
        if(hour >= 0 & hour <= 23){
            this.hour = hour;
        } else {
            System.out.println("Error, hora inválida");
        }
    }

    public void setMinute(int minute){
        if(minute >= 0 & minute <= 59){
            this.minute = minute;
        } else {
            System.out.println("Error, minuto inválido");
        }
    }

    public void setSecond(int second){
        if(second >= 0 & second <= 59){
            this.second = second;
        } else {
            System.out.println("Error, segundo inválido");
        }
    }


    public void setTime (int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toString() {
        String h;
        String m;
        String s;

        if (hour < 10) {
            h = "0" + hour;
        } else {
            h = "" + hour;
        }

        if (minute < 10) {
            m = "0" + minute;
        } else {
            m = "" + minute;
        }

        if (second < 10) {
            s = "0" + second;
        } else {
            s = "" + second;
        }

        return h + ":" + m + ":" + s;
    }
    public Time nextSecond() {
        second+=1;
        if (second == 60) {
            second = 0;
            minute+=1;
            if (minute == 60) {
                minute = 0;
                hour+=1;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second-=1;
        if (second == -1) {
            second = 59;
            minute-=1;
            if (minute == -1) {
                minute = 59;
                hour-=1;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
