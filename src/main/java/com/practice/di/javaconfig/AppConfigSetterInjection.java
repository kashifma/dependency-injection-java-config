package com.practice.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigSetterInjection {
    @Bean
    public HourlyNews hourlyNews() {
        HourlyNews hourlyNews = new HourlyNews();
        hourlyNews.setWeatherUpdate(weatherUpdate());
        return hourlyNews;
    }

    @Bean
    public WeatherUpdate weatherUpdate() {
        return new LocalWeatherUpdate();
        // or RestWeatherUpdate(). Just changing the class here,
        // allows to change the injected type
    }
}
