package com.example.kush.weathercast;

/**
 * Created by saini on 26-Jul-16.
 */
public class HourlyWF {
    private String minTemp;
    private String maxTemp;

    public HourlyWF(String maxTemp, String minTemp) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }
}
