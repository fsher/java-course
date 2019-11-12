package com.fsher.exercise2;

public class Clock {
    public static final short ONE_MINUTE_IN_SECONDS = 60;
    public static final short ONE_HOUR_IN_SECONDS = ONE_MINUTE_IN_SECONDS * 60;
    public static final short HOURS_IN_DAY = 24;
    public static final int ONE_DAY_IN_SECONDS = ONE_HOUR_IN_SECONDS * HOURS_IN_DAY;

    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
    }

    public Clock(int hours, int minutes, int seconds) {
        calculateTime(hours, minutes, seconds);
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        // Get seconds within the 24h period, if negative
        while (secondsSinceMidnight < 0) {
            secondsSinceMidnight = ONE_DAY_IN_SECONDS - Math.abs(secondsSinceMidnight);
        }

        // Build hours
        if (secondsSinceMidnight > ONE_HOUR_IN_SECONDS - 1) {
            hours = (secondsSinceMidnight / ONE_HOUR_IN_SECONDS);
            secondsSinceMidnight %= ONE_HOUR_IN_SECONDS;
        }

        // Get hours within the 24h period (0 - 23)
        while (hours > HOURS_IN_DAY - 1) {
            hours -= HOURS_IN_DAY;
        }

        // Build minutes
        if (secondsSinceMidnight > ONE_MINUTE_IN_SECONDS - 1 || secondsSinceMidnight == 0) {
            minutes = (secondsSinceMidnight / ONE_MINUTE_IN_SECONDS);
            secondsSinceMidnight %= ONE_MINUTE_IN_SECONDS;
        }

        // Apply leftover seconds
        seconds = secondsSinceMidnight;
    }

    public void tick() {
        calculateTime(hours, minutes, seconds + 1);
    }

    public void tickDown() {
        calculateTime(hours, minutes, seconds - 1);
    }

    public void addClock(Clock clock) {
        calculateTime(hours + clock.getHours(), minutes + clock.getMinutes(), seconds + clock.getSeconds());
    }

    public Clock subtractClock(Clock clock) {
        return new Clock(hours - clock.getHours(), minutes - clock.getMinutes(), seconds - clock.getSeconds());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private static String prefixTimeElement(int element) {
        return element > 9 ? Integer.toString(element) : "0" + element;
    }

    private void calculateTime(int hours, int minutes, int seconds) {
        setClock(hours * ONE_HOUR_IN_SECONDS + minutes * ONE_MINUTE_IN_SECONDS + seconds);
    }

    @Override
    public String toString() {
        return "(" + prefixTimeElement(hours) + ":" + prefixTimeElement(minutes) + ":" + prefixTimeElement(seconds) + ")";
    }
}
