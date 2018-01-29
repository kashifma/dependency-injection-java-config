package com.practice.di.javaconfig;

public class HourlyNews {
    private WeatherUpdate weatherUpdate;

    public HourlyNews() {}

    public HourlyNews(WeatherUpdate update) {
        weatherUpdate = update;
    }

    public void setWeatherUpdate(WeatherUpdate weatherUpdate) {
        this.weatherUpdate = weatherUpdate;
    }

    // other methods for news
}
