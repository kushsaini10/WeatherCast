package com.example.kush.weathercast;

import java.util.PriorityQueue;

/**
 * Created by saini on 27-Jul-16.
 */
public class Today {
    private String icon;
    private String summary;
    private String humidity;
    private String visibility;
    private String pressure;
    private String temprature;
    private String apparentTemperature;
    private String windSpeed;
    private String ozone;
    private String time;
    private String precipType;

    public Today(String apparentTemperature, String humidity, String icon, String ozone, String precipType,
                 String pressure, String summary, String temprature, String time, String visibility,
                 String windSpeed) {
        this.apparentTemperature = apparentTemperature;
        this.humidity = humidity;
        this.icon = icon;
        this.ozone = ozone;
        this.precipType = precipType;
        this.pressure = pressure;
        this.summary = summary;
        this.temprature = temprature;
        this.time = time;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
    }

    public Today(String temprature, String summary) {
        this.temprature = temprature;
        this.summary = summary;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
