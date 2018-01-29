package com.practice.di.javaconfig;

public class LocalWeatherUpdate implements WeatherUpdate {
    @Override
    public String getUpdate() {
        return "Cool and cloudy with 22 degree Celsius";
    }
}
