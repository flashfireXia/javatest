package org.example;

public class Timespan {
    private int hours;
    private int minutes;

    public Timespan(int hours, int minutes){
       this.hours = 0;
       this.minutes = 0;

       add(hours, minutes);
    }

    public void add(int hours, int minutes){
        if (hours < 0 || minutes < 0){
            throw new IllegalArgumentException("hours and minutes must be bigger or equal than 0.");
        }
        this.hours += hours;
        this.minutes += minutes;

        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    public String toString(){
        return hours + "h " + minutes + 'm';
    }
}
