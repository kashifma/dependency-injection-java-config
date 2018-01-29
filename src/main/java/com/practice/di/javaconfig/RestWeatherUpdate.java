package com.practice.di.javaconfig;

public class RestWeatherUpdate implements WeatherUpdate {
    @Override
    public String getUpdate() {
        return "Cool and partly cloudy with 22.2 degree Celsius";
    }
}
