
package Zad4;

public class Time {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void addTime(Time otherTime) {
        if (this.hours + otherTime.hours >= 24) {
            this.hours = (this.hours + otherTime.hours) - 24;
        }

        if (this.minutes + otherTime.minutes > 60) {
            this.minutes = (this.minutes + otherTime.minutes) - 60;
            this.hours++;
        }
    }

    public void show() {
        System.out.println(this.hours + " " + this.minutes);
    }
}
