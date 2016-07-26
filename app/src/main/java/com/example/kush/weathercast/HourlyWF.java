package com.example.kush.weathercast;

/**
 * Created by saini on 26-Jul-16.
 */
public class HourlyWF {
    private String visibility;
    private String humidity;
    private String minTemp;
    private String maxTemp;

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }


    public HourlyWF(String visibility, String humidity, String maxTemp, String minTemp) {
        this.visibility = visibility;
        this.humidity = humidity;
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
